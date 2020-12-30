package org.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.day9.string;

public class RedbusCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();

		String date = "31-Oct-2021";
		String[] datesplit = date.split("-");
		String day = datesplit[0];
		String month = datesplit[1];
		String year = datesplit[2];
		String mnthYear = month + " " + year;

		// *[@id="rb-calendar_onward_cal"]/table/tbody/tr[1]/td[2]

		// WebElement nextBtn = driver.findElement(By.xpath("//td[@class='next']"));

		for (int i = 1; i <= 12; i++) {
			String monthAndYear = driver
					.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
			if (monthAndYear.equals((mnthYear))) {
				break;
			}
			try {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
			}

		}
		//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[3]/td[7]
		//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[4]/td[1]
		//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[5]/td[1]
		//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[3]/td[7]
		//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[7]/td[3]
		
		String bXpath = "//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[";
		String mXpath = "]/td[";
		boolean flag=false;
		
		for (int row = 3; row <=8; row++) {
			for (int col = 1; col <=7; col++) {
				String da = driver.findElement(By.xpath(bXpath+row+mXpath+col+"]")).getText();
				if(da.equals(day)) {
					driver.findElement(By.xpath(bXpath+row+mXpath+col+"]")).click();
					flag=true;
					break;
				}
				
			}
			if(flag) {
				break;
			}
			
		}
		
		
	}
}
