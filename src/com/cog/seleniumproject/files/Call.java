package com.cog.seleniumproject.files;

import org.openqa.selenium.WebDriver;

public class Call {
     String email="standard_user";
     String password="secret_sauce";
    WebDriver driver;
    public Call(WebDriver driver)
    {
    this.driver=driver;
    }
    public void call()
    {
      Login lm=new Login(driver); 
      lm.setEmail(email); 
      System.out.println("Email ="+email);
      lm.setPassword(password);
      System.out.println("Password ="+password);
      lm.clickbutton();
      System.out.println("Logged in Successfully");   
}
}
