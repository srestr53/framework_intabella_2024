package com.framework_intabella_2024.step_definitions;


import com.framework_intabella_2024.pages.VehiclesOdometers;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefinitions {

     VehiclesOdometers vehiclesOdometers = new VehiclesOdometers();

    @When("user click Vehicle Odometer as enable fleet option")
   public void user_click_vehicle_odometer_as_enable_fleet_option() {
        BrowserUtils.waitForVisibility(vehiclesOdometers.fleet, 10);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehiclesOdometers.fleet).perform();
     vehiclesOdometers.vehicleOdometer.click();
    }

    @Then("user sees error message {string}")
    public void userSeesErrorMessage(String expectedResult) {
          String actualResult = vehiclesOdometers.S_ManagerErrorMessage.getText();
          Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("user sees default page as {int}")
    public void user_sees_default_page_as(int expectedPage) {
        BrowserUtils.waitForVisibility(vehiclesOdometers.page, 10);
        String actualPage = vehiclesOdometers.page.getAttribute("value");
        Assert.assertEquals(String.valueOf(expectedPage), actualPage);
    }

    @Then("user sees View Per Page as {int} by default")
    public void user_sees_view_per_page_as_by_default(Integer expectedPerPage) {
        String actualPerPage = vehiclesOdometers.viewPerPage.getText();
        Assert.assertEquals(String.valueOf(expectedPerPage), actualPerPage);
    }



}
