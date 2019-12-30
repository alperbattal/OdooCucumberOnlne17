package com.Odoo.Pages;

import com.Odoo.Utitlities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesPage {

    @FindBy(linkText = "Notes")
    public WebElement Notes;

    @FindBy(xpath = "//ol[@class='breadcrumb']")
    public WebElement subTitle;
    
    @FindBy(css = "[class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButton;

    @FindBy(css = "[class='o_input ui-autocomplete-input']")
    public WebElement TagsDropdown;

    @FindBy(css = "[class='note-editable panel-body']")
    public WebElement WritingPanel;

    @FindBy(css = "[class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(css = "[data-oe-model='data-oe-model']")
    public WebElement NoteBy;

    @FindBy(css = "[class='o_thread_message_content']")
    public WebElement alertMessage;

public void clickNotes(){
    Notes.click();

}
    public static String getTitle(String titleText) /*throws InterruptedException*/ {
        WebDriverWait wait =  new WebDriverWait(Driver.get(), 15);
        wait.until(ExpectedConditions.textToBe(By.xpath("//ol[@class='breadcrumb']/li"),titleText));
        //Thread.sleep(5000);
        WebElement title = Driver.get().findElement(By.xpath("//ol[@class='breadcrumb']/li"));
        return title.getText();
    }

    public void clickCreateButton(){
        createButton.click();
    }

    public void chooseTags(){
      TagsDropdown.sendKeys("Tester", Keys.ENTER);
    }

     public  void writeText(){
        WritingPanel.sendKeys("This meeting very important",Keys.ENTER);
     }

     public void clickSaveButton(){
       saveButton.click();
     }




}
