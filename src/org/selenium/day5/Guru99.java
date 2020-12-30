package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//li[@data-id=\"5\"]"));
		
		WebElement des = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		a.dragAndDrop(src, des).perform();
		
		WebElement src1 = driver.findElement(By.xpath(" //a[text()=' 5000']"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		a.dragAndDrop(src1, des1).perform();
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement des2 = driver.findElement(By.xpath("//ol[@id='loan']"));
		
		a.dragAndDrop(src2, des2).perform();
		
		
		WebElement des3 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		a.dragAndDrop(src1, des3).perform();
		
		
		
	}

}
