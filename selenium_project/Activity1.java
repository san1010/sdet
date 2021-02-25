package myFirstPrj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver myDriver=new FirefoxDriver();
	@BeforeClass
	public void initialise() {
		
		myDriver.get("https://alchemy.hguy.co/jobs/");
	}
	@AfterClass
	public void deInitialise() {
		myDriver.close();
	}
  @Test
  public void f() {
	  
	  String title =myDriver.getTitle();
	  System.out.println("Title of the page is "+ title);
	  Assert.assertEquals(title, "Alchemy Jobs – Job Board Application");
	  
  }
}
