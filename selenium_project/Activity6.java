package myFirstPrj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver ajDriver=new FirefoxDriver();
	
	  @Test
	  public void f() throws Exception {
		  
		  WebElement nBar=ajDriver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a"));
		
		  WebDriverWait wait = new WebDriverWait(ajDriver, 20); 
		  wait.until(ExpectedConditions.visibilityOf(nBar));
		  nBar.click();
		  
		  System.out.println(" clicked jobs ");  
		  
		  WebElement sk=ajDriver.findElement(By.id("search_keywords"));
		  sk.sendKeys("test");
		  WebElement searchJobs=ajDriver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input"));
		  searchJobs.click();
		  Thread.sleep(1000);
		  ajDriver.findElement(By.xpath("//ul[@class='job_listings']/li//a")).click();
		 // WebElement job=ajDriver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li/a/div[1]/h3"));
		 // job.click();
	  }
	  @BeforeClass
	  public void beforeClass() {
		  ajDriver.get("https://alchemy.hguy.co/jobs/");
	  }

	  @AfterClass
	  public void afterClass() {
		  ajDriver.close();
	  }
}
