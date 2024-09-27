package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{

    @FindBy(xpath = "//android.widget.TextView[@text=\"THANK YOU FOR YOU ORDER\"]\n")
    WebElement orderMsg;

    public boolean isOrdered() {
       return orderMsg.isDisplayed();
    }
}
