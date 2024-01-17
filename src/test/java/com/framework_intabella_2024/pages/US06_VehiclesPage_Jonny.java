package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US06_VehiclesPage_Jonny extends BasePage {
    public US06_VehiclesPage_Jonny() {
        PageFactory.initElements(Driver.getDriver(), this);

        }

    @FindBy(xpath = "//*[text() = 'Vehicles']")
    public WebElement vehiclesOption;

        @FindBy(css = ".more-bar-holder")
        public List<WebElement> threeDotOptions;
        @FindBy(css = ".fa-eye.hide-text")
        public WebElement view;
        @FindBy(css = ".fa-eye.hide-text")
        public WebElement edit;
        @FindBy(css = ".fa-eye.hide-text")
        public WebElement delete;


    }
