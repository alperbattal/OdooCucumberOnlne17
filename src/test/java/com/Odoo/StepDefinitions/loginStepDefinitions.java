package com.Odoo.StepDefinitions;

import com.Odoo.Pages.LoginPage;
import com.Odoo.Utitlities.ConfigurationReader;
import com.Odoo.Utitlities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class loginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user can click on login button")
    public void user_can_click_on_login_button() {
        loginPage.signIn.click();
    }

    @Then("User can login with username {string} and password {string}")
    public void user_can_login_with_username_and_password(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("User enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("User verifies that {string} is displayed")
    public void user_verifies_that_is_displayed(String expectedMessage) {
       Assert.assertEquals(loginPage.errorMessage.getText(), expectedMessage);
    }

    @Then("User can reset the password by clicking the reset button")
    public void user_can_reset_the_password_by_clicking_the_reset_button() throws InterruptedException{
        loginPage.resetLink.click();

    }

    @Then("User can click on no account button to create a new account")
    public void user_can_click_on_no_account_button_to_create_a_new_account() throws InterruptedException {
        loginPage.noAccountLink.click();

    }



}
