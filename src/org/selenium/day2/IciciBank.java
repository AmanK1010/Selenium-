package org.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		
//		driver.findElement(By.name("DUMMY1")).sendKeys("qwerty");
		
		WebElement findElement = driver.findElement(By.id("user-id-goahead"));
		findElement.click();
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("qwerty");
		driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("123456");
		
		
	}

}
