package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/ \r\n");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("qwerty");
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		
		String email = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(email);
		
		String pswrd = driver.findElement(By.id("pass")).getAttribute("value");
		System.out.println(pswrd);
		
	}

}
