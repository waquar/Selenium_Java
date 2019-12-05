
//we are using alert js handler to handle alerts using alert class.

package com.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();;
		Alert  alert = driver.switchTo().alert();
		String text = alert.getText();
		
		if (text.equals("Hello , share this practice page and share your knowledge")) {
			System.out.println("matched!!");
			alert.accept();
		}
		else {
			System.out.println("text not matched.");
		}

		driver.close();
	
	}

}
