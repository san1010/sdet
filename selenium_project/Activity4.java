package myFirstPrj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity4 {
	WebDriver myDriver=new FirefoxDriver();
	  @Test
	  public void f() {
			  WebElement secondTitle=myDriver.findElement(By.xpath("//*[@id=\"post-16\"]/div/h2"));
			 String heading=secondTitle.getText();
			 System.out.println("I found second heading - "+ heading);
			 Assert.assertEquals(heading, "Quia quis non");
			  
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
