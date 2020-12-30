package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechQ5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Overview']")).click();
		
		
		Thread.sleep(1000);
		
		String txt = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies Selenium training')]")).getText();
		System.out.println(txt);
	}

}
