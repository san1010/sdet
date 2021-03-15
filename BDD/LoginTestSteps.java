package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	//private static final TimeUnit SECONDS = null;
	WebDriver driver;
	WebDriverWait wait;
	//FluentWait T;
	
	@Given("^User is on login page$")
	public void userIsOnLoginPage() throws Throwable{
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
		
	}
	@When("^User enters username and password$")
	public void userEntry() throws Throwable{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Then("^Read the page title and confirmation message$")
    public void readTitleAndHeading(){
		
       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
      // wait.until(ExpectedConditions.)
        //wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("action-confirmation")), "Welcome Back, admin"));
        //Read the page title and heading
        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
        
        //Print the page title and heading
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);
    }
    
    @And("^Close the Browser$")
    public void closeBrowser() throws Throwable {
        //Close browser
        driver.close();
    }
}
