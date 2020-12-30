package org.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartQ11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("qwerty");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123564");
		
		Thread.sleep(3000);
		String usr = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).getAttribute("value");
		System.out.println(usr);
		
		String pswrd = driver.findElement(By.xpath("//input[@type='password']")).getAttribute("value");
		System.out.println(pswrd);
		
		
		
		
		
		
	}

}
