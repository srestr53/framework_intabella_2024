package com.framework_intabella_2024.pages;

import com.framework_intabella_2024.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage_Firyuza {

    public PinbarPage_Firyuza(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//a[.='Learn how to use this space']")
    public WebElement PinbarLink;

    @FindBy(xpath = "//div[@class='clearfix']/h3")
    public WebElement Header;

    @FindBy(xpath ="//div[@class='clearfix']/p[contains(.,'Use pin icon')]")
    public WebElement description;

    @FindBy(xpath = "//div[@class='clearfix']//img")
    public WebElement imageSource;




}
