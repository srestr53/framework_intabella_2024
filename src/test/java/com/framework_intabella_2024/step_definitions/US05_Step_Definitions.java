package com.framework_intabella_2024.step_definitions;

import com.framework_intabella_2024.pages.VehicleModel_Page_Santiago;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US05_Step_Definitions {

    VehicleModel_Page_Santiago vehicleModel = new VehicleModel_Page_Santiago();

    @When("the user is on Vehicle Model Page")
    public void the_user_is_on_vehicle_model_page() {

        vehicleModel.accessVehicleModel();
    }
    @Then("user sees {int} columns")
    public void user_sees_columns(Integer numberOfColumns, List<String> expectedColumnsNames) {

        //BrowserUtils.waitForVisibility(vehicleModel.headerOptionsTable, 5);
        //Assert.assertTrue(expectedColumnsNames.contains(BrowserUtils.getElementsText(vehicleModel.tableOptions)));

        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedColumnsNames, vehicleModel.getElementsText(vehicleModel.tableOptions));

    }

    @Then("the user cannot access and sees this Msg {string}")
    public void the_user_cannot_access_and_sees_this_msg(String expectedMsg) {

        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedMsg,vehicleModel.errorMsg.getText());

    }



}
