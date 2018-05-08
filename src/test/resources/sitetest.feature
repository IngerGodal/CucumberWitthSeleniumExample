# language: en
@sitetest
Feature: Reset functionality on login page of Application

  Scenario Outline: Verification of reset button with numbers of credential

    Given Open the Firefox and launch the application
    When Enter the <username> and <password>
    Then Reset the credential

  Examples:
    |username|password|
    |User1   |pass1   |
    |User2   |pass2   |
    |User3   |pass3   |
