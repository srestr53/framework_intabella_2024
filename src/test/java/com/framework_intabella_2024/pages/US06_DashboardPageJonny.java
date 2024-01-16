package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_DashboardPageJonny extends BasePage {

    public US06_DashboardPageJonny() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//*[text() = 'Vehicles']")
        public WebElement vehiclesOption;
    }



