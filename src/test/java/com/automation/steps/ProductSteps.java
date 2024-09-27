package com.automation.steps;

import com.automation.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {

    ProductPage productPage = new ProductPage();

    @Then("verify user is on first element page")
    public void verifyUserIsOnFirstElementPage() {
        productPage.isProductPageDisplayed();
    }

    @When("user click on addToCart button")
    public void userClickOnAddToCartButton() {
        productPage.clickAddToCart();
        productPage.backToProduct();
    }

    @And("user click on cart icon")
    public void userClickOnCartIcon() {
        productPage.clickCartIcon();
    }


    @When("user click on the addToCart button")
    public void userClickOnTheAddToCartButton() {

        productPage.clickAddToCart();
    }

    @When("user double tap on addToCart button")
    public void userDoubleTapOnAddToCartButton() {
        productPage.doubleTabAddToCartBtn();
    }
}
