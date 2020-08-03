#Author: your.email@your.domain.com
Feature: Creating a new customer
 

  Scenario: Add Customer
    Given User launch telecom site
    And User click on add customer button
    When User filling up all the details
    And User click on submit button
    Then User will be displayed customer ID is generated


 