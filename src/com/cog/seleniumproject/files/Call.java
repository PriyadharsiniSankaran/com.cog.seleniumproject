package com.cog.seleniumproject.files;

import org.openqa.selenium.WebDriver;

public class Call {
    String email="priyadharsini.sankaran@swm.selenium";
    String password="Tomygirl17";
    WebDriver driver;
    public Call(WebDriver driver)
    {
    this.driver=driver;
    }
    public void call()
    {
      Login lm=new Login(driver); 
      lm.setEmail(email); 
      System.out.println("Email is printed");
      lm.setPassword(password);
      System.out.println("Password is printed");
      lm.clickbutton();
      System.out.println("Logged in Successfully");   
}
}
