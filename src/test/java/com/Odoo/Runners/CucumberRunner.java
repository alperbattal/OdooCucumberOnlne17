package com.Odoo.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //path to features
        glue = "com/Odoo/StepDefinitions",//path to step definitions
        dryRun = false,
<<<<<<< HEAD
        tags = "@Sales",
=======

        tags = "@create_a_leave",
>>>>>>> master
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)
public class CucumberRunner {
}
