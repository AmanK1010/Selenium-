package org.selenium.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CovidTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://covidindia.org/");
		driver.manage().window().maximize();
		
		//*[@id="tablepress-96"]/tbody/tr[1]/td[1]
		//*[@id="tablepress-96"]/tbody/tr[2]/td[1]
		
		//List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"tablepress-96\"]/tbody/tr"));
		//System.out.println(rows.size());
		String b4xpath = "//*[@id=\"tablepress-96\"]/tbody/tr[";
		String afxpath = "]/td[1]";
		
		
		for (int j =1 ; j <=4; j++) {
			List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"tablepress-96\"]/tbody/tr"));
			for (int i = 1; i <= rows.size(); i++) {
				String comxpath = b4xpath+i+afxpath;
				String state = driver.findElement(By.xpath(comxpath)).getText();
				System.out.println(state);
			}
			if(driver.findElement(By.xpath("//a[text()='Next']")).isEnabled()) {
				driver.findElement(By.xpath("//a[text()='Next']")).click();
			}
			
		}
		
		
		
		////*[@id="tablepress-96"]/tbody/tr[1]/td[1]
		
	}

}
