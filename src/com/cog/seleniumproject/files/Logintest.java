package com.cog.seleniumproject.files;
import org.openqa.selenium.WebDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
public class Logintest {
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "./src/chromedriver");	
		//System.setProperty("webdriver.gecko.driver", "./src/geckodriver");
		String email="agent@phptravels.com";
		String password="demoagent";
		String login="button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']";
		String browsertype="chrome";
		String url="https://phptravels.net/login";	
		WebDriver driver=Driver.returndriver(browsertype);
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
        Login lm=new Login(driver);
        lm.setEmail(email);
        lm.setPassword(password);
        driver.close();  
	}

}
