package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']")).click();
		
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		
		
		driver.switchTo().frame("loginIframe");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();
	}

}
