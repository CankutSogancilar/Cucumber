package Runners;

import Utilities.ParameterDriver;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(

        features = "src/test/java/FeatureFiles",
        glue="StepDefinitions",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        tags="@Regression"

)
public class _08_RunnerForParallelTest extends AbstractTestNGCucumberTests {


    @BeforeClass
    @Parameters(value="browser")
    public void beforeClas(String browserName){
        ParameterDriver.setThreadDriverName(browserName);
    }

    @AfterClass
    public void writeOnExtentReport(){

        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone",System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Tester Name","Cankut");
        ExtentService.getInstance().setSystemInfo("Application Name","Campus");
        ExtentService.getInstance().setSystemInfo("Operating System",System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department","QA");
    }
}
