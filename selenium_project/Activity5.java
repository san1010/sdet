package myFirstPrj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver ajDriver=new FirefoxDriver();
	
  @Test
  public void f() {
	  //WebElement nBar=ajDriver.findElement(By.className("menu-toggle main-header-menu-toggle ast-mobile-menu-buttons-minimal"));
	  WebElement nBar=ajDriver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a"));
	  //WebElement nBar=ajDriver.findElement(By.)
	  ////*[@id="masthead"]/div/div/div/div/div[2]/div/button/span[2]
	  WebDriverWait wait = new WebDriverWait(ajDriver, 20); 
	  wait.until(ExpectedConditions.visibilityOf(nBar));
	  nBar.click();
	  System.out.println(" clicked jobs ");
	  //WebElement siteDes=ajDriver.findElement(By.xpath("//p[@class=site-description]"));
	  ///html/body/div/header/div/div/div/div/div[1]/div/div/p
	  WebElement siteDes=ajDriver.findElement(By.cssSelector("h1.entry-title"));
	  Assert.assertEquals(siteDes.getText(), "Jobs");
	  System.out.println("Title of the page is "+ ajDriver.getTitle().toString());
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
