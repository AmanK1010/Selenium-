package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.id("email")).sendKeys("qwerty");
		 
		 driver.findElement(By.id("pass")).sendKeys("12345");
		
		
		
	}

}
