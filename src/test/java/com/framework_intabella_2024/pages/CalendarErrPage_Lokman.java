package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarErrPage_Lokman extends BasePage {

    public CalendarErrPage_Lokman() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//span[.='Calendar Events']")
    public WebElement calendarEvents;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createEvent;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement repeatEvery;

    @FindBy(xpath = "//span//*[contains(., 'The value have not to be')]")
    public WebElement actualErrorMsg;


}
