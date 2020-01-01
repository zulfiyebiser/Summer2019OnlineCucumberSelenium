package com.vytrack.step_definitions;
import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before
    public void setup(){
        System.out.println("##############################");
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){ // Scenario class check is test work properly
        //if test failed - do this
        //scenario object returns info about current scenario. By using this class, Scenario, we can check test status: passed/failed
//        Scenario: Verify that warning message is displayed when password is not correct
//        Given user is on the login page
//        Then user enters "storemanager85" username and "wrong" password
//        And user verifies that "Invalid user name or password." message is displayed
//        Then use this annotation in runner class.


        if(scenario.isFailed()){
            System.out.println("Test failed!");
            byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }else{
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
        System.out.println("##############################");
        //after every test, we gonna close browser
        Driver.close();
    }
}