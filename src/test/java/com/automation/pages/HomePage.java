package com.automation.pages;

import io.cucumber.java.eo.Do;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.Inet4Address;
import java.util.*;

public class HomePage extends BasePage {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Menu']")
    WebElement homePageDisplayed;

    @FindBy(xpath = "//android.view.ViewGroup//android.view.ViewGroup[@content-desc='test-Item']//android.widget.TextView[@content-desc='test-Item title']")
    List<WebElement> elementsList;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Terms of Service | Privacy Policy\"]")
    WebElement lastSection;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-REMOVE']")
    WebElement removeBtn;

    @FindBy(xpath = "//android.view.ViewGroup//android.view.ViewGroup[@content-desc='test-Item']//android.widget.TextView[contains(@text,'$')]")
    List<WebElement> priceList;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Modal Selector Button']/android.view.ViewGroup//android.widget.ImageView")
    WebElement filterBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Price (high to low)']")
    WebElement highToLow;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-WEBVIEW']")
    WebElement web_view;

    public boolean isHomePageDisplayed() {
        return homePageDisplayed.isDisplayed();
    }

    public void printElements() {
        Dimension dimension = driver.manage().window().getSize();
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        Set<String> productList = new HashSet<>();
        for (WebElement product : elementsList) {
            productList.add(product.getText());
        }
        while (!isPresentNew(lastSection)) {
            scrollOrSwipe(width / 2, height / 2, width / 2, 0);
            elementsList = driver.findElements(By.xpath("//android.view.ViewGroup//android.view.ViewGroup[@content-desc='test-Item']//android.widget.TextView[@content-desc='test-Item title']"));
            for (WebElement product : elementsList) {
                productList.add(product.getText());
            }
        }
        for (String prod : productList) {
            System.out.println(prod);
        }
    }

    public void userClickFirstElement() {
        elementsList.get(0).click();
    }

    public boolean isUserRemoveBtn() {
        return removeBtn.isDisplayed();
    }

    public void sortingFromHighToLow() {
        filterBtn.click();
        highToLow.click();
    }


    public boolean storeSortingPrice(){

        boolean flag = false;
        Dimension dimension = driver.manage().window().getSize();
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        List<Double> priceCollection = new ArrayList<>();

        for (WebElement price : priceList) {
            Double p_price=Double.parseDouble(price.getText().substring(1).trim());
            priceCollection.add(p_price);
        }
        while (!isPresentNew(lastSection)) {
            scrollOrSwipe(width / 2, height / 2, width / 2, 0);
            priceList = driver.findElements(By.xpath("//android.view.ViewGroup//android.view.ViewGroup[@content-desc='test-Item']//android.widget.TextView[contains(@text,'$')]"));

            for (WebElement price : priceList) {
                Double p_price=Double.parseDouble(price.getText().split("\\$")[1]);
                priceCollection.add(p_price);
            }
        }
        List<Double> sortingListAfterFilter = new ArrayList<>(priceCollection);
        System.out.println(sortingListAfterFilter);

        List<Double>sortListBeforeList=new ArrayList<>(sortingListAfterFilter);
        Collections.sort(sortListBeforeList);
        Collections.reverse(sortListBeforeList);
        System.out.println(sortListBeforeList);

        if(sortListBeforeList.equals(sortingListAfterFilter)){
            flag=true;
        }
        return flag;
    }
    public void clickOnWebView(){
        homePageDisplayed.click();
        web_view.click();

    }

    }

