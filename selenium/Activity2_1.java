package seleniumActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://www.training-support.net");
		
		System.out.println("Title of the page is "+ driver.getTitle());
		
		System.out.println("id-> "+ driver.findElement(By.id("about-link")).getText());
		
		
		System.out.println("Classname -> "+ driver.findElement(By.className("green")).getText());
		
		System.out.println("By LinkText ->"+driver.findElement(By.linkText("About Us")).getText());
		
		System.out.println("By CSSSelector ->"+driver.findElement(By.cssSelector(".green")).getText());
		
		//Close the browser
		driver.close();
	}

}
