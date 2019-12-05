package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectors {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.id("name")).sendKeys("waquar");
		driver.findElement(By.name("enter-name")).clear();
		driver.findElement(By.className("inputs")).sendKeys("alam");
		driver.findElement(By.name("enter-name")).clear();
		//driver.findElement(By.linkText("sign up"));
		driver.findElement(By.xpath("//*[@id='header-sign-up-btn']"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id = 'user_name']")).sendKeys("from xpath");
		driver.close();
		
	}

}
