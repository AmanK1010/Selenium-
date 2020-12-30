package org.selenium.day10;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id=\"heading304\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' JUNIT']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(windowHandles);
		String id = l.get(1);
		driver.switchTo().window(id);
		String text = driver.findElement(By.tagName("pre")).getText();
		String[] split = text.split("-----------------");
		String string = split[1];
		String[] split2 = string.split("2. What");
		System.out.println(split2[0]);
		
	}

}
