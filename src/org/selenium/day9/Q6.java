package org.selenium.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement countries = driver.findElement(By.xpath("//select[@name='country']"));
		Select s = new Select(countries);
		List<WebElement> options = s.getOptions();
		
		for (WebElement e : options) {
			String c = e.getText();
			System.out.println(c);
		}
		
	}

}
