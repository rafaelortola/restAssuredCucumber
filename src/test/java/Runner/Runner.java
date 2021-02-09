package Runner;

import StepsDefinitions.Steps;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin = { "html:target/cucumberHtmlReport" },
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.json"},
        glue = {"StepsDefinitions"},
        tags = {"@smokeTestPost"},
        features = {"src/test/java/Features"}
        )

public class Runner {
}
