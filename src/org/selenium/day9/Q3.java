package org.selenium.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s = new Select(year);
		List<WebElement> options = s.getOptions();
		for (WebElement e : options) {
			String a = e.getAttribute("value");
			System.out.println(a);
		
		}
	}

}
