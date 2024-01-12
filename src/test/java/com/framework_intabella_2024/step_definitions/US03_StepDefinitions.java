package com.framework_intabella_2024.step_definitions;

import com.framework_intabella_2024.pages.PinbarPage_Firyuza;
import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

public class US03_StepDefinitions {

    PinbarPage_Firyuza pinbarPageFiryuza = new PinbarPage_Firyuza();

    @When("the user click on the Learn how to use this space")
    public void the_user_click_on_the_learn_how_to_use_this_space() {


        //pinbarPageFiryuza.PinbarLink.click();

        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.waitForVisibility(pinbarPageFiryuza.PinbarLink,10);
        //js.executeScript("arguments[0].scrollIntoView(true)", pinbarPageFiryuza.PinbarLink );
        pinbarPageFiryuza.PinbarLink.click();

    }
    @Then("the user should see {string}")
    public void the_user_should_see(String expectedResult) {
        BrowserUtils.waitForVisibility(pinbarPageFiryuza.PinbarLink,10);

        String actualResult = pinbarPageFiryuza.Header.getText();

        Assert.assertEquals(expectedResult,actualResult);
    }
    @Then("the user should see a {string}")
    public void theUserShouldSeeA(String expectedResult2) {
        BrowserUtils.waitForVisibility(pinbarPageFiryuza.PinbarLink,10);

        String actualResult2 = pinbarPageFiryuza.description.getText();
        Assert.assertEquals(expectedResult2,actualResult2);
    }
    @Then("the user should see an image on the page with expected source: {string}")
    public void the_User_Should_See_An_Image_On_The_Page_With_Expected_Source(String expectedSource) {

        BrowserUtils.waitForVisibility(pinbarPageFiryuza.PinbarLink,10);
        String actualSource= pinbarPageFiryuza.imageSource.getAttribute("src");
        actualSource=actualSource.replace("https://qa.intabella.com","");
        Assert.assertEquals(expectedSource,actualSource);

    }


}
