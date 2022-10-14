package com.cog.seleniumproject.files;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Logintest 
{
		String email="standard_user";
		String password="secret_sauce";
		String browsertype="chrome";
		String url="https://www.saucedemo.com/";
		  	
		WebDriver driver;
		@Test
		public void send()
		{
			driver.get(url);
			System.out.println("URL ="+driver.getCurrentUrl());
			
			Login lm=new Login(driver); 
			lm.setEmail(email); 
			System.out.println("Entered email");
			lm.setPassword(password);
			System.out.println("Entered password");
			lm.clickbutton();
			System.out.println("Logged in Successfully");	
		}
		@BeforeTest
		public void beforetest() 
		{
			//System.setProperty("webdriver.gecko.driver", "./src/geckodriver");		    
			//ChromeOptions options = new ChromeOptions();
		    FirefoxOptions options=new FirefoxOptions();
			//options.addArguments("headless");
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver(options);	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			         
        }
			
		@AfterTest
		public void aftertest()
		{
	        driver.close(); 
		}
}
