package com.framework_intabella_2024.step_definitions;

import com.framework_intabella_2024.pages.US06_VehiclesPage_Jonny;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US06_StepDefinitions {
Actions actions = new Actions(Driver.getDriver());
    US06_VehiclesPage_Jonny vehiclePage=new US06_VehiclesPage_Jonny();
    @When("User is on vehicles page and hovers over the three dots")
    public void user_is_on_vehicles_page_and_hovers_over_the_three_dots() {
        BrowserUtils.waitFor(10);
        vehiclePage.fleet.click();
        vehiclePage.vehiclesOption.click();
        for (int i = 0; i < vehiclePage.threeDotOptions.size(); i++) {
         actions.moveToElement(vehiclePage.threeDotOptions.get(i)).pause(3).perform();
        }


    }
    @Then("User sees view, edit, and delete options")
    public void user_sees_view_edit_and_delete_options() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehiclePage.view.isEnabled());
        Assert.assertTrue(vehiclePage.edit.isEnabled());
        Assert.assertTrue(vehiclePage.delete.isEnabled());




    }
}
