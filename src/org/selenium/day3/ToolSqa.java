package org.selenium.day3;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolSqa {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("Narendra");
		
		
		driver.findElement(By.id("lastName")).sendKeys("Modi");
		
		
		driver.findElement(By.id("userEmail")).sendKeys("narendra@modi.com");
		
		
		driver.findElement(By.xpath("(//label[@class=\"custom-control-label\"])[3]")).click();
		
		
		driver.findElement(By.id("userNumber")).sendKeys("9876543210");
		
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement w = driver.findElement(By.className("react-datepicker__month-select"));
		
		Select s = new Select(w);
		s.selectByValue("9");
		
		WebElement w1 = driver.findElement(By.className("react-datepicker__year-select"));
		
		Select s1 = new Select(w1);
		s1.selectByValue("1965");
		
		driver.findElement(By.xpath("(//div[text()=\"12\"])[1]")).click();
		
		WebElement txt = driver.findElement(By.id("subjectsInput"));
		
		System.out.println(txt.isEnabled());
	
		txt.sendKeys("hindi");
		//Thread.sleep(3000);
		
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-2\"]")).click();
		
		
		
		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-3\"]")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\GREENS TECHNOLOGYS\\Desktop\\1200px-Shaqi_jrvej.jpg");
		
		driver.findElement(By.id("currentAddress")).sendKeys("UDS, Toraipakkam, Chennai");
		
		WebElement state = driver.findElement(By.xpath("//div[text()=\"Select State\"]"));
		state.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','ncr')", state);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement city = driver.findElement(By.xpath("//div[text()=\"Select City\"]"));
		
		city.click();
		
		js.executeScript("arguments[0].setAttribute('value','delhi')", city);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("submit")).click();
		
		
		
		
		
		
		
		
	}

}
