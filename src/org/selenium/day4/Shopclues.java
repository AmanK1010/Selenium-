package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopclues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("earphones");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"anchorHighlight\"])[1]")).click();
		
		
		
	}

}
