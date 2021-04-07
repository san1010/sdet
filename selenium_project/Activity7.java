package myFirstPrj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@BeforeMethod
	public void beforeMethod() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs/");
	}

	@Test
	public void findJobMenu() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		// Locate the navigation menu and click the menu item that says “Post a Job”
		driver.findElement(By.xpath("//a[contains(text(),'Post a Job')]")).click();

		// Sign in
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button']"))).click();

		// Enter Username and Password
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_login']")))
				.sendKeys("root");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");

		// Click on Login
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='wp-submit']"))).click();

		// Fill in the necessary details and click the button that says “Preview

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='job_title']")))
				.sendKeys("Test Lead");
		driver.findElement(By.xpath("//input[@id='job_location']")).sendKeys("India");
		
		Select JobType = new Select(driver.findElement(By.name("job_type")));
		JobType.selectByVisibleText("Full Time");

		driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("PFA details for job");
		driver.switchTo().defaultContent();
		// Switch to parent class
		driver.switchTo().defaultContent();

		driver.findElement(By.name("submit_job")).click();

		driver.findElement(By.id("job_preview_submit_button")).click();
		
		//Submit and verify

		System.out.println(driver.findElement(By.xpath(".//div[contains(@class, 'entry-content')]")).getText());
		driver.findElement(By.xpath(".//div[contains(@class, 'entry-content')]/a[contains(text(), 'click here')]"))
				.click();

	}
	  
	  @AfterMethod public void tearDown()  { 
		  //Close the browser 
		  driver.quit(); }
	  }
	
