package org.selenium.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].value='qwerty'", user);
		
		WebElement pswrd = driver.findElement(By.xpath("//input[@id='pass']"));
		j.executeScript("arguments[0].value='12345'", pswrd);
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		j.executeScript("arguments[0].click()", login);
		
		
		
		
	}

}
