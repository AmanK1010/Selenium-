package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechQ2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Trainer']")).click();
		
		Thread.sleep(1000);
		
		String text = driver.findElement(By.xpath("//b[contains(text(),'Velmurugan is a Test')]")).getText();
		System.out.println(text);
		
		String para = driver.findElement(By.xpath("//p[contains(text(),'He has 12+ years of total')]")).getText();
		System.out.println(para);
	}
}
