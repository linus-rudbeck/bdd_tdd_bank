Feature: Account

  Scenario: User deposits money to the account
    Given the user balance is 150 dollars
    When user deposits 1000 dollars
    Then balance is 1150 dollars