package org.selenium.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Virat");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Virat");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("v@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Toraipakkam");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("440030");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345");
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select s = new Select(country);
		List<WebElement> options = s.getOptions();
		for (WebElement e : options) {
			String c = e.getAttribute("value");
			System.out.println(c);
			
		}
		
		s.selectByValue("INDIA");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		
		
		
		
		
		
		
	}

}
