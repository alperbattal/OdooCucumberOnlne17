package com.Odoo.StepDefinitions;

import com.Odoo.Utitlities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public void setup(){
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(){
        Driver.close();
    }
}
