package org.selenium.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggesttextbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("fac");
		Thread.sleep(1000);
		List<WebElement> text = driver.findElements(By.xpath("//li[@class=\"sbct\"]"));
		System.out.println(text.size());
		for (WebElement e : text) {
			System.out.println(e.getText());
		}
	}

}
