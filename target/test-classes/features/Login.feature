@before
Feature: Login page functionality

  Scenario: Verify user can login with valid login and password
    Given User login as 'Default User' at Login page
    When User enter default sms-password and make submit at Login page
    Then User see title at Home page Головна


  Scenario Outline: Verify user can login with invalid login and invalid password
    Given User set login <login>
    Then User set password <password>
    And User click submit login form at Login page
    And User can see error Невірний логін або пароль
    Examples:
      |login    | password|
      | testcom | somePassWithVeryLongValue |
      | кирилица| парольна руском           |
