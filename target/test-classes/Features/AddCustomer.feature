#Author: your.email@your.domain.com
Feature: Creating a new customer

  Scenario: Add Customer
    Given User launch telecom site
    And User click on add customer button
    When User filling up all the details
    And User click on submit button
    Then User will be displayed customer ID is generated

  Scenario: Add Customer with 1dim list
    Given User launch telecom site
    And User click on add customer button
    When User filling up all the details with one dim list
      | java | selenium | js@gmail.com | lan | 24544323455 |
    And User click on submit button
    Then User will be displayed customer ID is generated

  Scenario: Add Customer with 1dim map
    Given User launch telecom site
    And User click on add customer button
    When User filling up all the details with one dim map
      | Fname   | karthi          |
      | Lname   | rajan           |
      | mail    | rajan@gmail.com |
      | address | thanjavur       |
      | phno    |        78986555 |
    And User click on submit button
    Then User will be displayed customer ID is generated
