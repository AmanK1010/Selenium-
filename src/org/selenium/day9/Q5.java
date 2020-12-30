package org.selenium.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		
		for (WebElement e : options) {
			String date = e.getAttribute("value");
			int num = Integer.parseInt(date);
			if (num%2==0) {
				System.out.println(num);
				
			}
		}
		
		
		
	}

}
