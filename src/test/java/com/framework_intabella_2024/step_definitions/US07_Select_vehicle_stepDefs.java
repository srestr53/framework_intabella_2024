package com.framework_intabella_2024.step_definitions;

import com.framework_intabella_2024.pages.DashBoardPage_Van;
import com.framework_intabella_2024.pages.VehiclePage_Van;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class US07_Select_vehicle_stepDefs {
    DashBoardPage_Van dashBoardPageVan= new DashBoardPage_Van();
    VehiclePage_Van vehiclePageVan = new VehiclePage_Van();
    Actions actions= new Actions(Driver.getDriver());


    


    @When("Navigate to the Vehicles page")
    public void navigate_to_the_vehicles_page() {

        BrowserUtils.waitFor(10);
       dashBoardPageVan.fleet.click();

        dashBoardPageVan.vehiclesOption.click();

    }
    @Then("Verify that users can select any car")
    public void verify_that_users_can_select_any_car() {

        for (int i = 0; i <vehiclePageVan.carOptions.size(); i++) {
            vehiclePageVan.carOptions.get(i).click();

        }
        for (WebElement checkbox: vehiclePageVan.carOptions){
            Assert.assertTrue (checkbox.isSelected());

        }

    }

    @Then("Users can check the first checkbox to select all the cars")
    public void users_can_check_the_first_checkbox_to_select_all_the_cars() {
     vehiclePageVan.selectAllCar.click();
        for (WebElement checkbox: vehiclePageVan.carOptions){
            Assert.assertTrue (checkbox.isSelected());

        }
    }


    @Then("the users can see all the checkboxes as unchecked.")
    public void the_users_can_see_all_the_checkboxes_as_unchecked() {
        for (WebElement checkbox: vehiclePageVan.carOptions){
            Assert.assertFalse (checkbox.isSelected());

        }
    }

}
