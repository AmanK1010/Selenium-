package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement mb = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(mb).perform();
		
		driver.findElement(By.xpath("//span[text()='New Launches Covers']")).click();
		
	}

}
