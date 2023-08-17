package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles",
        tags = "@SmokeTest or @RegressionTest",
        glue = "StepDefinitions"
)

public class _05_RunnerForMultipleGroups extends AbstractTestNGCucumberTests {


}
