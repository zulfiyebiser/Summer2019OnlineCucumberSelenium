package com.vytrack.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false, // if it is true wont run tests ,will check every single test step if has code implementation which
        // is step definition method,
        tags = "@create_car",
        //tags = "@negative_test" //means ignore other scenarios only run the scenario with"@negative_test" tag
         //tags = "not @negative_test"// means don't run the tests with  "@not negative_test" tag
        plugin = {"html:target/default-cucumber-reports",// it's  to generate report location is optional we can change location of report
        "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
        //json is a java script... we add to be able generated that describes user friendly report
)

public class CucumberRunner {
}
