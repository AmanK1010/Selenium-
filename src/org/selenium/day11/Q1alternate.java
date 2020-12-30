package org.selenium.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1alternate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		//table/tbody/tr[1]/td[1]
		//table/tbody/tr[2]/td[1]
		List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

		System.out.println(cols.size());
		String beforexpath = "//table/tbody/tr[1]/td[";
		String afterxpath = "]";
		
		//for printing rows 1
		for (int i = 1; i <= cols.size(); i++) {
			String xpath = beforexpath+i+afterxpath;
			String row = driver.findElement(By.xpath(xpath)).getText();
			System.out.print(row+"      ");
		}
		System.out.println();
		String befxpathr2 =  "//table/tbody/tr[2]/td[";
		//for printing rows of column 2
		for (int i = 1; i <= cols.size(); i++) {
			String xpath = befxpathr2+i+afterxpath;
			String row = driver.findElement(By.xpath(xpath)).getText();
			System.out.print(row+"      ");
		}
	}

}
