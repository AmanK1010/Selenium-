package org.selenium.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		
		WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].value='vignesh655@gmail.com'", user);
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		j.executeScript("arguments[0].value='12345'", pass);
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		j.executeScript("arguments[0].click()", login);
	}

}
