Feature: Login page functionality

  @before
  Scenario: Verify user can login with valid login and password
    Given User login as 'Default User' at Login page
    When User see sms password required widget present at Login page
    Then User see elements at Home page

  @before
   Scenario: Verify user can login with invalid login and invalid password
    Given User login as 'Invalid User' at Login page and InvalidPassword
    Then User see error message 'Invalid login or password'

  @before
  Scenario: User registration without entering username and password
    Given User enter email InvalidLogin and password InvalidPassword and make submit at Login page
    Then User see error 'Invalid login or password'