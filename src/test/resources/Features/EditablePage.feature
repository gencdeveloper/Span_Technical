Feature: Admin should be able to create User Account with valid credential

  Background:
    Given the user is on the login page
    When the user enters the admin information

  Scenario: Login as a Admin and create new user account
    And  the title contains "Popis korisnika - SPAN TT v1.0"
    Then user should click Novi Korisnik
    Then the title contains "Novi korisnik - SPAN TT v1.0"
    Then type name and surname "gullu"
    Then type email "gullu@gmail.com"
    Then type phone number "898989321"
    Then choose role "Korisnik"
    Then type username "gulcan"
    Then type password "12345!"
    Then retype password "12345!"
    And  submit "Napravi Korisnika"


  Scenario: Login as a Admin and create new Admin account
    And  the title contains "Popis korisnika - SPAN TT v1.0"
    Then user should click Novi Korisnik
    Then the title contains "Novi korisnik - SPAN TT v1.0"
    Then type name and surname "king"
    Then type email "Admin@gmail.com"
    Then type phone number "898989321"
    Then choose role "Adminstrator"
    Then type username "boss"
    Then type password "12345!"
    Then retype password "12345!"
    And  submit "Napravi Korisnika"