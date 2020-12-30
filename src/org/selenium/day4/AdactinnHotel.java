package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinnHotel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("qwerty");
		
		driver.findElement(By.id("password")).sendKeys("12345");
		
		String username = driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(username);
		
		String pswrd = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(pswrd);
	}

}
