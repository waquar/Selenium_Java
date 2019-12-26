package com.readwriteexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Addon_Files\\java_addons\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		File src = new File("D:\\selenium_java\\Excel Files\\readdata.xlsx");
		
		FileInputStream filelocation = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(filelocation);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
			String data = sheet1.getRow(1).getCell(1).getStringCellValue();			
			System.out.println(data);
		wb.close();
	
	}

}
