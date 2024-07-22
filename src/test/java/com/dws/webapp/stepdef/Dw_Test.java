package com.dws.webapp.stepdef;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.dws.webapp.pages.AddToCard;
import com.dws.webapp.pages.AddressDetail;
import com.dws.webapp.pages.Log_Out_In;
import com.dws.webapp.pages.PaymentDetails;
import com.dws.webapp.pages.Register;
import com.dws.webapp.utility.Common;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dw_Test 
{
	@Given("^User open the browser and register webapp application$")
	public void openBrowser() throws IOException {
		Common.proFile();
		System.setProperty(Common.pro.getProperty("key"), Common.pro.getProperty("value"));
		Common.driver = new ChromeDriver();
		Common.driver.get(Common.pro.getProperty("url"));
		Common.driver.manage().window().maximize();
	}

	@When("^User select a gender as$")
	public void selectGender() {
		Register rg = PageFactory.initElements(Common.driver, Register.class);
		rg.selectGender();
	}

	@And("^User enter firstname as$")
	public void firstName() throws IOException {
		Register rg = PageFactory.initElements(Common.driver, Register.class);
		rg.fname();
	}

	@And("^User enter lastname as$")
	public void lastName() throws IOException {
		Register rg = PageFactory.initElements(Common.driver, Register.class);
		rg.lname();
	}

	@And("^User enter email as$")
	public void email() {
		Register rg = PageFactory.initElements(Common.driver, Register.class);
		rg.email();
	}

	@And("^User enter password as$")
	public void password() {
		Register rg = PageFactory.initElements(Common.driver, Register.class);
		rg.password();
	}

	@And("^User enter confirm password as$")
	public void confirmPassword() {
		Register rg = PageFactory.initElements(Common.driver, Register.class);
		rg.confirmPassword();
	}

	@And("^User click on register button$")
	public void registerButton() throws InterruptedException {
		Register rg = PageFactory.initElements(Common.driver, Register.class);
		rg.registerButton();
	}

	@Then("^User verify register success page$")
	public void registerSucessPage() {
		Common.log.info("Register Success..!!!");
	}

	// LogOut
	@Given("^Register success then log out link avilable$")
	public void LogOutPage() {
		Common.log.info("Log Out Page...!!");
	}

	@When("^User click on logout hyperlink$")
	public void LogOut() throws InterruptedException {
		Log_Out_In lg = PageFactory.initElements(Common.driver, Log_Out_In.class);
		lg.logout();
	}

	@And("^User click on login hyperlink$")
	public void LogIn() throws InterruptedException {
		Log_Out_In lg = PageFactory.initElements(Common.driver, Log_Out_In.class);
		lg.login();
	}

	@And("^User enter loger email as$")
	public void logeremail() {
		Log_Out_In lg = PageFactory.initElements(Common.driver, Log_Out_In.class);
		lg.email();
	}

	@And("^User enter loger password as$")
	public void logerpassword() {
		Log_Out_In lg = PageFactory.initElements(Common.driver, Log_Out_In.class);
		lg.password();
	}

	@And("^User click on remember me checkbox$")
	public void rememberCheckbox() throws InterruptedException {
		Log_Out_In lg = PageFactory.initElements(Common.driver, Log_Out_In.class);
		lg.checkbox();
	}

	@And("^User click on login button$")
	public void LoginButton() throws InterruptedException {
		Log_Out_In lg = PageFactory.initElements(Common.driver, Log_Out_In.class);
		lg.loginBtn();
	}

	@Then("^User verify login success page$")
	public void loginpage() {
		Common.log.info("Login Success Page...!!");
		JavascriptExecutor js = (JavascriptExecutor) Common.driver;
		js.executeScript("scrollBy(0,300)");
	}

	// Add To Card
	@Given("^login success then add produt page avilable$")
	public void addtocartpage() {
		Common.log.info("Add a Product page..!!");
	}

	@When("^User add one product$")
	public void addProcut() throws InterruptedException {
		AddToCard ad = PageFactory.initElements(Common.driver, AddToCard.class);
		ad.addtocart();
	}

	@And("^User select HDD$")
	public void selectHDD() throws InterruptedException {
		AddToCard ad = PageFactory.initElements(Common.driver, AddToCard.class);
		ad.hdd();
	}

	@And("^User select OS$")
	public void selectOS() throws InterruptedException {
		AddToCard ad = PageFactory.initElements(Common.driver, AddToCard.class);
		ad.os();
	}

	@And("^User select software$")
	public void software() throws InterruptedException {
		AddToCard ad = PageFactory.initElements(Common.driver, AddToCard.class);
		ad.software();
	}

	@And("^User click on addtocart button$")
	public void clickAddtocartBtn() throws InterruptedException {
		AddToCard ad = PageFactory.initElements(Common.driver, AddToCard.class);
		ad.addtocardBtn();
	}

	@And("^User click on shopping cart$")
	public void shoppingCartlink() throws InterruptedException {
		AddToCard ad = PageFactory.initElements(Common.driver, AddToCard.class);
		ad.shoppingCart();
	}

	@And("^User select country$")
	public void selectCountry() throws InterruptedException {
		AddToCard ad = PageFactory.initElements(Common.driver, AddToCard.class);
		ad.selectCountry();
	}

	@And("^User click on term and condition checkbox$")
	public void Conditioncheckbox() {
		AddToCard ad = PageFactory.initElements(Common.driver, AddToCard.class);
		ad.agreeterm();
	}

	@And("^User click on check out button$")
	public void checkoutBtn() throws InterruptedException {
		AddToCard ad = PageFactory.initElements(Common.driver, AddToCard.class);
		ad.checkoutBtn();
	}

	@Then("^User verify product add successfully$")
	public void addproductpage() {
		Common.log.info("Add product Successfully..!!");
	}
	// Address Details

	@Given("^product add successfully then user enter the address details$")
	public void AddressDetails() {
		Common.log.info("Address Details page Open");
	}

	@When("^User enter company name as$")
	public void companyName() throws IOException, InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.companyName();
	}

	@And("^User select country as$")
	public void selectCountry1() {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.countrySelect();
	}

	@And("^User enter city name as$")
	public void cityname() throws InterruptedException, IOException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.cityName();
	}

	@And("^User enter address1 as$")
	public void address1() throws IOException, InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.address1();
	}

	@And("^User enter address2 as$")
	public void address2() throws IOException, InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.address2();
	}

	@And("^User enter postalCode as$")
	public void postalcode() throws IOException, InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.zipcode();
	}

	@And("^User enter phone number as$")
	public void phonenumber() throws IOException, InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.phoneNo();
	}

	@And("^User enter fax number as$")
	public void faxnumber() throws IOException, InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.faxNo();
	}

	@And("^User click on continue button$")
	public void continyButton() throws InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.contiuneButton();
	}

	@And("^User click on shipping address continue button$")
	public void shippingadd() throws InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.shippingAdd();
	}

	@And("^User click on shipping method air continue button$")
	public void shippingmethod() throws InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.shippingMethodAir();
	}

	@And("^User click on shipping method continue button$")
	public void shippinme() throws InterruptedException {
		AddressDetail ad = PageFactory.initElements(Common.driver, AddressDetail.class);
		ad.shippingMeCoBtn();
	}

	@Then("^User verfiy address details sumbitted successfully$")
	public void addresssucess() {
		Common.log.info("Address Details Add Successfully..!!");
	}

	// Payment Details
	@Given("^User fulfill a payment details$")
	public void paymentDetails() {
		Common.log.info("User fullfill payment details");
	}

	@When("User select a delivery order mode$")
	public void paymentMode() throws InterruptedException {
		PaymentDetails pd = PageFactory.initElements(Common.driver, PaymentDetails.class);
		pd.paymentMode();
	}

	@And("^User click on payment method$")
	public void paymentMethod() throws InterruptedException {
		PaymentDetails pd = PageFactory.initElements(Common.driver, PaymentDetails.class);
		pd.paymentMethod();
	}

	@And("^User click on payment info$")
	public void paymentInfo() throws InterruptedException {
		PaymentDetails pd = PageFactory.initElements(Common.driver, PaymentDetails.class);
		pd.paymentInfo();
	}

	@And("^User click on confirm order button$")
	public void confirmOrder() throws InterruptedException {
		PaymentDetails pd = PageFactory.initElements(Common.driver, PaymentDetails.class);
		pd.confirmOrder();
	}

	@And("^User get the order number$")
	public void getOrder() throws InterruptedException {
		PaymentDetails pd = PageFactory.initElements(Common.driver, PaymentDetails.class);
		pd.getOrder();
	}

	@Then("^User successfully order a product$")
	public void orderSuccess() {
		Common.log.info("Order Successfully..!");
	}
}
