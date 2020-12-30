package org.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium\\driver\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http:/www.google.com");
		
	}

}
