package org.practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitEx {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get(" http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	
	
	Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
	wait.until(ExpectedConditions.alertIsPresent());
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
