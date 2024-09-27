package com.automation.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//android.widget.TextView[@text='BACK TO PRODUCTS']")
    WebElement backToProduct;

    @FindBy(xpath = "//android.widget.TextView[@text='Terms of Service | Privacy Policy']")
    WebElement lastPortion;

    @FindBy(xpath = "//android.widget.TextView[@text='ADD TO CART']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.ImageView")
    WebElement cartIcon;


    public boolean isProductPageDisplayed(){
        return backToProduct.isDisplayed();
    }

    public void clickAddToCart(){
        Dimension dimension=driver.manage().window().getSize();
        int width= dimension.getWidth();
        int height = dimension.getHeight();

        while (!isPresentNew(lastPortion)){
            scrollOrSwipe(width/2,height/2,width/2,0);
        }
        addToCartBtn.click();
    }
    public void backToProduct(){
        Dimension dimension=driver.manage().window().getSize();
        int width= dimension.getWidth();
        int height = dimension.getHeight();

        while (!isPresentNew(lastPortion)){
            scrollOrSwipe(width/2,height/2,width/2,height);
        }
        backToProduct.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    public void doubleTabAddToCartBtn(){
        Dimension dimension=driver.manage().window().getSize();
        int width= dimension.getWidth();
        int height = dimension.getHeight();
        while (!isPresentNew(lastPortion)){
            scrollOrSwipe(width/2,height/2,width/2,0);
        }
        doubleTap(addToCartBtn);
    }


}cm
