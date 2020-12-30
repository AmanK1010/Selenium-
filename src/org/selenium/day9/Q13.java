package org.selenium.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s = new Select(fruits);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
		}
		
		boolean selected = driver.findElement(By.xpath("//option[@value=\"banana\"]")).isSelected();
		System.out.println(selected);
		boolean selected1 = driver.findElement(By.xpath("//option[@value=\"banana\"]")).isSelected();
		System.out.println(selected1);
		boolean selected2 = driver.findElement(By.xpath("//option[@value=\"banana\"]")).isSelected();
		System.out.println(selected2);
		boolean selected3 = driver.findElement(By.xpath("//option[@value=\"banana\"]")).isSelected();
		System.out.println(selected3);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

}
