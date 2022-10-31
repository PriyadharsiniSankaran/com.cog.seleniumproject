package com.cog.seleniumproject.files;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Logintest 
{
		String url="https://7westmedia--selenium.sandbox.my.salesforce.com/";		  	
		WebDriver driver;
		@Test
		public void send()
		{
		    try {
			driver.get(url);
			  Call call = new Call(driver);
		      call.call();
		    }
		    catch(Exception e)
		    {
		        e.printStackTrace();
		    }
		}
		
		@BeforeTest
		public void beforetest() 
		{
            //FirefoxOptions options=new FirefoxOptions();
           // options.setHeadless(true);
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();    
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));             
        }		
		@AfterTest
		public void aftertest()
		{
	        driver.close(); 
	        LoginChrome log=new LoginChrome();
            log.beforetest();
            log.send();
            log.aftertest();
		}
}
