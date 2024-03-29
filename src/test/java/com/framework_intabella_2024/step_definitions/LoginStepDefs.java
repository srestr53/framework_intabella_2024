package com.framework_intabella_2024.step_definitions;

import com.framework_intabella_2024.pages.LoginPage;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.ConfigurationReader;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    /*@Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }*/

    @Then("driver login and see title dashboard")
    public void driver_login_and_see_title_dashboard() {
        BrowserUtils.sleep(3);
        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }



}
