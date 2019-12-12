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

public class usingdataprovidefromotherclass {
	
	WebDriver driver;

	@BeforeClass                  
	void setupclass() {
		System.setProperty("webdriver.chrome.driver",  "D:\\Selenium_Addon_Files\\java_addons\\"
				+ "chromedriver_win32\\chromedriver.exe");
	}
	
	@AfterClass                
	void teardownclass() {
		System.clearProperty("webdriver.chrome.driver");
		  
	}
 
	@BeforeMethod               
	void setupmethod() {      	 
	  driver = new ChromeDriver();	  
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	}
	
	@AfterMethod               
	void teardownmethod() {
		driver.close();
	}
	
	
  @Test(dataProvider = "datahere", dataProviderClass = Dataproviderhere.class)  //calling dataprovider class
  public void first(String input, String expected) throws InterruptedException{	  		 
		  driver.findElement(By.className("gLFyf")).sendKeys(input);
		  Thread.sleep(3000);
		  driver.findElement(By.name("btnK")).click();
		  	  
		  WebElement result =  driver.findElement(By.id("cwos"));
		  Assert.assertEquals(result.getText(), expected);
  
  }
  
	
 }
