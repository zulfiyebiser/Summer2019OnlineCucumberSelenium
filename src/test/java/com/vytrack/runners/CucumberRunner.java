package com.vytrack.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@store_manager",
        //tags = "@negative_test" //means ignore other scenarios only run the scenario with"@negative_test" tag
         //tags = "not @negative_test"// means don't run the tests with  "@not negative_test" tag
        plugin = {"html:target/default-cucumber-reports"}
)

public class CucumberRunner {
}
