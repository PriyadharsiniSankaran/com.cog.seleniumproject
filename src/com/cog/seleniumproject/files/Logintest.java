package com.cog.seleniumproject.files;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Logintest 
{
		String email="agent@phptravels.com";
		String password="demoagent";
		String login="button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']";
		String browsertype="chrome";
		String url="https://phptravels.net/login";		
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
			  lm.clickbutton(login);
			  System.out.println("Logged in Successfully");	
		}
		@BeforeTest
		public void beforetest() throws MalformedURLException
		{
 System.setProperty("webdriver.chrome.driver", "./src/chromedriver");
 ChromeOptions options = new ChromeOptions();
 options.setBinary("./src/chromedriver");
 //options.addArguments("headless");



			 driver= new ChromeDriver();	
			 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			}
		@AfterTest
		public void aftertest()
		{
	        driver.close(); 
		}
}
