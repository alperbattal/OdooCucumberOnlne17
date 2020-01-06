package com.Odoo.StepDefinitions;

import com.Odoo.Pages.CreateALeavePage;
import com.Odoo.Utitlities.BrowserUtils;
import gherkin.ast.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CreateALeaveStepDefinitions {

    CreateALeavePage createALeavePage = new CreateALeavePage();

    @Then("user navigates to {string} module")
    public void user_navigates_to_module(String module) {
      BrowserUtils.waitForPageToLoad(10);
      createALeavePage.navigateTo(module);
    }


    @Then("user clicks on Create button")
    public void user_clicks_on_Create_button() {
        BrowserUtils.waitForPageToLoad(10);
       createALeavePage.createButton.click();
    }

    @Then("user fills the table and clicks save button")
    public void user_fills_the_table_and_clicks_save_button() {
        createALeavePage.fillTable("Need a day off", "Sick Leaves", "8-Jan-2020");
    }

    @Then("user verifies the success message as {string}")
    public void user_verifies_the_success_message_as(String message) {
        System.out.println(createALeavePage.verifyMessage());
        Assert.assertEquals(createALeavePage.verifyMessage(), message);
    }






}
