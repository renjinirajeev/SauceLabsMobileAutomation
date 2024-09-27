package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Username']")
    WebElement userName;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'The currently accepted usernames')]/following-sibling::android.view.ViewGroup/android.widget.TextView")
    List<WebElement> userNameList;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'And the password for')]/following-sibling::android.widget.TextView")
    WebElement passwordList;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Password']")
    WebElement passWord;

    @FindBy(xpath = "//android.widget.TextView[@text='LOGIN']")
    WebElement loginBtn;


    public void openWebsite(){}

    public boolean isLoginPageDisplayed(){
       return userName.isDisplayed();
    }

    public void performScroll(){
        Dimension dimension=driver.manage().window().getSize();
        int width= dimension.getWidth();
        int height = dimension.getHeight();

        while (!isPresentNew(passwordList)){
            scrollOrSwipe(width/2,height/2,width/2,0);
        }
    }
    public void usernameList(){
        for(WebElement user_name : userNameList){
            System.out.println("usernames : " + user_name.getText());
            ConfigReader.saveConfig("user.name", user_name.getText());
        }
        System.out.println("password is : " + passwordList.getText());
        ConfigReader.saveConfig("pass.word",passwordList.getText());
    }

    public void enterUsername(String user){
        userName.sendKeys(user);
    }

    public void enterPassword(String password){
        passWord.sendKeys(password);
        loginBtn.click();
    }
}
