package basicfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",  "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.google.com");
	  driver.findElement(By.className("gLFyf")).sendKeys("2+3");
	  Thread.sleep(3000);
	  driver.findElement(By.name("btnK")).click();
	  
	  
	  WebElement result =  driver.findElement(By.id("cwos"));
	  Assert.assertEquals(result.getText(), "5");
	  System.out.println("matched");
	  
	  
	  
  }
}
