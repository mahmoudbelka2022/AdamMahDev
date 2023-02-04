package com.tests;

import com.pages.Registration;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import net.bytebuddy.implementation.ToStringMethod;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class RegFormTest {

         Registration registration = new Registration();


         @Test
         public void TestAllForm(){

             Driver.getDriver().get(ConfigurationReader.getProperty("myweburl"));

             registration.getStart.sendKeys(Keys.ENTER);

             registration.firstName.sendKeys("Ahmet");

             registration.lasttName.sendKeys("Balgi");

             registration.male.click();

             registration.email.sendKeys("ahmet@gmail.com");

             registration.password.sendKeys("ahmet1234");

             registration.phoneNumber.sendKeys("5711120998");

             registration.submit.sendKeys(Keys.ENTER);

             registration.continueButt.sendKeys(Keys.ENTER);


















         }

}
