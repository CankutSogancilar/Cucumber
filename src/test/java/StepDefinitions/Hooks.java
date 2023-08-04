package StepDefinitions;

import Utilities.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

import java.io.IOException;

public class Hooks {

    @Before // Runs before each scenario in the feature files
    public void beforeScenario(){

        System.out.println("Before Scenario");
    }
    @After //Runs after each scenario in the feature files
    public void afterScenario(){
        BaseDriver.quitDriver();
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

