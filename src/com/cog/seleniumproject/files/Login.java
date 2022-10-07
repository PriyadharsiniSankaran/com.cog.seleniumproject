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
		driver.findElement(By.name("email")).sendKeys(email);;
	}
	public void setPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);;
	}

public void clickbutton(String login) 
{
driver.findElement(By.cssSelector(login)).click();
}

public void logout() {
	driver.findElement(By.cssSelector("a[href='https://www.phptravels.net/account/logout'][class=' waves-effect']")).click();
	
}

}
