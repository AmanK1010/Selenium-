package org.selenium.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		//tbody/tr[1]/td[1]
		//tbody/tr[2]/td[1]
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		System.out.println(rows.size());
		String bxpath = "//tbody/tr[";
		String axpath = "]/td[1]";
		for (int i = 1; i <= rows.size(); i++) {
			String xpath = bxpath+i+axpath;
			String row = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(row);
		}
		
		
	}

}
