package com.span.step_definitions;

import com.span.pages.LoginPage;
import com.span.utilities.BrowserUtils;
import com.span.utilities.ConfigurationReader;
import com.span.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        //about singleton design pattern
        Driver.get().get(url);
    }

    @When("the user enters the admin information")
    public void theUserEntersTheAdminInformation() {
        String username = ConfigurationReader.get("admin_user");
        String password = ConfigurationReader.get("admin_password");
        loginPage.login(username,password);
    }



    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualUrl = "https://lab01.span.eu/SPAN.TT/Users/List";
        String expectedUrl = actualUrl;
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

    @When("the user enters the custom user information")
    public void the_user_enters_the_custom_user_information() {
        String username = ConfigurationReader.get("user_username");
        String password = ConfigurationReader.get("user_password");
        loginPage.login(username,password);

    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        loginPage.login(username,password);
    }



}
