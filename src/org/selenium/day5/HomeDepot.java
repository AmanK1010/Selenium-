package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement dept = driver.findElement(By.xpath("//a[text()='All Departments']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(dept).perform();
		
		WebElement paint = driver.findElement(By.xpath("//*[text()='Paint']"));
		a.moveToElement(paint).perform();
		Thread.sleep(2000);
		WebElement inter = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(inter).perform();
		
		driver.findElement(By.xpath("//a[text()='Ceiling Paint']")).click();
		
	}

}
