package com.mt.webapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mt.webapp.utility.Common;

public class Register 
{
   @FindBy(name = "firstName")
   WebElement firstname;
   
   @FindBy(name = "lastName")
   WebElement lastname;
   
   @FindBy(name = "phone")
   WebElement phone;
   
   @FindBy(name = "userName")
   WebElement email;
   
   @FindBy(name = "address1")
   WebElement address;
   
   @FindBy(name = "city")
   WebElement city;
   
   @FindBy(name = "state")
   WebElement state;
   
   @FindBy(name = "postalCode")
   WebElement postalCode;
   
   @FindBy(css = "[value='INDIA']")
   WebElement country;
   
   @FindBy(id = "email")
   WebElement username;
   
   @FindBy(name = "password")
   WebElement password;
   
   @FindBy(name = "confirmPassword")
   WebElement conPassword;
   
   @FindBy(name = "submit")
   WebElement submitBtn;
   
   public void user_fname()
   {
	   Common.proFile();
	   firstname.sendKeys(Common.pro.getProperty("firstname"));     
   }
   
   public void user_lname()
   {
	   Common.proFile();
	   lastname.sendKeys(Common.pro.getProperty("lastname"));
   }
   
   public void user_phone()
   {
	   Common.proFile();
	   phone.sendKeys(Common.pro.getProperty("phone"));
   }
   
   public void user_email()
   {
	   Common.proFile();
	   email.sendKeys(Common.pro.getProperty("email"));	
   }
   
   public void user_addr() throws InterruptedException
   {
	   Thread.sleep(1000);
	   Common.regxlsx();
	   String add = Common.addr;
	   address.sendKeys(add);
   }
   
   public void user_city()
   {
	   Common.regxlsx();
	   String ci = Common.city;
	   city.sendKeys(ci);
   }
   
   public void user_state()
   {
	   Common.regxlsx();
	   String sta = Common.state;
	   state.sendKeys(sta);
   }
   
   public void user_pcode()
   {
	   Common.regxlsx();
	   String pcode = Common.pcode;  
	   postalCode.sendKeys(pcode);
   }
   
   public void user_country()
   {
	   country.click(); 
   }
   
   public void user_name() throws InterruptedException
   {
	   Common.dtPojo();
	   Thread.sleep(1000);
	   username.sendKeys(Common.dt.getUsername());
   }
   
   public void user_password()
   {
	   Common.dtPojo();
	   password.sendKeys(Common.dt.getPassword());   
   }
   
   public void user_conpassword()
   {
	   Common.dtPojo();
	   conPassword.sendKeys(Common.dt.getPassword());
   }
   
   public void submit_btn() throws InterruptedException
   {
	   Thread.sleep(1000);
	   submitBtn.click();
   }
}
