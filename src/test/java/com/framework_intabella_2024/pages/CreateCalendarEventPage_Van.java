package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage_Van {
    public CreateCalendarEventPage_Van(){
    PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css= "*[id^='recurrence-repeat-view']")
    public WebElement repeatCheckBox;
    @FindBy(xpath = "//*[.='day(s)']/../input[3]")
    public WebElement repeatEveryBox;
    @FindBy(css = "span[id^='temp-validation-name']")
    public WebElement Erromsg;



  
}
