package org.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchFireFox {
 
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Selenium\\driver\\IEDriverServer.exe");
		//launch greens tech site
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		//launch facebook
		WebDriver driver1 = new InternetExplorerDriver();
		driver1.get("http://demo.automationtesting.in/Register.html");
		
		//launch amazon
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("https://www.amazon.in");
		
		//launch greenstech
		WebDriver driver3 = new InternetExplorerDriver();
		driver3.get("http://greenstech.in/selenium-course-content.html");
	
	}
}
