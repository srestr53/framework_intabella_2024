package com.framework_intabella_2024.step_definitions;


import com.framework_intabella_2024.pages.VehiclesOdometersPage;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefinitions {

     VehiclesOdometersPage vehiclesOdometersPage = new VehiclesOdometersPage();

    @When("user click Vehicle Odometer as enable fleet option")
   public void user_click_vehicle_odometer_as_enable_fleet_option() {
        BrowserUtils.waitForVisibility(vehiclesOdometersPage.fleet, 10);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehiclesOdometersPage.fleet).perform();
     vehiclesOdometersPage.vehicleOdometer.click();
    }

    @Then("user sees error message {string}")
    public void userSeesErrorMessage(String expectedResult) {
          String actualResult = vehiclesOdometersPage.S_ManagerErrorMessage.getText();
          Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("user sees default page as {int}")
    public void user_sees_default_page_as(int expectedPage) {
        BrowserUtils.waitForVisibility(vehiclesOdometersPage.page, 10);
        String actualPage = vehiclesOdometersPage.page.getAttribute("value");
        Assert.assertEquals(String.valueOf(expectedPage), actualPage);
    }

    @Then("user sees View Per Page as {int} by default")
    public void user_sees_view_per_page_as_by_default(Integer expectedPerPage) {
        String actualPerPage = vehiclesOdometersPage.viewPerPage.getText();
        Assert.assertEquals(String.valueOf(expectedPerPage), actualPerPage);
    }



}
