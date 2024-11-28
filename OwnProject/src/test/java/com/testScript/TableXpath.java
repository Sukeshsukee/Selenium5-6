package com.testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableXpath {

	
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}
	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kapruka.com/");
		driver.findElement(By.xpath("//span[text()='Same day delivery']")).click();
		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr"));
		
		for(int i=0;i<table.size();i++) {
			
			String Text = table.get(i).getText();
			System.out.println(Text);
		}
		
	}
}
//