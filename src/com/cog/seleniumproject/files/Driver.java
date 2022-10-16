package com.cog.seleniumproject.files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver 
{
public static WebDriver returndriver(String browsertype)
{		
	  if(browsertype.equalsIgnoreCase("Chrome")) 
	  {
	  System.setProperty("webdriver.chrome.driver", "./src/chromedriver");
	  return new ChromeDriver();
	  } 
	  else
	  if(browsertype.equalsIgnoreCase("Gecko"))
	  {
	  System.setProperty("webdriver.gecko.driver", "./src/geckodriver");
	  return new FirefoxDriver();
	  }		
	  else
	  {
		  return new ChromeDriver();
	  }
}
}
