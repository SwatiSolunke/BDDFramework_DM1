package com.dws.webapp.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dws.webapp.utility.Common;

public class Register 
{
	@FindBy(xpath = "//input[@id='gender-female']")
	WebElement gender;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement fname;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lname;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement confirmpassword;

	@FindBy(xpath = "//input[@id='register-button']")
	WebElement registerBtn;

	public void selectGender() {
		gender.click();
	}

	public void fname() throws IOException {
		Common.proFile();
		fname.sendKeys(Common.pro.getProperty("firstname"));
	}

	public void lname() throws IOException {
		Common.proFile();
		lname.sendKeys(Common.pro.getProperty("lastname"));
	}

	public void email() {
		Common.userData();
		email.sendKeys(Common.dt.getEmail());
	}

	public void password() {
		Common.userData();
		password.sendKeys(Common.dt.getPassword());
	}

	public void confirmPassword() {
		Common.userData();
		confirmpassword.sendKeys(Common.dt.getPassword());
	}

	public void registerButton() throws InterruptedException {
		Thread.sleep(1000);
		registerBtn.click();
	}
}
