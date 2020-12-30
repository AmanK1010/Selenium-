package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealQ14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement wm = driver.findElement(By.xpath("(//span[text()=\"Women's Fashion\"])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(wm).perform();
		driver.findElement(By.xpath("(//span[text()=\"Footwear\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Heels']")).click();
		
		
		
		
		
		
		
	}

}
