package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage_Van {
    public DashBoardPage_Van(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="(//span[contains(text(),'Activities')])[1]")
    public WebElement activitiesModle;
    @FindBy(xpath = "//*[.='Calendar Events']")
    public WebElement calenderEventButton;



    
    

}
