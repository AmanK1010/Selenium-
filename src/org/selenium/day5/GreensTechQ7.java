package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTechQ7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//div[text()='Courses ']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(courses).perform();;
		WebElement oracle = driver.findElement(By.xpath("//div[@title='Oracle']"));
		a.moveToElement(oracle).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Oracle SQL and P')]")).click();
		
	}

}
