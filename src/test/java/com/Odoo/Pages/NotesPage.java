package com.Odoo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage {
    @FindBy(css = "[title='Notes']")
    public WebElement Notes;

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








}
