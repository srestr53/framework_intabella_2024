package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesOdometersPage extends BasePage{
    public VehiclesOdometersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement S_ManagerErrorMessage;


    @FindBy (xpath = "//input[@type='number']")
    public WebElement page;

    //button[@class='btn dropdown-toggle ']

    @FindBy (xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPage;

}
