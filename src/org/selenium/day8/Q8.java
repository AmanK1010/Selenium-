package org.selenium.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='DUMMY1']")).click();
		driver.findElement(By.xpath("//input[@title='User Id']")).sendKeys("qwerty");
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("12345");
		driver.findElement(By.xpath("(//input[@title='Log In'])[1]")).click();
		
	}

	
	
}
