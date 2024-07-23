Feature: Logout Functionality
  As a user of the e-commerce website
  I want to be able to logout of my account
  So that I can log in when I desire

  Scenario: Successful Logout

    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    And I click on the logout button of the home page
    Then I should be redirected to the login page