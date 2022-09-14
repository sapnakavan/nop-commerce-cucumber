Feature: Login Page
  As a User I want to Login on Nopcommerce Website

  Scenario: User should Navigate to LoginPage SuccessFully
    Given I am on HomePage
    When  I click on Login link
    Then  I should navigate to login page successfully and see "Welcome, Please Sign In!"


  Scenario: user should login with Invalid credentials
    Given I am on HomePage
    When  I click on Login link
    And   I enter email "alorduk@gmail.com"
    And   I enter password "z1283456"
    And   I click on login button
    Then  I can see error message

  Scenario: User Should LogIn SuccessFully With ValidCredentials
    Given I am on HomePage
    When  I click on Login link
    And   I enter email "Test124@gmail.com"
    And   I enter password "tEST1234"
    And   I click on login button
    Then  I Verify that LogOut link is display

  Scenario:User Should LogOut SuccessFully
   Given I am on HomePage
    When I click on Login link
    And  I enter email "Test124@gmail.com"
    And  I enter password "tEST1234"
    And  I click on login button
    Then I verify that Login Link is display