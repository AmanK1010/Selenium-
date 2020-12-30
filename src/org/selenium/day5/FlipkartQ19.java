package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartQ19 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement w = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a = new Actions(driver);
		a.moveToElement(w).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Realme']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(text(),'Realme Narzo 20 (G')])[1]")).click();
	}

}
