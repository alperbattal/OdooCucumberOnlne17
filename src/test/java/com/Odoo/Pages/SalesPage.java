package com.Odoo.Pages;

import com.Odoo.Utitlities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesPage extends BasePage {

    @FindBy(css= "*[normalize-space()='Sales' and @class='oe_menu_toggler']")
  public WebElement sales;



    @FindBy(css= "th[class = 'o_column_sortable']")
    public List<WebElement> columnNames;



    public List<String> getColumnNames() {
        return BrowserUtils.getListOfString(columnNames);
    }





}
