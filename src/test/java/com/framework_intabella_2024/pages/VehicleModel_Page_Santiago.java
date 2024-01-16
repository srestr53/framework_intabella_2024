package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.BrowserUtils;
import com.framework_intabella_2024.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class VehicleModel_Page_Santiago extends BasePage {

    public VehicleModel_Page_Santiago() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     This WebElement is just for sales manager and store manager
     */


    @FindBy(css = "tr.grid-header-row")
    public WebElement headerOptionsTable;

    @FindBy(css = "span.grid-header-cell__label")
    public List<WebElement> tableOptions;
    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMsg;




    public void accessVehicleModel() {

        BrowserUtils.sleep(2);
        BrowserUtils.waitForVisibility(this.fleet, 20);
        this.fleet.click();
        this.vehiclesModel.click();
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            elemTexts.add(list.get(i).getText());
        }
        return elemTexts;
    }

    //This is for Jonny
    /*@FindBy(xpath = "//tbody//tr[contains(.,'228')]//a[@title='View']/../../..//li")
    public List<WebElement> threeOptions;*/

    /*
     for (int i = 0; i < vehicleModel.threeOptions.size(); i++) {
        Assert.assertTrue(vehicleModel.threeOptions.get(0).getAttribute("title").equals("View") && vehicleModel.threeOptions.get(1).getAttribute("title").equals("Edit") && vehicleModel.threeOptions.get(2).getAttribute("title").equals("Delete"));
    }*/

}
