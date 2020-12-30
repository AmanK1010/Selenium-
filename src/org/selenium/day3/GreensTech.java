package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h2[@class='title mb-0 center']")).click();
		
		driver.findElement(By.xpath("//a[@href=\"http://greenstech.in/interview-questions/cts.pdf#toolbar=0\"]")).click();
		
		
		
		
	}

}
