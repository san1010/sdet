package myFirstPrj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	WebDriver myDriver=new FirefoxDriver();
  @Test
  public void f() {
		  WebElement img=myDriver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
		 // WebElement source=img.findElement(By.id("scr"));
		  System.out.println("Source Url is :"+img.getAttribute("src").toString());
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

//attachment-large size-large wp-post-image