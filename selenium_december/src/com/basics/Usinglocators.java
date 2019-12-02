package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usinglocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://reg.ebay.com/reg/PartialReg?ru=https"
			+ "%3A%2F%2Fcommunity.ebay.com%2Ft5%2FHalf-com%2Fbd-p%2F21000000002");
	Thread.sleep(5000);

	driver.findElement(By.id("firstname")).sendKeys("waquar");
	driver.findElement(By.name("lastname")).sendKeys("alam");
	driver.findElement(By.name("email")).sendKeys("email@email.com");
	driver.findElement(By.id("PASSWORD")).sendKeys("passwor8d123");
	driver.findElement(By.className("checkbox_control")).click();
	driver.findElement(By.id("ppaFormSbtBtn")).click();
	
	}

}
