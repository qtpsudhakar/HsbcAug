@AcceptanceTests
Feature: verify Add Employee feature of OrangeHRM

	
  @ddt
  Scenario Outline: Add Employee
    Given I launch the chrome browser
    And I enter OrangeHRM Url
    When I enter the username as 'admin' and password as 'admin123'
    And I click on Login button
    Then I will see the welcome page
    When I click on PIM Link
    And I click on Add Employee link    
    Then I see Add Employee Page
    When I enter firstname and lastname as <firstname> and <lastname>
    And I click on Save button
    Then I should employee added
    And I will the close Browser

   Examples:
   |firstname|lastname|
   |selenium |hq			|
   |web			 |driver	|
   