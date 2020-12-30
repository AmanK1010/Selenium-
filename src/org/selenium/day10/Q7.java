package org.selenium.day10;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id=\"heading302\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Day4_ControlStatements")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(windowHandles);
		String id = l.get(1);
		driver.switchTo().window(id);
		String text = driver.findElement(By.tagName("pre")).getText();
		String[] split = text.split("------------------");
		String[] split2 = split[1].split("2.Whethe");
		System.out.println(split2[0]);
	}

}
