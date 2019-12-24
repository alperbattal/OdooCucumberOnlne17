package com.Odoo.Pages;

import com.Odoo.Utitlities.BrowserUtils;
import com.Odoo.Utitlities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public static void navigateTo(String moduleName) {
        String moduleLocator = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li[normalize-space()='"+moduleName+"']";
        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(moduleLocator)));
        WebElement module = Driver.get().findElement(By.xpath(moduleLocator));
        module.click();
    }

    public static String getTitle(String titleText) /*throws InterruptedException*/ {
        WebDriverWait wait =  new WebDriverWait(Driver.get(), 15);
        wait.until(ExpectedConditions.textToBe(By.xpath("//ol[@class='breadcrumb']/li"),titleText));
        //Thread.sleep(5000);
        WebElement title = Driver.get().findElement(By.xpath("//ol[@class='breadcrumb']/li"));

        return title.getText();
    }

}
