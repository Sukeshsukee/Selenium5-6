package com.testScript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Practice {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/avsukesh/Downloads/chromedriver-mac-x64/chromedriver");
	}
  @Test
  public void sample() throws InterruptedException{
	  WebDriver driver=new ChromeDriver();
		 driver.get("https://practice.expandtesting.com/upload");
		 WebElement fileupload = driver.findElement(By.id("fileInput"));
		 String file = "/Users/avsukesh/Downloads/\\#2.txt";
		 fileupload.sendKeys(file);
		 Thread.sleep(7000);
	 String s3 = new String("Welcome");
	 String s4 = new String("Welcome");
	 System.out.println(s3==s4);
	 System.out.println(s3.equals(s4));  // This will return true, since both strings have the same value.
	 System.out.println(s3==s4); //The expression s3 == s4 will return false, because s3 and s4 refer to different objects in memory.

	  }
}	

	  
	  
  
