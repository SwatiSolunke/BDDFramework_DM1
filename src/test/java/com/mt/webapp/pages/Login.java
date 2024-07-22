package com.mt.webapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mt.webapp.utility.Common;

public class Login
{
   @FindBy(linkText  = "SIGN-OFF")
   WebElement signOff;
   
   @FindBy(name = "userName")
   WebElement username;
   
   @FindBy(name = "password")
   WebElement password;
   
   @FindBy(name = "submit")
   WebElement submit;
   
   public void user_signoff() throws InterruptedException
   {
	   Thread.sleep(1000);
	   signOff.click(); 
   }
   
   public void logger_name() throws InterruptedException
   {
	   Thread.sleep(1000);
	   Common.dtPojo();
	   username.sendKeys(Common.dt.getUsername());
   }
   
   public void logger_passw()
   {
	   Common.dtPojo();
	   password.sendKeys(Common.dt.getPassword());
   }
   
   public void sub_btn() throws InterruptedException
   {
	   Thread.sleep(1000);
	   submit.click();
   }
}
