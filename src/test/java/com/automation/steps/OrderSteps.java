package com.automation.steps;

import com.automation.pages.OrderPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class OrderSteps {

    OrderPage orderPage = new OrderPage();

    @Then("verify user complete checkout")
    public void verify_user_complete_checkout() {
        Assert.assertTrue(orderPage.isOrdered());

    }
}
