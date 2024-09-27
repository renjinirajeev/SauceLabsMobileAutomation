package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user opens application")
    public void user_opens_application() {
        loginPage.openWebsite();
       
    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
       
    }

    @Then("verify user can print username and password")
    public void verify_user_can_print_username_and_password() {
        loginPage.performScroll();
        loginPage.usernameList();
       
    }


    @When("user enter username {string}")
    public void userEnterUsername(String username) {
        loginPage.enterUsername(ConfigReader.getConfigValue("username"));
    }


    @And("user enter password {string}")
    public void userEnterPassword(String password) {
        loginPage.enterPassword(ConfigReader.getConfigValue("password"));

    }
}
