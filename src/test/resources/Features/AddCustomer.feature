#Author: your.email@your.domain.com
@regression
Feature: Creating a new customer

Background:
    And User click on add customer button


  Scenario: Add Customer
    When User filling up all the details
    And User click on submit button
    Then User will be displayed customer ID is generated

@smoke @regression
  Scenario: Add Customer with 1dim list
    When User filling up all the details with one dim list
      | java | selenium | js@gmail.com | lan | 24544323455 |
    And User click on submit button
    Then User will be displayed customer ID is generated

  Scenario: Add Customer with 1dim map
    When User filling up all the details with one dim map
      | Fname   | karthi          |
      | Lname   | rajan           |
      | mail    | rajan@gmail.com |
      | address | thanjavur       |
      | phno    |        78986555 |
    And User click on submit button
    Then User will be displayed customer ID is generated

  Scenario: Add Customer with 2dim list
    When User filling up all the details with two dim list
      | java   | selenium | js@gmail.com | lan     | 24544323455 |
      | karthi | rajan    | js@gmail.com | lan     | 24544323455 |
      | ajith  | kumar    | js@gmail.com | tanjore | 24544323455 |
      | lokesh | csg      | js@gmail.com | lan     | 24544323455 |
    And User click on submit button
    Then User will be displayed customer ID is generated

  Scenario: Add Customer with 2dim map
    When User filling up all the details with two dim map
      | FirstN | LastN    | Mail         | Addr    | Phno        |
      | java   | selenium | js@gmail.com | lan     | 24544323455 |
      | karthi | rajan    | js@gmail.com | lan     | 24544323455 |
      | ajith  | kumar    | js@gmail.com | tanjore | 24544323455 |
      | lokesh | csg      | js@gmail.com | lan     | 24544323455 |
    And User click on submit button
    Then User will be displayed customer ID is generated
    
    
    Scenario Outline:
    When User filling up all the details "<FirstN>","<LastN>","<Mail>","<Addr>","<Phno>"
    And User click on submit button
    Then User will be displayed customer ID is generated
    
    Examples:
      | FirstN | LastN    | Mail         | Addr    | Phno        |
      | java   | selenium | js@gmail.com | lan     | 24544323455 |
      | karthi | rajan    | js@gmail.com | lan     | 24544323455 |
      | ajith  | kumar    | js@gmail.com | tanjore | 24544323455 |
      | lokesh | csg      | js@gmail.com | lan     | 24544323455 |
    
    
