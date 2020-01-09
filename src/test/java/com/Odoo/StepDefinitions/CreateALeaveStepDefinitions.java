package com.Odoo.StepDefinitions;

import com.Odoo.Pages.CreateALeavePage;
import com.Odoo.Utitlities.BrowserUtils;
import gherkin.ast.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.it.Ma;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

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

    // And user fills the table and clicks save button
//      | Description    | Leave Type  | From     | Till      |
//      | Need a day off | Sick Leaves | 8/1/2020 | 8/16/2020 |
    @Then("user fills the table and clicks save button")
    public void user_fills_the_table_and_clicks_save_button(List<Map<String, String>> dataTable) {
        for (Map<String, String> row : dataTable) {
            createALeavePage.fillTable(row.get("Description"), row.get("Leave Type"), row.get("From"), row.get("Till"));
        }
    }

    @Then("user verifies the success message as {string}")
    public void user_verifies_the_success_message_as(String message) {
        BrowserUtils.wait(5);
        System.out.println(createALeavePage.verifyMessage());
        Assert.assertEquals(createALeavePage.verifyMessage(), message);
    }


}
