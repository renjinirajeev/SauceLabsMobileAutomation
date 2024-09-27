package com.automation.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]\n")
    WebElement checkOutBtn;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-First Name\"]\n")
    WebElement firstName;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Last Name\"]")
    WebElement lastName;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]\n")
    WebElement zipcode;

    @FindBy(xpath = "//android.widget.TextView[@text=\"CONTINUE\"]\n")
    WebElement continueBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-FINISH\"]\n")
    WebElement finishBtn;


    public boolean isCartPageDisplayed() {
        return checkOutBtn.isDisplayed();
    }
    public void userClickCheckout(){
        checkOutBtn.click();
    }

    public void userEnterDetails(){
        firstName.sendKeys("John");
        lastName.sendKeys("dohe");
        zipcode.sendKeys("123456");
        continueBtn.click();
    }

    public void userClickFinishBtn(){
        Dimension dimension = driver.manage().window().getSize();
        int width = dimension.getWidth();
        int height = dimension.getHeight();
        while (!isPresentNew(finishBtn)){
            scrollOrSwipe(width/2,height/2,width/2,0);
        }
        finishBtn.click();

    }
}
