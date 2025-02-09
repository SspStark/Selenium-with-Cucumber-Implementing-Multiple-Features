Feature: Login Functionality
  As a user of the E-commerce application
  I want to be able to login in to my account
  So that I can access personalized features and make purchases

  Scenario: Successful Login
    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    Then I should be redirected to the home page