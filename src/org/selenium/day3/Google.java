package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Narendra");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Modi");
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("modi18558");
		
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("113!asdQQ");
		
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("113!asdQQ");
		
		driver.findElement(By.xpath("(//button[@jsname='LgbsSe'])[2]")).click();
		
		
		
		
		
		
		
	}

}
