package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AllVehicleCostsPage extends BasePage{
    public AllVehicleCostsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class='btn-group dropdown']//input")
    public WebElement firstCheckBox;

    @FindBy (xpath = "//span[@class='grid-header-cell__label']")
    public List<WebElement> firstColumnNames;


    @FindBy (xpath = "//tbody[@class='grid-body']//tr//input")
    public List<WebElement> AllColumnsCheckBox;

}
