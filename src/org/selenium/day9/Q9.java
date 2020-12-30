package org.selenium.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vignesh655");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("oneplus3");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		WebElement room = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s = new Select(room);
		List<WebElement> options = s.getOptions();
		
		for (WebElement e : options) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
