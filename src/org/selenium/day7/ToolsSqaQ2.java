package org.selenium.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsSqaQ2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement des = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		j.executeScript("arguments[0].scrollIntoView(true)", des);
		Thread.sleep(1000);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File sc = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Selenium\\Screenshots\\Q2.png");
		FileUtils.copyFile(sc, dest);
		
	}

}
