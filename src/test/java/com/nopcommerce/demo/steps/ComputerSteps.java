package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DeskTopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerSteps {


    @Then("^I navigated computer page successfully$")
    public void iNavigatedComputerPageSuccessfully() {
        new ComputerPage().getPageTitleText();
    }


    @And("^I navigate to desktop page successfully$")
    public void iNavigateToDesktopPageSuccessfully() {
        new DeskTopPage().getPageTitleText();
    }

    @And("^I click on build your own computer \"([^\"]*)\"$")
    public void iClickOnBuildYourOwnComputer(String pro)  {
      new DeskTopPage().selectProduct(pro);
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String process)  {
        new BuildYourOwnComputerPage().selectProcessor(process);

    }

    @And("^I select ram \"([^\"]*)\"$")
    public void iSelectRam(String ram)  {
     new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^I select Hard disk \"([^\"]*)\"$")
    public void iSelectHardDisk(String hdd)  {
     new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^I select Operating system \"([^\"]*)\"$")
    public void iSelectOperatingSystem(String os)  {
     new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^I select software \"([^\"]*)\"$")
    public void iSelectSoftware(String soft)  {
     new BuildYourOwnComputerPage().selectSoftware(soft);
    }

    @And("^I click on add to cart tab$")
    public void iClickOnAddToCartTab() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^my built product added to cart$")
    public void myBuiltProductAddedToCart() {
        String acc= new BuildYourOwnComputerPage().getProductAddedMessage();
        String exp = "The product has been added to your ";
        Assert.assertEquals(exp,acc);
    }

    @When("^I click on computer tab \"([^\"]*)\"$")
    public void iClickOnComputerTab(String compu) {
       new HomePage().clickOnMenuTab(compu);
    }

    @Then("^I click on desktop link \"([^\"]*)\"$")
    public void iClickOnDesktopLink(String desk)  {
        new ComputerPage().clickOnSubMenu(desk);

    }
}
