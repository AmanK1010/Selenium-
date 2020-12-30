package org.selenium.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone x");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		WebElement target = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/614pJ9ailxL._AC_UY218_.jpg']"));
		Actions a = new Actions(driver);
		//Thread.sleep(2000);
		//a.moveToElement(target);
		a.contextClick(target).perform();
		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(windowHandles);
		
		String id = l.get(1);
		driver.switchTo().window(id);
		String text = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getText();
		System.out.println(text);
	}

}
