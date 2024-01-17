package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MarketingPage extends BasePage{

    public MarketingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class='column-manager dropdown']")
    public WebElement gearIcon;

    @FindBy (xpath = "//label[.='Code']/../..//input[contains(@id,'column-c')]")
    public WebElement gearIcon_Code;

    @FindBy (xpath = "//label[.='End Date']/../..//input[contains(@id,'column-c')]")
    public WebElement gearIcon_EndDate;

    @FindBy (xpath = "//td[@class='visibility-cell']//input")
    public List<WebElement> gearIconElements;




}
