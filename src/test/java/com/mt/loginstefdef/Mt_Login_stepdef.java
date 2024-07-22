package com.mt.loginstefdef;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mt.webapp.utility.Common;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mt_Login_stepdef
{
	 @Given("^user open browser and login application$")
	  public void openBrowser()
	  {
		   Common.proFile();
		   System.setProperty(Common.pro.getProperty("key"),Common.pro.getProperty("value"));  
		   Common.driver = new ChromeDriver();
		   Common.driver.get("https://demo.guru99.com/test/newtours/");
		   Common.driver.manage().window().maximize();
		   Common.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		   Common.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  
	  @When("^Logger enter firstname as \"(.*)\"$")
	  public void logger_name(String un) throws InterruptedException
	  {
		 Common.driver.findElement(By.name("userName")).sendKeys(un);
	  }
	  
	  @And("^Logger enter password as \"(.*)\"$")
	  public void logger_password(String pa)
	  {
		  Common.driver.findElement(By.name("password")).sendKeys(pa);
	  }
	  
	  @And("^Logger click on sumbit button$")
	  public void logger_subBtn() throws InterruptedException
	  {
		  Common.driver.findElement(By.name("submit")).click();
		  Common.driver.navigate().back();
	  }
	  
	  @Then("^Logger verify the login Success page$")
	  public void Login_SuccessPage()
	  {
		  System.out.println("Login Successfully...!");
	  }
}
