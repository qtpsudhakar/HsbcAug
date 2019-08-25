@AcceptanceTests
Feature: verify login feture of OrangeHRM1
  @parameters
  Scenario: Validate user credintials by passing credintials
    Given I launch the chrome browser
    And I enter OrangeHRM Url
    When I enter the username as 'admin' and password as 'admin123'
    And I click on Login button
    Then I will see the welcome page
    And I will the close Browser