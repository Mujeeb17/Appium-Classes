package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "src/test/java/stepDefinitions",
        dryRun = false,
        plugin = {"pretty", "html:target/Cucumber.html"}

)
public class Runner {
}
