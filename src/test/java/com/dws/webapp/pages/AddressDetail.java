package com.dws.webapp.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.dws.webapp.utility.Common;

public class AddressDetail 
{
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_Company\"]")
	WebElement company;

	@FindBy(xpath = "//*[@value=\"41\"]")
	WebElement country;

	@FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
	WebElement city;

	@FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
	WebElement address1;

	@FindBy(xpath = "//*[@id=\"BillingNewAddress_Address2\"]")
	WebElement address2;

	@FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
	WebElement postalcode;

	@FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
	WebElement phoneNo;

	@FindBy(xpath = "//*[@id=\"BillingNewAddress_FaxNumber\"]")
	WebElement faxNo;

	@FindBy(xpath = "//*[@onclick=\"Billing.save()\"]")
	WebElement continueBtn;

	@FindBy(xpath = "//*[@onclick=\"Shipping.save()\"]")
	WebElement shippingAdd;

	@FindBy(xpath = "//*[@id=\"shippingoption_0\"]")
	WebElement shippingMethodAir;

	@FindBy(xpath = "//*[@onclick=\"ShippingMethod.save()\"]")
	WebElement shippingMethodContinueBtn;

	public void companyName() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Common.addressDetails();
		String com = Common.companyName;
		company.sendKeys(com);
	}

	public void countrySelect() {
		country.click();
	}

	public void cityName() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Common.addressDetails();
		String ci = Common.cityName;
		city.sendKeys(ci);
	}

	public void address1() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Common.addressDetails();
		String ad1 = Common.add1;
		address1.sendKeys(ad1);
	}

	public void address2() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Common.addressDetails();
		String ad2 = Common.add2;
		address2.sendKeys(ad2);
	}

	public void zipcode() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Common.addressDetails();
		String zi = Common.zipcode;
		postalcode.sendKeys(zi);
	}

	public void phoneNo() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Common.addressDetails();
		String no = Common.phoneNum;
		phoneNo.sendKeys(no);
	}

	public void faxNo() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Common.addressDetails();
		String no = Common.faxNum;
		faxNo.sendKeys(no);
	}

	public void contiuneButton() throws InterruptedException {
		Thread.sleep(1000);
		continueBtn.click();
	}

	public void shippingAdd() throws InterruptedException {
		Thread.sleep(1000);
		shippingAdd.click();
	}

	public void shippingMethodAir() throws InterruptedException {
		Thread.sleep(1000);
		shippingMethodAir.click();
	}

	public void shippingMeCoBtn() throws InterruptedException {
		Thread.sleep(1000);
		shippingMethodContinueBtn.click();
	}
}
