package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventPage_Van {
    public CalendarEventPage_Van(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='container']/div[2]//div[2]/div/a")
    public WebElement createCalenderEventButton;

    @FindBy(xpath = "//a[@class='oro-dropdown-toggle']//i[@class='fa-bars']")
    public WebElement iBars;

    @FindBy(css = "li[class='first'] a")
    public WebElement linkCreateCalendarEventEvents;

    

}
