package Xpathsecrets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://in.ebay.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("waquar");;
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
