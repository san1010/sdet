package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	WebDriver mydriver;
  @BeforeMethod
  public void beforeMethod() {
	mydriver = new FirefoxDriver();
	mydriver.get("https://www.training-support.net");
  }
  @Test
  public void f() {
	  //mydriver.g.get(https://www.training-support.net);
	  String title = mydriver.getTitle();
	  System.out.println("Page title is: " + title);
	  
	  Assert.assertEquals("Training Support", title);
	  mydriver.findElement(By.id("about-link")).click();
	  System.out.println("New page title is: " + mydriver.getTitle());
	  Assert.assertEquals(mydriver.getTitle(), "About Training Support");
  }
  @AfterMethod
  public void afterMethod() {
	  mydriver.quit();
  }

}
