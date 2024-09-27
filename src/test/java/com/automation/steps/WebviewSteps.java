package com.automation.steps;

import com.automation.pages.WebViewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebviewSteps {

    WebViewPage webViewpage = new WebViewPage();


    @Then("verify user is on WebView Selection page")
    public void verify_user_is_on_web_view_selection_page() {
        Assert.assertTrue(webViewpage.isWebViewDisplayed());
    }

    @When("user enters the site")
    public void user_enters_the_site() {
        webViewpage.enterUrl();
    }

    @Then("verify user is on the website")
    public void verify_user_is_on_the_website() throws InterruptedException {
        Assert.assertTrue(webViewpage.isWebSitePresent());
        
    }

    @And("print context")
    public void printContext() throws InterruptedException {
        webViewpage.printContext();
    }
}
