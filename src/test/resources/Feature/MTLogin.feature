Feature: User apply to Mercury Tour Application

 @abc2
Scenario Outline: Login Sucess
    Given user open browser and login application 
    When Logger enter firstname as "<name>" 
    And Logger enter password as "<password>"
    And Logger click on sumbit button
    Then Logger verify the login Success page 

    Examples: 
     |name | password |
     |AAAA | aaaa     |
     |BBBB | bbbb     |
     |CCCC | cccc     |
