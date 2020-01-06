package com.Odoo.StepDefinitions;

import com.Odoo.Pages.BasePage;
import com.Odoo.Pages.ContactsPage;
import com.Odoo.Pages.LoginPage;
import com.Odoo.Utitlities.BrowserUtils;
import com.Odoo.Utitlities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class contactsStepDefinitions {



    ContactsPage contactsPage=new ContactsPage();



    @Then("user navigates to {string}")
    public void user_navigates_to(String moduleName) {
        BasePage.navigateTo(moduleName);


    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String expectedTitle) {
       String actualTitle = BasePage.getTitle(expectedTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println(actualTitle);
    }
    @Then("user can click on create button")
    public void user_can_click_on_create_button() {
     contactsPage.Create.click();

    }

    @Then("user adds new  contacts information")
    public void user_adds_new_contacts_information(List<Map<String, String>> dataTable) {
        BrowserUtils.wait(3);
        contactsPage.Company.click();
        contactsPage.waitUntilLoaderMaskDisappear();
        System.out.println(dataTable);


        for (Map<String, String> map: dataTable){
            contactsPage.Name.sendKeys(map.get("Name"));
            contactsPage.Phone.sendKeys(map.get("Phone"));
            contactsPage.Email.sendKeys(map.get("Email"));
            contactsPage.Language.sendKeys(map.get("Language"));
            WebElement Save=Driver.get().findElement(By.cssSelector("[class =\"btn btn-primary btn-sm o_form_button_save\""));
            BrowserUtils.waitForClickablility(Save, 3);
           Save.click();
          /*
            JavascriptExecutor js = (JavascriptExecutor) Driver.get();

            js.executeScript("arguments[0].click()", Save);*/



        }


    }



}
