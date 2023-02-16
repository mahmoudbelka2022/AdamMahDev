package com.step_definitions;

import com.pages.SignupPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserSignup {

    SignupPage signupPage = new SignupPage();

    @Given("I am on the sign up page")
    public void i_am_on_the_sign_up_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters firstname lastname email password and number")
    public void user_enters_firstname_lastname_email_password_and_number() {
        signupPage.firstName.sendKeys("Sami");
        signupPage.lastName.sendKeys("Lazrak");
        signupPage.email.sendKeys("sami@gmail.com");
        signupPage.password.sendKeys("sami1999");
        signupPage.phoneNum.sendKeys("2022224508");

    }
    @When("User click on sign up button")
    public void user_click_on_sign_up_button() {
        signupPage.submitButt.click();

    }
    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        String actual = signupPage.message.getText();
        String exepted = "You've been succesfully signed up";

        Assert.assertEquals(exepted,actual);

        Driver.getDriver().close();

    }

}
