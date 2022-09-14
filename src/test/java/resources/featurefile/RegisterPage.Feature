Feature: Register Page Functionality

  Background: I am on home page


  Scenario: verify user should navigate to register page successfully
    When I click on register link
    Then I navigated to register text page


  Scenario: verify that firstname lastname email password confirm password are required
    When I click on register link
    Then I click on register button
    And I got an error messageFirst name is required
    And I got an error message Last name is required
    And I got an error message email is required
    And I got an error message password is required
    And I got an error message confirm password is required


  Scenario Outline: verify user can register successfully
    When I click on register link
    And I select gender "<gen>"
    And I enter firstname "<name>"
    And I enter lastname "<lastname>"
    And I enter email "<email>"
    And I enter password  "<pass>"
    And I enter confirm pass  "<cpass>"
    Then I click on register button
    And I can see a message registration complete

    Examples:
      | gen  | name  | lastname | email            | pass   | cpass  |
      | female | SAPNA | Patel    | xyz123@gmail.com | abc123 | abc123 |