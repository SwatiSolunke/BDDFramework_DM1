package com.dws.webapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dws.webapp.utility.Common;

public class PaymentDetails
{
	@FindBy(xpath = "//*[@id=\"paymentmethod_0\"]")
	WebElement CashonDelivery;

	@FindBy(xpath = "//*[@onclick=\"PaymentMethod.save()\"]")
	WebElement PaymentMethod;

	@FindBy(xpath = "//*[@onclick=\"PaymentInfo.save()\"]")
	WebElement PaymentInfo;

	@FindBy(xpath = "//*[@onclick=\"ConfirmOrder.save()\"]")
	WebElement ConfirmOrder;

	@FindBy(xpath = "//ul[@class='details']")
	WebElement OrderNum;

	public void paymentMode() throws InterruptedException {
		Thread.sleep(1000);
		CashonDelivery.click();
	}

	public void paymentMethod() throws InterruptedException {
		Thread.sleep(500);
		PaymentMethod.click();
	}

	public void paymentInfo() throws InterruptedException {
		Thread.sleep(500);
		PaymentInfo.click();
	}

	public void confirmOrder() throws InterruptedException {
		Thread.sleep(1000);
		ConfirmOrder.click();
	}

	public void getOrder() throws InterruptedException {
		Thread.sleep(500);
		String order = OrderNum.getText();
		Common.log.info(order);
	}
}
