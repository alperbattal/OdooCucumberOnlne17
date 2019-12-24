package com.Odoo.StepDefinitions;

import com.Odoo.Pages.BasePage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class titleStepDefinitions {

    @Given("user is on {string}")
    public void user_is_on(String page){
        BasePage.navigateTo(page);
    }

    @Then("user verifies that the title is {string}")
    public void user_verifies_that_the_title_is(String expectedTitle) throws InterruptedException {
        String actualTitle = BasePage.getTitle(expectedTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println(actualTitle);
    }



}
