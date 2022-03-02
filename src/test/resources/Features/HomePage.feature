
Feature: Admin should be able to overview home page
  Background:
    Given the user is on the login page
    When the user enters the admin information

  Scenario: Login as a Admin and overview all users
    When the user should be able to login
    And  the title contains "Popis korisnika - SPAN TT v1.0"
    Then user should be able to overview list

  Scenario: Admin should be able to use "Search" functionality on the main page
    When user should be able to search "numan2"
    Then user will see "numan2"
    And  user will see result text

  Scenario: Admin should be able to use "Filter" functionality on the main page
    Then user should be able to filter numbers with "21"
    Then user will see numbers with "21"
    And  user will see result text