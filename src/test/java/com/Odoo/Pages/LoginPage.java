package com.Odoo.Pages;

import com.Odoo.Utitlities.BrowserUtils;
import com.Odoo.Utitlities.ConfigurationReader;
import com.Odoo.Utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//ul[@id='top_menu']/li[3]/a")
    public WebElement signIn;

    @FindBy(name ="login")
    public WebElement loginButton;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//a[@class='btn btn-link pull-right' and contains(text(), '?')]")
    public WebElement noAccountLink;

    @FindBy(xpath = "//a[@class='btn btn-link pull-right' and contains(text(), 'Reset')]")
    public WebElement resetLink;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;


    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    public void login(String username, String password){
        signIn.click();
        BrowserUtils.waitForVisibility(loginButton,10);
        loginButton.sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();
    }


   // public void errorMessage






}
