package com.framework_intabella_2024.step_definitions;

import com.framework_intabella_2024.pages.AllVehicleCostsPage;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US13_StepDefinitions {

    AllVehicleCostsPage vehicleCostsPage = new AllVehicleCostsPage();

    @When("user click the Vehicle Cost page")
    public void user_click_the_vehicle_cost_page() {
        BrowserUtils.waitForVisibility(vehicleCostsPage.fleet, 10);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehicleCostsPage.fleet).perform();

        BrowserUtils.waitForVisibility(vehicleCostsPage.vehicleCosts, 10);

        vehicleCostsPage.vehicleCosts.click();
    }

    @Then("user sees 3 column names:")
    public void user_sees_column_names(List<String> expectedColumnNames) {

        BrowserUtils.waitForVisibility(vehicleCostsPage.firstCheckBox, 10);

       List<WebElement> columnNames = vehicleCostsPage.firstColumnNames;

       List<String> actualColumnNames = new ArrayList<>();

        for (WebElement each : columnNames) {
            actualColumnNames.add(each.getText());
        }

        Assert.assertEquals(expectedColumnNames, actualColumnNames);


    }


    @When("user select the fist checkbox")
    public void user_select_the_fist_checkbox() {
        vehicleCostsPage.firstCheckBox.click();
    }

    @Then("selected all row")
    public void selected_all_row() {

        for (WebElement eachColumnsCheckBox : vehicleCostsPage.AllColumnsCheckBox) {
            Assert.assertTrue(eachColumnsCheckBox.isSelected());
        }

    }



}
