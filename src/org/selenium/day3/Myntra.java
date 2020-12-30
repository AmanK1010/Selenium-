package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
	}

}
