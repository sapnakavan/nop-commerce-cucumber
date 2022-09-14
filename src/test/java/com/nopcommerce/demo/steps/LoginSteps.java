package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully and see \"([^\"]*)\"$")
    public void iShouldNavigateToLoginPageSuccessfullyAndSee(String mess) {
        Assert.assertEquals(mess, new LoginPage().getWelcomeText());

    }


    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @Then("^I can see error message$")
    public void i_can_see_error_message() {
        String actualText = new RegisterPage().getErrorMessage();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("^I Verify that LogOut link is display$")
    public void i_Verify_that_LogOut_link_is_display() {
        new HomePage().isLogOutLinkDisplay();
    }


    @Then("^I verify that Login Link is display$")
    public void iVerifyThatLoginLinkIsDisplay() {
        String actualText1 = new HomePage().verifyloginlink();
        String expectedText1 = "Log in";
        Assert.assertEquals(actualText1, expectedText1);
    }
}




