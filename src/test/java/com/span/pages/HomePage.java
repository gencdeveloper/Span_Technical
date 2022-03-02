package com.span.pages;

import com.span.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath="//a[text()='Novi korisnik']")
    public WebElement NoviKorisnik;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[2]/label/input")
    public WebElement Search;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement tdList;

}
