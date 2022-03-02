package com.span.pages;

import com.span.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id="Username")
    public WebElement userName;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }


}
