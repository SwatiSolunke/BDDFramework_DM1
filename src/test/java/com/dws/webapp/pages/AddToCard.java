package com.dws.webapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCard 
{
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[5]/div/div[2]/div[3]/div[2]/input")
	WebElement addtocartlink;

	@FindBy(xpath = "//*[@id=\"product_attribute_16_3_6_19\"]")
	WebElement HDD;

	@FindBy(xpath = "//*[@id=\"product_attribute_16_4_7_21\"]")
	WebElement OS;

	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/dl/dd[5]/ul/li[3]/label")
	WebElement software;

	@FindBy(xpath = "//*[@id=\"add-to-cart-button-16\"]")
	WebElement addToCardButton;

	@FindBy(linkText = "Shopping cart")
	WebElement shoppingCartlink;

	@FindBy(xpath = "//option[@value='41']")
	WebElement Country;

	@FindBy(xpath = "//*[@id=\"termsofservice\"]")
	WebElement agreeTerms;

	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement checkOutBtn;

	public void addtocart() throws InterruptedException {
		Thread.sleep(1000);
		addtocartlink.click();
	}

	public void hdd() throws InterruptedException {
		Thread.sleep(1000);
		HDD.click();
	}

	public void os() {
		OS.click();
	}

	public void software() throws InterruptedException {
		Thread.sleep(1000);
		software.click();
	}

	public void addtocardBtn() throws InterruptedException {
		Thread.sleep(1000);
		addToCardButton.click();
	}

	public void shoppingCart() throws InterruptedException {
		Thread.sleep(2000);
		shoppingCartlink.click();
	}

	public void selectCountry() throws InterruptedException {
		Thread.sleep(1000);
		Country.click();
	}

	public void agreeterm() {
		agreeTerms.click();
	}

	public void checkoutBtn() throws InterruptedException {
		Thread.sleep(1000);
		checkOutBtn.click();
	}
}
