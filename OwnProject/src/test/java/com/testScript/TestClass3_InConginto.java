package com.testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestClass3_InConginto {

	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}

	@Test 
	public void open() {
		ChromeOptions cp = new ChromeOptions();
		ChromeOptions icMode = cp.addArguments("--incognito");
		
		
		WebDriver driver=new ChromeDriver(icMode);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=Dpbfz1kWDws");
		
}
}