package org.selenium.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].value='vignesh655'", user);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		j.executeScript("arguments[0].value='oneplus3'", pass);
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		j.executeScript("arguments[0].click()", login);
	}

}
