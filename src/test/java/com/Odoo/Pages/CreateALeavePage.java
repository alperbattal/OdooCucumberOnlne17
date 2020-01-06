package com.Odoo.Pages;

import com.Odoo.Utitlities.BrowserUtils;
import com.Odoo.Utitlities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateALeavePage extends BasePage{

    @FindBy(css = "button[accesskey='c']")
    public WebElement createButton;

    @FindBy(css = "input[name='name']")
    public WebElement description;

    @FindBy(css = "div[name='holiday_status_id']")
    public WebElement leaveType;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[2]")
    public WebElement sickLeaves;

    @FindBy(css = "input[name='date_from']")
    public WebElement durationFrom;

    @FindBy(css = "input[name='date_to']")
    public WebElement durationTo;

    @FindBy(css = "button[accesskey='s']")
    public WebElement saveButton;

    @FindBy(css = "div[class='o_dialog_warning modal-body']")
    public WebElement errorMessage;

    @FindBy(css = "[data-action-id='405']")
    public WebElement leavesSummary;


    public CreateALeavePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    Select select;

    public void setDescription(String desc){
        BrowserUtils.waitForVisibility(description, 10);
        BrowserUtils.waitForClickablility(description, 10);
        description.sendKeys(desc);
    }

    public void setLeaveType(String typeSelected){
        BrowserUtils.waitForVisibility(leaveType, 10);
        BrowserUtils.waitForClickablility(leaveType, 10);
        leaveType.click();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(sickLeaves).click().build().perform();
        BrowserUtils.wait(4);

    }

    public void setDurationFrom(String dateSelected){
        ((JavascriptExecutor)Driver.get()).executeScript ("document.getElementById('fromDate').removeAttribute('readonly',0);"); // Enables the from date box
        durationFrom.clear();
        durationFrom.sendKeys("8-Jan-2020", Keys.ENTER); //Enter date in required format

    }

    public void fillTable(String description, String typeLeave, String date){
        setDescription(description);
        setLeaveType(typeLeave);
        setDurationFrom(date);
        BrowserUtils.waitForClickablility(saveButton, 10);
        saveButton.click();
    }

    public String verifyMessage(){
        return errorMessage.getText();
    }



}
