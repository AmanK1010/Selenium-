package org.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Selenium\\driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
	}
}
