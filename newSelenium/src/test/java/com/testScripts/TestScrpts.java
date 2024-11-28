package com.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScrpts {
	
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}
	
	@Test
	public void general() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/@AmazonDashCart");
		
	}

}
