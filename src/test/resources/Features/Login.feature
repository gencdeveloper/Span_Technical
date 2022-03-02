Feature: Users should be able to login
  Background:
    Given the user is on the login page
  @wip
  Scenario: Login as a Admin
    When the user enters the admin information
    Then the user should be able to login
    And the title contains "Popis korisnika - SPAN TT v1.0"


  Scenario: Login as a User
    Given the user is on the login page
    When the user enters the custom user information
    Then the user should be able to login
    And the title contains "Popis korisnika - SPAN TT v1.0"


  Scenario: Login with custom parameter
    Given the user is on the login page
    When the user logs in using "ivan" and "98765"
    Then the user should be able to login
    And the title contains "Popis korisnika - SPAN TT v1.0"