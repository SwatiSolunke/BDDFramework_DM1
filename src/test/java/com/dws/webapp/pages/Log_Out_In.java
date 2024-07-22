package com.dws.webapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dws.webapp.utility.Common;

public class Log_Out_In
{
	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement logout;

	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement login;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='RememberMe']")
	WebElement rememberCheckbox;

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginBtn;

	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		logout.click();
	}

	public void login() throws InterruptedException {
		Thread.sleep(1000);
		login.click();
	}

	public void email() {
		Common.userData();
		email.sendKeys(Common.dt.getEmail());
	}

	public void password() {
		Common.userData();
		password.sendKeys(Common.dt.getPassword());
	}

	public void checkbox() throws InterruptedException {
		Thread.sleep(1000);
		rememberCheckbox.click();
	}

	public void loginBtn() throws InterruptedException {
		Thread.sleep(1000);
		loginBtn.click();
	}
}
