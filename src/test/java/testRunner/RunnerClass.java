package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\sabri\\IdeaProjects\\Automation_Lemonade\\src\\test\\java\\features\\Lemonade.feature"},glue = {"stepDef"},
      //plugin = {"pretty","html:target/cucumber-reports/Cucumber.html"},
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        publish = true
)

public class RunnerClass {


}
