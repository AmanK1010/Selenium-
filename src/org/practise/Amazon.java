package org.practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(-1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
		List<WebElement> names = driver.findElements(By.xpath(
				"//div[@class='s-include-content-margin s-border-bottom s-latency-cf-section']//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		List<WebElement> prices = driver.findElements(By.xpath(
				"//div[@class='s-include-content-margin s-border-bottom s-latency-cf-section']//span[@class='a-price-whole']"));
		for (int i = 0; i < prices.size(); i++) {
			WebElement price = prices.get(i);
			String txtprice = price.getText();
			String replaceprice = txtprice.replace(",", "");
			int intprice = Integer.parseInt(replaceprice);
			if (intprice > 50000) {
				WebElement name = names.get(i);
				String Name = name.getText();
				System.out.println(Name);
			}

		}

	}

}
