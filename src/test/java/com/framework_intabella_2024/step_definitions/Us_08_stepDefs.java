package com.framework_intabella_2024.step_definitions;

import com.framework_intabella_2024.pages.CalendarEventPage_Van;
import com.framework_intabella_2024.pages.CreateCalendarEventPage_Van;
import com.framework_intabella_2024.pages.DashBoardPage_Van;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.ConfigurationReader;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class Us_08_stepDefs {
    CalendarEventPage_Van calendarEvent=new CalendarEventPage_Van();
    CreateCalendarEventPage_Van createCalendarVan = new CreateCalendarEventPage_Van();
    DashBoardPage_Van dashBoardVan= new DashBoardPage_Van();
    Actions actions = new Actions(Driver.getDriver());
    @When("Navigate to the calendar event")
    public void navigate_to_the_calendar_event() {

        BrowserUtils.waitForVisibility(dashBoardVan.activitiesModle,10);
        actions.moveToElement(dashBoardVan.activitiesModle)
                .moveToElement(dashBoardVan.calenderEventButton)
                .click().perform();
    }
    @When("Navigate to the calendar event creation section.")
    public void navigate_to_the_calendar_event_creation_section() {

      calendarEvent.iBars.click();
        calendarEvent.linkCreateCalendarEventEvents.click();
    }


    @When("Navigate to the Repeat Every box")
    public void navigate_to_the_repeat_every_box() {
    BrowserUtils.waitFor(5);
        createCalendarVan.repeatCheckBox.click();
        BrowserUtils.waitFor(10);
        createCalendarVan.repeatEveryBox.click();
    }
    @Then("Verify if the default value displayed in the Repeat Every box is {string}.")
    public void verify_if_the_default_value_displayed_in_the_repeat_every_box_is(String expectedDays) {
    BrowserUtils.waitFor(10);
        String actualdays = createCalendarVan.repeatEveryBox.getAttribute("value");
        Assert.assertEquals(expectedDays,actualdays);

    }
    @When("Delete the number from the Repeat Every box")
    public void delete_the_number_from_the_repeat_every_box() {

        createCalendarVan.repeatEveryBox.clear();
    }
    @Given("Change the value in the Repeat Every box to another valid number")
    public void change_the_value_in_the_repeat_every_box_to_another_valid_number() {
        BrowserUtils.waitFor(5);

   createCalendarVan.repeatEveryBox.sendKeys("2");
    }
    @Given("Refresh the page")
    public void refresh_the_page() {

        Driver.getDriver().navigate().refresh();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @Then("Verify if the error message {string} is displayed")
    public void verify_if_the_error_message_is_displayed(String expectedMsg) {

       String actualMsg = createCalendarVan.Erromsg.getText();
       Assert.assertEquals(expectedMsg,actualMsg);
    }


}
