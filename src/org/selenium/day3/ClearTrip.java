package org.selenium.day3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("from_station")).sendKeys("Chennai Beach (MSB)");
		Thread.sleep(10000);
		try {
		
		driver.findElement(By.xpath("(//a[@id='close'])[1]")).click();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease((KeyEvent.VK_ENTER));
		
		driver.findElement(By.id("to_station")).sendKeys("Tiruchchirapali (TPJ)");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease((KeyEvent.VK_ENTER));
	}
}
