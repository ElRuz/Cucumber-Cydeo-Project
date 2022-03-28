package com.cydeo.step_definitions;

/*
In this class we will be able to pass pre- & post- conditions to each scenario and each step
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
/*
    //import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){
        System.out.println("==== Setting up browser using cucumber @Before ====");
    }

 */

    @After
    public void teardownScenario(Scenario scenario){

        if (scenario.isFailed()){

            byte[] screenshots = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots, "image/png", scenario.getName());

        }

        Driver.closeDriver();

        System.out.println("==== Tearing down browser using cucumber @After ====");

    }
/*
    @BeforeStep
    public void setupStep(){
        System.out.println("--------> applying setup using @BeforeStep <----------");
    }
 */
/*
    @AfterStep
    public void afterStep(){
        System.out.println("--------> applying tearDown using @AfterStep <---------");
    }
 */


}
