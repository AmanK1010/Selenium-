package org.practise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUsingJs {
	static WebDriver  driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement calender = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		chooseDateUsingJs("28-Feb-2021", calender);
		System.out.println(getInnerTextUsingJs());
		//displayAlertWithMessage("this is user defined alert");
		highlightElementAndTakeScreenshot(calender, "cal");
		
		
	}

	public static void chooseDateUsingJs(String date, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+date+"')", element);
	}
	
	public static String getInnerTextUsingJs() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String pageTxt = js.executeScript("return document.documentElement.innerText;").toString();
		return pageTxt;
	}
	
	public static void displayAlertWithMessage(String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public static void highlightElementAndTakeScreenshot(WebElement element, String filename) throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium\\Selenium\\ScreenShot\\"+filename+".png"));
		
	}
	
	
	
	
}
