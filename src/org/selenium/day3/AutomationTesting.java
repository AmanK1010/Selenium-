package org.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Virat");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kohli");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("UDS, Toraipakkam, Chennai");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("virat@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[text()=' Male ']")).click();
		
		driver.findElement(By.id("checkbox1")).click();
		
		WebElement w = driver.findElement(By.id("Skills"));
		
		Select s = new Select(w);
		s.selectByValue("Java");
		
		WebElement w1 = driver.findElement(By.id("countries"));
		
		Select s1 = new Select(w1);
		s1.selectByValue("India");
		
		WebElement w2 = driver.findElement(By.id("yearbox"));
		
		Select s2 = new Select(w2);
		s2.selectByValue("2000");
		
		WebElement w3 = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		
		Select s3 = new Select(w3);
		s3.selectByValue("January");
		
		WebElement w4 = driver.findElement(By.id("daybox"));
		Select s4 = new Select(w4);
		s4.selectByValue("10");
		
		driver.findElement(By.id("firstpassword")).sendKeys("Aa12345");
		
		driver.findElement(By.id("secondpassword")).sendKeys("Aa12345");
		
		driver.findElement(By.name("signup")).click();
	}

}
