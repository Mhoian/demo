@before
Feature: Login page

  Scenario: Verify user can login with valid login and password
    Given User login as 'Default User' at Login page
    When User enter default sms-password and make submit at Login page
    Then User see title at Home page Головна

  Scenario Outline: Verify user can login with valid or invalid login and password
    Given User set login <login>
    Then User set password <password>
    And User click submit login form at Login page
    Then User can see error Невірний логін або пароль
    Examples:
      |login    | password|
      | testcom | somePassWithVeryLongValue |
      | кирилица| парольна руском           |
      | !@#$%%^ | !@#$$%%^Ввіаіа            |
      | front   | wegfwrgwrgwrg             |
      | admin   | @W2w2w2w                  |
      | manager | @W2w2w2w                  |
      | testcom | @W2w2w2w                  |

  Scenario Outline: Validation of login and password fields
    Given User set login <login>
    Then User set password <password>
    And User click submit login form at Login page
    Then User see error requrid fields Обов'язкове поле
    Examples:
      |login    | password|
      |         | somePassWithVeryLongValue |
      | testcom |                           |





