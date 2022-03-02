package com.span.step_definitions;

import com.span.pages.EditablePage;
import com.span.pages.HomePage;
import com.span.utilities.BrowserUtils;
import com.span.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EditableStepDefs {
    EditablePage editablePage = new EditablePage();
    HomePage homePage = new HomePage();

    @Then("user should click Novi Korisnik")
    public void user_should_click_Novi_Korisnik() {
    homePage.NoviKorisnik.click();
    }

    @Then("type name and surname {string}")
    public void type_name_and_surname(String surname) {
        editablePage.Name.sendKeys(surname);
        BrowserUtils.waitFor(2);
    }

    @Then("type email {string}")
    public void type_email(String email) {
        editablePage.Email.sendKeys(email);
        BrowserUtils.waitFor(2);
    }

    @Then("type phone number {string}")
    public void type_phone_number(String phoneNo) {
        editablePage.Phone.sendKeys(phoneNo);
        BrowserUtils.waitFor(2);
    }

    @Then("choose role {string}")
    public void choose_role(String string) throws InterruptedException {
        WebElement opt = Driver.get().findElement(By.id("Role"));
        WebElement korisnik = Driver.get().findElement(By.xpath("//option[@value='1']"));
        WebElement Adminstrator = Driver.get().findElement(By.xpath("//option[@value='2']"));

        Select select = new Select(opt);
        List<WebElement> options = select.getOptions();

        for (WebElement option: options){
            Thread.sleep(1000);
            select.selectByVisibleText(option.getText());
        }

        if(string.equals("Korisnik")){
            korisnik.click();
        }else {
            Adminstrator.click();
        }


    }

    @Then("type username {string}")
    public void type_username(String userName) {

         editablePage.Username.sendKeys(userName);
        BrowserUtils.waitFor(2);
    }

    @Then("type password {string}")
    public void type_password(String password) {
        editablePage.Password.sendKeys(password);
        BrowserUtils.waitFor(2);
    }

    @Then("retype password {string}")
    public void retype_password(String Passwordconfirm) {
        editablePage.PasswordConfirm.sendKeys(Passwordconfirm);
        BrowserUtils.waitFor(2);
    }

    @Then("submit {string}")
    public void submit(String string) {
        editablePage.SubmitButton.click();
        BrowserUtils.waitFor(3);

        WebElement alert = Driver.get().findElement(By.xpath("//button[@data-dismiss='alert']"));
        Assert.assertTrue(alert.isDisplayed());

    }


}
