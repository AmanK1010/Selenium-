package org.selenium.day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", e);
		//j.executeScript("arguments[0].setAttribute('value','NCR')", e);
		//Thread.sleep(1000);
		Robot r = new Robot();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).click();
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	
//		Robot r = new Robot();
//		
//		for(int i=1;i<=4;i++) {
//			
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			if(i%2==0) {
//				r.keyPress(KeyEvent.VK_ENTER);
//				r.keyRelease(KeyEvent.VK_ENTER);
//			}
//		}
		
	}

}
