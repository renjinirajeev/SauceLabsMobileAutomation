package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user login successfully")
    public void verifyUserLoginSuccessfully() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.printElements();
    }

    @And("user click on the first item")
    public void userClickOnTheFirstItem() {

        homePage.userClickFirstElement();
    }

    @Then("verify user added successfully")
    public void verifyUserAddedSuccessfully() {
        homePage = new HomePage();
        Assert.assertTrue(homePage.isUserRemoveBtn());
    }


    @When("user filter by price high to low")
    public void userFilterByPriceHighToLow() {
        homePage.sortingFromHighToLow();
    }

    @Then("verify the product are filtered by high to low")
    public void verifyTheProductAreFilteredByHighToLow() {
        Assert.assertTrue(homePage.storeSortingPrice());
    }

    @Then("verify user can login successfully")
    public void verifyUserCanLoginSuccessfully() {
        Assert.assertTrue(homePage.isHomePageDisplayed());

    }

    @When("user click on WebView")
    public void user_click_on_web_view() {
        homePage.clickOnWebView();
    }
}
