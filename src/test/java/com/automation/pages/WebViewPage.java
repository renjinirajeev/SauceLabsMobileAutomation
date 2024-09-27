package com.automation.pages;

import io.appium.java_client.remote.SupportsContextSwitching;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;

public class WebViewPage extends BasePage{

    @FindBy(xpath = "//android.widget.EditText[contains(@content-desc,'url')]")
    WebElement enterUrl;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-GO TO SITE']")
    WebElement goToSiteBtn;
    
    @FindBy(xpath = "//android.webkit.WebView")
    WebElement website;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement searchBtn;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement searchTab;

    @FindBy(xpath = "//android.view.View[contains(@text,'java download')]")
    WebElement firstSearchElement;



    public boolean isWebViewDisplayed(){
        return enterUrl.isDisplayed();
    }

    public void enterUrl(){
        enterUrl.sendKeys("www.google.com");
        goToSiteBtn.click();
    }

    public boolean isWebSitePresent() throws InterruptedException {
        Thread.sleep(5000);
        return website.isDisplayed();
    }

    public void printContext() throws InterruptedException {
        SupportsContextSwitching contextSwitching = (SupportsContextSwitching) driver;
        System.out.println(Arrays.toString(contextSwitching.getContextHandles().toArray()));
        searchBtn.sendKeys("java");
        searchBtn.click();
//        searchTab.sendKeys("java");

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        Thread.sleep(5000);
//        firstSearchElement.click();
    }
}
