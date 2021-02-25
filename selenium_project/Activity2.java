package myFirstPrj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver myDriver=new FirefoxDriver();
  @Test
  public void f() {
	  WebElement classElement=myDriver.findElement(By.cssSelector("h1.entry-title"));
	  String heading=classElement.getText();
	  Assert.assertEquals(heading, "Welcome to Alchemy Jobs");
  }
  @BeforeClass
  public void beforeClass() {
	  myDriver.get("https://alchemy.hguy.co/jobs/");
	 
  }
  
  @AfterClass
  public void afterClass() {
	  myDriver.close();
	}
  }


