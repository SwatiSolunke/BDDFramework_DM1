package com.mt.webapp.stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.mt.webapp.pages.Login;
import com.mt.webapp.pages.Register;
import com.mt.webapp.utility.Common;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mt_StepDef 
{
  @Given("^open browser and able to access register page$")
  public void openBrowser()
  {
	   Common.proFile();
	   System.setProperty(Common.pro.getProperty("key"),Common.pro.getProperty("value"));  
	   Common.driver = new ChromeDriver();
	   Common.driver.get(Common.pro.getProperty("url"));
	   Common.driver.manage().window().maximize();
	   Common.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	   Common.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @When("^User enter firstname as$")
  public void F_name()
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_fname();
  }
  
  @And("^User enter lastname as$")
  public void L_name()
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_lname();
  }

  @And("^User enter phone number as$")
  public void Phone_no()
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_phone();
  }
  
  @And("^User enter email as$")
  public void E_mail()
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_email();
  }
  
  @And("^User enter address as$")
  public void Add() throws InterruptedException
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_addr();
  }
  
  @And("^User enter city as$")
  public void City() throws InterruptedException
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_city();
  }
  
  @And("^User enter state as$")
  public void State() throws InterruptedException
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_state();
  }
  
  @And("^User enter postalcode as$")
  public void p_code() throws InterruptedException
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_pcode();
  }
  
  @And("^User select Country as$")
  public void country() throws InterruptedException
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_country();
  }
  
  @And("^User enter username as$")
  public void u_name() throws InterruptedException
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_name();
  }
  
  @And("^User enter password as$")
  public void pass() throws InterruptedException
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_password();
  }
  
  @And("^User enter confirm password as$")
  public void con_pass() throws InterruptedException
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.user_conpassword();
  }
  
  @And("^User click submit button$")
  public void sumbitBtn() throws InterruptedException, IOException
  {
	  Register reg = PageFactory.initElements(Common.driver, Register.class);
	  reg.submit_btn();
	  
	  Common.screenshot();
  }
  
  @Then("^User able access register success page$")
  public void reg_Successpage()
  {
	  Common.log.info("Register Successfully...!");
  }
  
  
  //Login
  @Given("^register success then user login application$")
  public void signOff() throws InterruptedException
  {
	   Login lo = PageFactory.initElements(Common.driver, Login.class);
	   lo.user_signoff();
  }
  
  @When("^Loger enter firstname as$")
  public void logger_name() throws InterruptedException
  {
	  Login lo = PageFactory.initElements(Common.driver, Login.class);
	  lo.logger_name();
  }
  
  @And("^Logger enter password as$")
  public void logger_password()
  {
	  Login lo = PageFactory.initElements(Common.driver, Login.class);
	  lo.logger_passw();
  }
  
  @And("^Logger click on sumbit button$")
  public void logger_subBtn() throws InterruptedException, IOException
  {
	  Login lo = PageFactory.initElements(Common.driver, Login.class);
	  lo.sub_btn();
	  
	  Common.screenshot();
  }
   
  @Then("^Logger verify the login Success page$")
  public void Login_SuccessPage()
  {
	  Common.log.info("Login Successfully...!");
  }
}
