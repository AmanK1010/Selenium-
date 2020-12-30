package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("UdS, Toraipakkam, Chennai");
		
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("aman@gmail.com");
		
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9876543210");
		
		driver.findElement(By.id("firstpassword")).sendKeys("12345");
		driver.findElement(By.id("secondpassword")).sendKeys("12345");
	}

}
