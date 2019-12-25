package com.Odoo.StepDefinitions;


import com.Odoo.Pages.BasePage;
import com.Odoo.Pages.SalesPage;
import com.Odoo.Utitlities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class SalesDefinitions {

    SalesPage salesPage = new SalesPage();


    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        BasePage.navigateTo(string);
    }



    @Given("user verifies that column names are displayed")
    public void user_verifies_that_column_names_are_displayed(List<String> dataTable) {
        System.out.println(dataTable);
        salesPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.wait(3);
        Assert.assertEquals(dataTable, salesPage.getColumnNames());

    }





}
