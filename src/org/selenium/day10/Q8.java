package org.selenium.day10;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"inputValEnter\"]")).sendKeys("hand sanitizer");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class=\"product-image \"])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(windowHandles);
		String id = l.get(1);
		driver.switchTo().window(id);
		driver.findElement(By.xpath("(//div[@id=\"add-cart-button-id\"])[1]")).click();
		
		
		
	}

}
