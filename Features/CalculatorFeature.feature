Feature: Calculator
  As a user
  I want to use a calculator for the calculation process
  So that I don't need to calculate it manually

  Scenario: Add two numbers 10 and 20
    Given I have a calculator
    When I add 10 and 20
    Then the result should be 30

  Scenario: Subtract 100 by 50
    Given I have a calculator
    When I subtract 100 by 50
    Then the result should be 50

  Scenario Outline: Multiply <a> by <b>
    Given I have a calculator
    When I multiply <a> by <b>
    Then the result should be <total>

  Examples:
    | a | b | total |
    | 2 | 4 | 8 |
    | 5 | 10 | 50 |
    | 6 | 100 | 600|

  Scenario: Divide 50 by 5
    Given I have a calculator
    When I divide 50 by 5
    Then the result should be 10