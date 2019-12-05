package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://html.com/input-type-file/");
	driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\waqua\\Desktop\\djhw.txt");
	//dont click on browse button.

	}

}
