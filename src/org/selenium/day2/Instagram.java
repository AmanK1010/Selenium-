package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("qwerty");
		driver.findElement(By.name("password")).sendKeys("123456");
	}

}
