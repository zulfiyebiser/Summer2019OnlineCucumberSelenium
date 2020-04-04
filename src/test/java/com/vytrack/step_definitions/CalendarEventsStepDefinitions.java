package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class CalendarEventsStepDefinitions {
    //    And user verifies that column names are displayed
//            | TITLE             |
//            | CALENDAR          |
//            | START             |
//            | END               |
//            | RECURRENT         |
//            | RECURRENCE        |
//            | INVITATION STATUS |
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Then("user verifies that column names are displayed")
    public void user_verifies_that_column_names_are_displayed(List<String> dataTable) {
        // if we have only one colomn we can use instead of (1) (2)
        // (1)public void user_verifies_that_column_names_are_displayed(io.cucumber.datatable.DataTable dataTable) {
        //(2)public void user_verifies_that_column_names_are_displayed(List<String> dataTable) {
        // if we have two column we can use Map<String,String> instead of List<String>
        // if we have more than two column we can use List<Map<Key,Value>>
        System.out.println(dataTable);
        calendarEventsPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.wait(3);
        Assert.assertEquals(dataTable, calendarEventsPage.getColumnNames());
    }


}
