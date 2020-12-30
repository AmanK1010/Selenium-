package org.selenium.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
				
		driver.findElement(By.id("signin-block")).click();
		
		driver.findElement(By.id("hc")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
		System.out.println(driver.findElement(By.xpath("//input[@id='mobileNoInp']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='mobileNoInp']")).isEnabled());
		
		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9876543210");
	}

}
