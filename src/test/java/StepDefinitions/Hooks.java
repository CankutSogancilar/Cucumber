package StepDefinitions;

import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {

    @Before // Runs before each scenario in the feature files
    public void beforeScenario(){

        System.out.println("Before Scenario");
    }
    @After //Runs after each scenario in the feature files
    public void afterScenario(Scenario scenario){

        if (scenario.isFailed()){ // takes screenshot when the scenario fails
            final byte[] byteImage = ((TakesScreenshot) ParameterDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());
        }
        ParameterDriver.quitDriver();
    }

    }





  //  @BeforeStep //Runs before each step in a scenario in the feature files
 //   public void beforeStep(){
  //      System.out.println("Before Step Runs");
 //   }
//    @AfterStep //Runs after each step in a scenario in the feature files
 //   public void afterStep(){
  //      System.out.println("After Step Runs");
//

