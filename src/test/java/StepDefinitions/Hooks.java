package StepDefinitions;

import Utilities.BaseDriver;
import Utilities.ExcelUtilities;
import Utilities.ParameterDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

public class Hooks {
    LocalDateTime startTime;
    LocalDateTime endTime;

    @Before // Runs before each scenario in the feature files
    public void beforeScenario() {
        startTime = LocalDateTime.now();
        System.out.println("Before Scenario");
    }

    @After //Runs after each scenario in the feature files
    public void afterScenario(Scenario scenario) {
        endTime = LocalDateTime.now();
        Duration duration=Duration.between(startTime,endTime);
        if (scenario.isFailed()) { // takes screenshot when the scenario fails
            final byte[] byteImage = ((TakesScreenshot) ParameterDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());
        }
        ExcelUtilities.writeInExcel("src/test/java/ApachePOI/Resources/CampusScenarioResults.xlsx", scenario, startTime, endTime, duration);
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

