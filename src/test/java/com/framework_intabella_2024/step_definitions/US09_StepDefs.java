package com.framework_intabella_2024.step_definitions;

import com.framework_intabella_2024.pages.CalendarErrPage_Lokman;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US09_StepDefs {

    CalendarErrPage_Lokman calendarErrPageLokman = new CalendarErrPage_Lokman();

    @When("user is on the calendar events page")
    public void user_is_on_the_calendar_events_page() {
        BrowserUtils.waitForVisibility(calendarErrPageLokman.activities,10);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(calendarErrPageLokman.activities).perform();
        calendarErrPageLokman.calendarEvents.click();

    }
    @When("user click on the Create Calendar Event page")
    public void user_click_on_the_create_calendar_event_page() {
        BrowserUtils.sleep(10);
        //BrowserUtils.waitForClickablility(calendarErrPageLokman.createEvent,10);
        BrowserUtils.clickWithJS(calendarErrPageLokman.createEvent);
    }
    @When("user enters {string} in repeat every box")
    public void user_enters_in_repeat_every_box(String invalidNumber) {
        //BrowserUtils.waitForClickablility(calendarErrPageLokman.repeatCheckbox,10);
        BrowserUtils.sleep(8);
        calendarErrPageLokman.repeatCheckbox.click();
        BrowserUtils.waitForClickablility(calendarErrPageLokman.repeatEvery,10);
        calendarErrPageLokman.repeatEvery.click();
        calendarErrPageLokman.repeatEvery.sendKeys(Keys.BACK_SPACE+invalidNumber+Keys.ENTER);

    }

    @Then("user sees an {string}")
    public void userSeesAn(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage,calendarErrPageLokman.actualErrorMsg.getText());


    }
}
