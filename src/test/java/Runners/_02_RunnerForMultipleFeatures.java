package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_02_Country.feature",
                "src/test/java/FeatureFiles/_05_FeeFunctionality.feature"},
        glue = "StepDefinitions",
        dryRun = true // default value is false.-> it runs the fautures regularly
                      // true-> it only checks if all required step definitions for the features are exist.

)

public class _02_RunnerForMultipleFeatures extends AbstractTestNGCucumberTests {
}
