package com.cog.seleniumproject.files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver)
	{
	this.driver=driver;
	}
	
	public void setEmail(String email) {
		driver.findElement(By.id("user-name")).sendKeys(email);;
	}
	public void setPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);;
	}

public void clickbutton() 
{
driver.findElement(By.id("login-button")).click();
}
public void logout() {
	driver.findElement(By.cssSelector("a[href='https://www.phptravels.net/account/logout'][class=' waves-effect']")).click();	
}
}
