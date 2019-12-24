package basicfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class checkannotations {
	
	WebDriver driver;         //setting driver instance variable.
	
	@BeforeClass                  //it will run once before the @before method
	void setupclass() {
		System.setProperty("webdriver.chrome.driver",  "D:\\Selenium_Addon_Files\\java_addons\\"
				+ "chromedriver_win32\\chromedriver.exe");
	}
	@AfterClass                  //it will run once after the @after method
	void teardownclass() {
		System.clearProperty("webdriver.chrome.driver");
	}

	 
	@BeforeMethod               //it will run each before executing @test
	void setupmethod() {      	 
	  driver = new ChromeDriver();	  
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	}
	
	@AfterMethod               //it will run each time after executing @test
	void teardownmethod() {
		driver.close();
	}
	
  @Test
  public void first() throws InterruptedException{	  		 
		  driver.findElement(By.className("gLFyf")).sendKeys("2+3");
		  Thread.sleep(3000);
		  driver.findElement(By.name("btnK")).click();
		  	  
		  WebElement result =  driver.findElement(By.id("cwos"));
		  Assert.assertEquals(result.getText(), "5");
		  System.out.println("matched");
		  
  }
  
  @Test
  public void second() throws InterruptedException{	  		
		  driver.findElement(By.className("gLFyf")).sendKeys("3+3");
		  Thread.sleep(3000);
		  driver.findElement(By.name("btnK")).click();
		  		  
		  WebElement result =  driver.findElement(By.id("cwos"));
		  Assert.assertEquals(result.getText(), "6");
		  System.out.println("matched");	  
  }
  
  @Test
  public void third() throws InterruptedException{	  		
		  driver.findElement(By.className("gLFyf")).sendKeys("4+3");
		  Thread.sleep(3000);
		  driver.findElement(By.name("btnK")).click();
		  		  
		  WebElement result =  driver.findElement(By.id("cwos"));
		  Assert.assertEquals(result.getText(), "7");
		  System.out.println("matched");	  
  }
  
  
}
