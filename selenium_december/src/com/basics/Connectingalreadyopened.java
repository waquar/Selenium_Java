package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Connectingalreadyopened {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Change chrome driver path accordingly
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
		WebDriver driver = new ChromeDriver(options);
		System.out.println(driver.getTitle());
		
//		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https"
//				+ "%3A%2F%2Fcommunity.ebay.com%2Ft5%2FHalf-com%2Fbd-p%2F21000000002");

	
		driver.findElement(By.id("firstname")).sendKeys("waquar");
		driver.findElement(By.name("lastname")).sendKeys("alam");
		driver.findElement(By.name("email")).sendKeys("email@email.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("passwor8d123");
		Thread.sleep(5000);
		driver.findElement(By.className("checkbox_control")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ppaFormSbtBtn")).click();

	}

}
