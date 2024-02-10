Feature: conduit Home

  Scenario Outline: Conduit Home
    Given he user is on the page
    When the user enter the credentials in the excel <row>
    Then the user could see his name

    Examples:
    |row|
    | 1 |
    | 2 |
    | 3 |