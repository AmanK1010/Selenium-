package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonQ15 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(signin).perform();
		driver.findElement(By.xpath("(//a[text()='Start here.'])[1]")).click();
		
		driver.findElement(By.name("customerName")).sendKeys("qwerty");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("aaaa@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234565");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
