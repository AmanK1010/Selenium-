package org.selenium.day10;

import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args ) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		
		WebElement scroll = driver.findElement(By.xpath("//form[@id=\"enroll-form\"]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(false)", scroll);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h3[@id=\"Python-Solutions-Architect-Training\"])[4]")).click();
		WebElement scrl = driver.findElement(By.xpath("//button[@value=\"CONTACT US\"]"));
		j.executeScript("arguments[0].scrollIntoView(false)", scrl);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-target=\"#33341\"]")).click();
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(windowHandles);
		String id = l.get(1);
		driver.switchTo().window(id);
		String text = driver.findElement(By.tagName("pre")).getText();
		String[] split = text.split("-----------------");
		String[] split2 = split[1].split("2.");
		System.out.println(split2[0]);
	}

}
