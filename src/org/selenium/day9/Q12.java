package org.selenium.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		Select s = new Select(fruits);
		List<WebElement> options = s.getOptions();
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int count= options.size()-allSelectedOptions.size();
		

		for (int i = 0; i < options.size(); i++) {
			
			if ((i+1)%2==0) {
				String text = options.get(i).getText();
				System.out.println(text);
			}
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
