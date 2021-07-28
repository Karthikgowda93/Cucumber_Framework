Feature: Login to Bank site

  Scenario: Home Page login
    Given The user is on NetBanking page
    When The user login using username  "King" and password "retjkel"
    Then Home page gets populated
    And The account information shown is "true"



  Scenario: Home Page login
    Given The user is on NetBanking page
    When The user login using username  "Karthik" and password "sdfgdjl"
    Then Home page gets populated
    And The account information shown is "false"