package com.cog.seleniumproject.files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginChrome {
    String url="https://www.saucedemo.com/";     
    WebDriver driver;
    @Test
    public void send()
    {
        driver.get(url);
        Call call = new Call(driver);
        call.call();
    }
    @BeforeTest
    public void beforetest() 
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--no-sandbox");
        chromeoptions.addArguments("--disable-dev-shm-usage"); 
        chromeoptions.setHeadless(true);
        driver= new ChromeDriver(chromeoptions);       
    }       
    @AfterTest
    public void aftertest()
    {
    
        driver.close(); 
    }

}
