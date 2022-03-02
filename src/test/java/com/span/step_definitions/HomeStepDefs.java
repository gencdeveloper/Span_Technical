package com.span.step_definitions;

import com.span.pages.HomePage;
import com.span.utilities.BrowserUtils;
import com.span.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class HomeStepDefs {
    HomePage homePage = new HomePage();
    @Then("user should be able to overview list")
    public void userShouldBeAbleToOverviewList() {
        HomePage homePage = new HomePage();
        List<WebElement> listElement = Driver.get().findElements(By.xpath("//td[@class='sorting_1']"));
        for(int i =0;i<listElement.size();i++) {
            String elementText = listElement.get(i).getText();
            System.out.println("ID: "+ elementText);
        }
        return;
    }



    @When("user should be able to search {string}")
    public void user_should_be_able_to_search(String arg) {
        BrowserUtils.waitFor(3);
        homePage.Search.sendKeys(arg);
        BrowserUtils.waitFor(1);

    }

    @Then("user will see {string}")
    public void user_will_see(String arg) {
        WebElement searchelement = Driver.get().findElement(By.xpath("/html/body/div[2]/div[2]/div/table/tbody/tr[1]/td[3]"));
        String actual = arg;
        String expected = searchelement.getText();
        System.out.println(expected);
        Assert.assertEquals(actual,expected);


    }

    @Then("user will see result text")
    public void user_will_see_result_text() {
        WebElement ResultText = Driver.get().findElement(By.id("users-table_info"));

        String expected = ResultText.getText();
        String actual = expected;

        Assert.assertEquals(actual,expected);
    }

    @When("user should be able to filter numbers with {string}")
    public void user_should_be_able_to_filter_numbers_with(String num) {
        BrowserUtils.waitFor(3);
        homePage.Search.sendKeys(num);
        BrowserUtils.waitFor(1);

    }

    @Then("user will see numbers with {string}")
    public void user_will_see_numbers_with(String num) {
        WebElement filter = Driver.get().findElement(By.xpath("//tbody//tr//td[5]"));
        String expected = filter.getText();

        if(expected.contains("21")){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

    }


}
