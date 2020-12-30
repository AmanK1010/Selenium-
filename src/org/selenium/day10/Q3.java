package org.selenium.day10;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("ceiling fan");
		driver.findElement(By.xpath("//button[@title=\"Submit Search\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@loading=\"lazy\"])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(windowHandles);
		String id = l.get(1);
		driver.switchTo().window(id);
		driver.findElement(By.xpath("//button[text()='Smart Hub Included']")).click();
		
	}

}
