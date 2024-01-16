package com.framework_intabella_2024.step_definitions;

import com.framework_intabella_2024.pages.MainPage_Page_Elmira;
import com.framework_intabella_2024.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US01_StepDefinitions {

    MainPage_Page_Elmira mainPage = new MainPage_Page_Elmira();

    @Then("the user sees {int} modules")
    public void the_user_sees_modules(Integer numOfModules, List<String> expectedModules) {

        BrowserUtils.sleep(3);

       List<String> actualModules=BrowserUtils.getElementsText(mainPage.menuOptions);

       Assert.assertEquals(expectedModules,actualModules);

    }
}
