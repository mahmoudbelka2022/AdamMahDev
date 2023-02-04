package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

    public Registration(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"cta\"]/div/a")
    public WebElement getStart;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElement lasttName;

    @FindBy(xpath = "//*[@id=\"male\"]")
    public WebElement male;

    @FindBy(xpath = "//*[@id=\"female\"]")
    public WebElement female;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"number\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/form/input")
    public WebElement submit;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    public WebElement continueButt;



}
