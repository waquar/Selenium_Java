package basicfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkannotations1 {
	
	  WebDriver driver;
	  
	  @BeforeTest
	  void browserset() {
		  System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Addon_Files\\java_addons\\"
		  		+ "geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://www.google.com/");
	  }
	  @Test
	  public void first() throws InterruptedException{	  
		  	  
			  driver.findElement(By.className("gLFyf")).sendKeys("7+3");
			  Thread.sleep(3000);
			  driver.findElement(By.name("btnK")).click();
			  	  
			  WebElement result =  driver.findElement(By.id("cwos"));
			  Assert.assertEquals(result.getText(), "10");
			  System.out.println("matched");
			  
	  }
}
