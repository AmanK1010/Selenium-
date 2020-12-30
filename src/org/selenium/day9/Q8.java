package org.selenium.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vignesh655");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("oneplus3");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(loc);
		s.selectByValue("Los Angeles");
		
		WebElement hot = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(hot);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(room);
		s2.selectByValue("Super Deluxe");
		
		WebElement roomno = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(roomno);
		s3.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Azar");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Khan");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("secretariat, Salem");
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234567891234567");
		
		WebElement card = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s4 = new Select(card);
		s4.selectByValue("AMEX");
		
		WebElement mon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s5 = new Select(mon);
		s5.selectByValue("1");
		

		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s6 = new Select(year);
		s6.selectByValue("2020");
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		Thread.sleep(5000);
		String order = driver.findElement(By.xpath("//input[@name='order_no']")).getAttribute("value");
		System.out.println(order);
		
	}

}
