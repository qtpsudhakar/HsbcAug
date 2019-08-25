@AcceptanceTests
Feature: verify Add Employee feature of OrangeHRM

  @ddt
  Scenario: Add Employee
    Given I launch the chrome browser
    And I enter OrangeHRM Url
    When I enter the username as 'admin' and password as 'admin123'
    And I click on Login button
    Then I will see the welcome page
    When I Add Employee with all details
      | selenium | hq     |
      | web      | driver |
    Then I should see employee added
    And I will the close Browser
