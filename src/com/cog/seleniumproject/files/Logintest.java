package com.cog.seleniumproject.files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./src/chromedriver");	
		String email="agent@phptravels.com";
		String password="demoagent";
		String login="button[class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']";
		String browsertype="chrome";
		String url="https://phptravels.net/login";	
		WebDriver driver=Driver.returndriver(browsertype);
		driver.get(url);
        Login lm=new Login(driver);
        lm.setEmail(email);
        lm.setPassword(password);
        lm.clickbutton(login);
        //lm.logout();
       //lm.logout("a[href='https://www.phptravels.net/account/logout'][class='dropdown-item waves-effect']");
        //driver.close();  
	}

}
