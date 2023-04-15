package com.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project {
	
	public static WebDriver driver; 
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.edubridgeindia.com/login");
			
	}
	@Test
    public void linkText() {
		
	}
	
	@Test
	public void userName() {
	   WebElement user=driver.findElement(By.xpath("//*[@input='email']"));
	   user.sendKeys("shilpapatil0311@gmail.com");
	   String exp="shilpapatil0311@gmail.com";
	   String act=user.getText();
	   Assert.assertEquals(act, exp);
	}
	
	@Test
	public void password() {
	   WebElement user=driver.findElement(By.xpath("//*[@input='password']"));
	   user.sendKeys("Nitish@130592");
	   String exp="Nitish@130592";
	   String act=user.getText();
	   Assert.assertEquals(act, exp);
	}
	
	
	
	
	@AfterTest
	 public void tearDown() {
		System.out.println("program was completed");
		 
		 
		 
		 
		 
	 }
}
