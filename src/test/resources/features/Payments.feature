@beforeWithLogin
  Feature: Payments

    Scenario: Creating a new payment in Ukraine
      Given User click on menu hryvnia operation
      When User goes to the Payments menu
      Then User click button create payment