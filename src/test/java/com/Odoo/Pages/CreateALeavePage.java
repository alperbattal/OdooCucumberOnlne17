package com.Odoo.Pages;

import com.Odoo.Utitlities.BrowserUtils;
import com.Odoo.Utitlities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class CreateALeavePage extends BasePage {

    @FindBy(css = "button[accesskey='c']")
    public WebElement createButton;

    @FindBy(css = "input[name='name']")
    public WebElement description;

    @FindBy(css = "div[name='holiday_status_id']")
    public WebElement leaveType;

    @FindBy(xpath = "//a[text()='Sick Leaves']")
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

    @FindBy(css = "[title='Next Month']")
    public WebElement nextMonthInCalendarBtn;

    @FindBy(css = "[title='Select Month']")
    public WebElement currentMonthAndYearInCalendarElement;

    @FindBy(xpath = "//label[text()='Description']")
    public WebElement descriptionElement;


    public CreateALeavePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    Select select;

    public void setDescription(String desc) {
        BrowserUtils.waitForVisibility(description, 10);
        BrowserUtils.waitForClickablility(description, 10);
        description.sendKeys(desc);
    }

    public void setLeaveType(String typeSelected) {
        BrowserUtils.waitForVisibility(leaveType, 10);
        BrowserUtils.waitForClickablility(leaveType, 10);
        BrowserUtils.clickWithWait(leaveType);
        BrowserUtils.clickWithWait(sickLeaves);
        BrowserUtils.wait(4);

    }

    public void setDurationFrom(String dateSelected) {
        ((JavascriptExecutor) Driver.get()).executeScript("document.getElementById('fromDate').removeAttribute('readonly',0);"); // Enables the from date box
        durationFrom.clear();
        durationFrom.sendKeys("8-Jan-2020", Keys.ENTER); //Enter date in required format

    }

    /**
     * Method to select date in calendar
     *
     * @param date       to select in format MM/dd/yyyy
     * @param fromOrTill
     */
    private void setDate(String date, String fromOrTill) {
        if (fromOrTill.equalsIgnoreCase("from")) {
            BrowserUtils.clickWithWait(durationFrom);
        } else if (fromOrTill.equalsIgnoreCase("till")) {
            BrowserUtils.clickWithWait(durationTo);
        }
        String month = date.split("/")[0];
        String day = date.split("/")[1];
        String year = date.split("/")[2];

        String monthFullName = Month.of(Integer.parseInt(month)).toString();

        monthFullName = monthFullName.substring(0, 1).toUpperCase() + monthFullName.substring(1).toLowerCase();

        String expectedYearAndMonth = monthFullName + " " + year;

        System.out.println("Month: " + monthFullName);
        //set year
        String calendarsActualYearAndMonth = currentMonthAndYearInCalendarElement.getText().trim();

        System.out.println("Current year and month: " + calendarsActualYearAndMonth);
        System.out.println("Expected year and month: " + expectedYearAndMonth);

        //go to next month, until you find required month
        while (!calendarsActualYearAndMonth.equals(expectedYearAndMonth)) {
            nextMonthInCalendarBtn.click();
            calendarsActualYearAndMonth = currentMonthAndYearInCalendarElement.getText().trim();
        }

        String dayToSelectLocator = "td[data-day='" + date + "']";

        System.out.println("Locator for day: " + dayToSelectLocator);

        BrowserUtils.clickWithWait(Driver.get().findElement(By.cssSelector(dayToSelectLocator)));

        //change focus
        BrowserUtils.clickWithWait(descriptionElement);
    }


    public void fillTable(String description, String typeLeave, String dateFrom, String dateTill) {
        setDescription(description);
        setLeaveType(typeLeave);
        setDate(dateFrom, "from");
        setDate(dateTill, "till");
        BrowserUtils.waitForClickablility(saveButton, 10);
        BrowserUtils.clickWithWait(saveButton);
    }

    public String verifyMessage() {
        return errorMessage.getText();
    }


}
