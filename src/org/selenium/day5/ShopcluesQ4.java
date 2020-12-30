package org.selenium.day5;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopcluesQ4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mobile).perform();
		
		driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']")).click();
		
		//Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		
		ArrayList<String> l = new ArrayList<>(windowHandles);
		driver.switchTo().window(l.get(1));
		 driver.findElement(By.xpath("//label[@for=\"Above 5000\"]")).click();;
		
		
		
		
	}

}
