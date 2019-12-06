package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeswitch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://learn.letskodeit.com/p/practice");
		Thread.sleep(5000);
		
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(2000);
		System.out.println("reachediframe");
		
		driver.findElement(By.className("course-listing-title")).click();
		Thread.sleep(5000);
		System.out.println("clicked content of iframe");
		
		driver.close();
		

	}

}
