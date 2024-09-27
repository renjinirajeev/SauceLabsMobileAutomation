package com.automation.steps;

import com.automation.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("verify is on checkout page")
    public void verify_is_on_checkout_page() {
        Assert.assertTrue(checkoutPage.isCartPageDisplayed());
       
    }

    @Then("user click on checkout button")
    public void user_click_on_checkout_button() {
       checkoutPage.userClickCheckout();
    }

    @Then("user fill details on checkout details")
    public void user_fill_details_on_checkout_details() {
        checkoutPage.userEnterDetails();
       
    }

    @Then("user click finish button")
    public void user_click_finish_button() {
        checkoutPage.userClickFinishBtn();
       
    }






}
