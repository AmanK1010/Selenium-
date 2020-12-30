package org.selenium.day10;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("iphone 7");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(windowHandles);
		String id = l.get(1);
		driver.switchTo().window(id);
		driver.findElement(By.xpath("//div[@id=\"add-cart-button-id\"]")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("(//span[@class=\"price\"])[2]")).getText();
		System.out.println(text);
		
		
		
	}

}
