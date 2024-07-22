Feature: User can apply Demo Webshop Application

  @abc1
  Scenario: Register Success
    Given User open the browser and register webapp application
    When User select a gender as
    And User enter firstname as
    And User enter lastname as
    And User enter password as
    And User enter email as
    And User enter confirm password as
    And User click on register button
    Then User verify register success page
    
  @abc2
  Scenario: LogIn Success
  Given Register success then log out link avilable
  When User click on logout hyperlink
  And User click on login hyperlink
  And User enter loger email as
  And User enter loger password as
  And User click on remember me checkbox
  And User click on login button
  Then User verify login success page
  
  @abc3
  Scenario: Product Add Success
  Given login success then add produt page avilable
  When User add one product 
  And User select HDD
  And User select OS
  And User select software
  And User click on addtocart button
  And User click on shopping cart
  And User select country
  And User click on term and condition checkbox
  And User click on check out button
  Then User verify product add successfully
  
  @abc4
  Scenario: Address Details
  Given product add successfully then user enter the address details
  When User enter company name as
  And User select country as
  And User enter city name as
  And User enter address1 as
  And User enter address2 as
  And User enter postalCode as
  And User enter phone number as
  And User enter fax number as
  And User click on continue button
  And User click on shipping address continue button
  And User click on shipping method air continue button
  And User click on shipping method continue button
  Then User verfiy address details sumbitted successfully
  
  @abc5
  Scenario: Payment Details
  Given User fulfill a payment details
  When User select a delivery order mode
  And User click on payment method 
  And User click on payment info
  And User click on confirm order button
  And User get the order number
  Then User successfully order a product
  
  
