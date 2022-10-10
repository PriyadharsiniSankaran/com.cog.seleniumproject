package com.cog.seleniumproject.files;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Logintest {

		//System.setProperty("webdriver.chrome.driver", "./src/chromedriver");	
		//System.setProperty("webdriver.gecko.driver", "./src/geckodriver");
		String email="agent@phptravels.com";
		String password="demoagent";
		String login="button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']";
		String browsertype="chrome";
		String url="https://phptravels.net/login";		
		WebDriver driver;
     /*   Login lm=new Login(driver);
        lm.setEmail(email);
        lm.setPassword(password);*/
		@Test
		public void send()
		{
		driver.get(url);
		System.out.println("URL ="+driver.getCurrentUrl());
		}
		@BeforeTest
		public void beforetest()
		{
			 System.setProperty("webdriver.chrome.driver", "./src/chromedriver");
			  driver= new ChromeDriver();
		}
		@AfterTest
		public void aftertest()
		{
	        driver.close(); 
		}
}
