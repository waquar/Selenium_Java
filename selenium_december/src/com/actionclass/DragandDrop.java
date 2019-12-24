package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://www.spicejet.com");
		Thread.sleep(3000);
		
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame("demo-farme");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement
		(driver.findElement(By.id("droppable"))).release().build().perform();
		
		System.out.println("done!");
		
	}

}
