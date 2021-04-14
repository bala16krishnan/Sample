package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceMaven {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\BALAKRISHNAN\\eclipse-workspace\\SampleMaven\\drivers\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			WebElement btnClick = driver.findElement(By.id("uploadfile"));
			
			btnClick.click();
		}
	}

