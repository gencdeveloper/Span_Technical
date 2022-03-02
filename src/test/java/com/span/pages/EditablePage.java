package com.span.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditablePage extends BasePage {


    @FindBy(id="Name")
    public WebElement Name;

    @FindBy(id="Email")
    public WebElement Email;

    @FindBy(id="Phone")
    public WebElement Phone;

    @FindBy(id="Username")
    public WebElement Username;

    @FindBy(id="Password")
    public WebElement Password;

    @FindBy(id="PasswordConfirm")
    public WebElement PasswordConfirm;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement SubmitButton;

}
