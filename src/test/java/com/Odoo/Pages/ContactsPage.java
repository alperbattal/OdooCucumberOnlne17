package com.Odoo.Pages;

import com.Odoo.Utitlities.BrowserUtils;
import com.Odoo.Utitlities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContactsPage extends BasePage {


    @FindBy(linkText = "Contacts")
    public WebElement Contacts;

    @FindBy(xpath ="//ol[@class='breadcrumb']")
    public WebElement SubTitle;

    @FindBy(css = "[accesskey='c']")
    public WebElement Create;

    @FindBy(name = "name")
    public WebElement Name;

    @FindBy(id = "radio228_company")
    public WebElement Company;

    @FindBy(className = "btn btn-primary btn-sm o-kanban-button-new")
    public WebElement createContact;

    @FindBy(id = "o_field_input_346")
    public WebElement jobPosition;

    @FindBy(name = "phone")
    public WebElement Phone;

    @FindBy(name= "email")
    public WebElement Email;

    @FindBy(name = "lang")
    public WebElement Language;

    @FindBy(xpath = "//*[contains(text(), 'Save  & Close')]")
    public WebElement SaveAndClose;
    @FindBy(xpath = "//*[contains(text(), 'Save & New')]")
    public WebElement SaveAndNew;


    @FindBy(css="class ='btn btn-primary btn-sm o_form_button_save'")
    public  WebElement Save;


  public void clickToContact(){
        BrowserUtils.wait(2);
        Contacts.click();
    }
    public static String getTitle(String titleText) /*throws InterruptedException*/ {
        WebDriverWait wait =  new WebDriverWait(Driver.get(), 15);
        wait.until(ExpectedConditions.textToBe(By.xpath("//ol[@class='breadcrumb']/li"),titleText));
        //Thread.sleep(5000);
        WebElement title = Driver.get().findElement(By.xpath("//ol[@class='breadcrumb']/li"));

        return title.getText();
    }
    public void clickToCreate(){
        BrowserUtils.wait(2);
        Create.click();
    }



}
