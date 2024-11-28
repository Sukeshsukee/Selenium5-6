package com.testScripts;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class New_Locators {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}
	
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//div[normalize-space() =\"EN\"]/following-sibling::span"));
		WebElement elem = driver.findElement(RelativeLocator.with(By.xpath("//div[text()='EN']")).toLeftOf(ele));
		Actions a=new Actions(driver);
		a.moveToElement(elem).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='nav-text']/child::i)[4]")).click();
		
	
	}

}

