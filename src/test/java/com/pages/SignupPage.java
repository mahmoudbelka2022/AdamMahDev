package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    public SignupPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "firstname")
    public WebElement firstName;

    @FindBy(name = "lastname")
    public WebElement lastName;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "number")
    public WebElement phoneNum;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButt;

    @FindBy(xpath = "//p[contains(text(),\"You've been succesfully signed up\")]")
    public WebElement message;

}
