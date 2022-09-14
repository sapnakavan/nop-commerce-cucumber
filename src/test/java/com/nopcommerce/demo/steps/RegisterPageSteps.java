package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I navigated to register text page$")
    public void iNavigatedToRegisterTextPage() {
        new RegisterPage().getRegisterText();
    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^I got an error messageFirst name is required$")
    public void iGotAnErrorMessageFirstNameIsRequired() {
        new  RegisterPage().getValidationErrorMessageForField("FirstName");
    }

    @And("^I got an error message Last name is required$")
    public void iGotAnErrorMessageLastNameIsRequired() {
        new RegisterPage().getValidationErrorMessageForField("LastName");
    }

    @And("^I got an error message email is required$")
    public void iGotAnErrorMessageEmailIsRequired() {
        new RegisterPage().getValidationErrorMessageForField("Email");
    }

    @And("^I got an error message password is required$")
    public void iGotAnErrorMessagePasswordIsRequired() {
        new RegisterPage().getValidationErrorMessageForField("Password");
    }

    @And("^I got an error message confirm password is required$")
    public void iGotAnErrorMessageConfirmPasswordIsRequired() {
        new RegisterPage().getValidationErrorMessageForField("ConfirmPassword");
    }

    @And("^I select gender \"([^\"]*)\"$")
    public void iSelectGender(String gender) {
      new RegisterPage().selectGender(gender);
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String name) {
      new RegisterPage().enterFirstName(name);
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastname) {
        new RegisterPage().enterLastName(lastname);

    }

    @And("^I enter password  \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
      new RegisterPage().enterPassword(password);
    }

    @And("^I enter confirm pass  \"([^\"]*)\"$")
    public void iEnterConfirmPass(String confirmpassword) {
     new RegisterPage().enterConfirmPassword(confirmpassword);
    }

    @And("^I can see a message registration complete$")
    public void iCanSeeAMessageRegistrationComplete() {
        new RegisterPage().getYourRegCompletedText();
    }
}
