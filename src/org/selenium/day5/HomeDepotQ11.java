package org.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepotQ11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement dept = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(dept).perform();
		
		WebElement hc = driver.findElement(By.xpath("(//a[@title=\"Heating & Cooling\"])[1]"));
		a.moveToElement(hc).perform();
		
		WebElement ac = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
		a.moveToElement(ac).perform();
		
		driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']")).click();
		
		
		
	}

}
