#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: User apply to Mercury Tour Application

@abc1  
Scenario: Register Sucess
    Given open browser and able to access register page
    When User enter firstname as
    And User enter lastname as
    And User enter phone number as
    And User enter email as
    And User enter address as
    And User enter city as
    And User enter state as
    And User enter postalcode as
    And User select Country as
    And User enter username as
    And User enter password as
    And User enter confirm password as
    And User click submit button 
    Then User able access register success page

@abc2
Scenario Outline: Login Sucess
    Given register success then user login application 
    When Loger enter firstname as
    And Logger enter password as 
    And Logger click on sumbit button
    Then Logger verify the login Success page 

     
      
