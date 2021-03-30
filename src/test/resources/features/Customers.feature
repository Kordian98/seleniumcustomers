Feature: Customers

  Scenario: Rows are filtered correctly by name
    Given User on customers main page
    When User set search column select as "Name"
    And User fills search input with "Alabaster"
    Then 1 rows displayed

  Scenario: Match case mechanism works properly
    Given User on customers main page
    And User set search column select as "Name"
    And User fills search input with "alabaster"
    And 1 rows displayed
    When User clicks on match case checkbox
    Then 0 rows displayed

  Scenario Outline: It is possible to search customer with every filter
    Given User on customers main page
    When User set search column select as "<column name>"
    And User fills search input with "<value>"
    Then 1 rows displayed


    Examples:
      | column name | value                |
      | Name        | Postimex             |
      | Email       | office@alabaster.com |
      | Id          | 2                    |
      | City        | Belfast              |
