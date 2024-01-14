package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclePage_Van {
    public VehiclePage_Van(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement allCarsButton;

    @FindBy(xpath = "//*[@data-select]")
    public WebElement selectAllCar;
    @FindBy(xpath = "//*[@tabindex='-1' and @type='checkbox']")
    public List<WebElement> carOptions;
}
