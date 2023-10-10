package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/FeatureFiles",
        tags = "@Smoke",
        glue = "StepDefinitions",
        plugin={"pretty", "html:target/site/cucmber-pretty", "json:target/cucumber/cucumber.json"}


)
public class _04_RunnerForGroups extends AbstractTestNGCucumberTests {
}
