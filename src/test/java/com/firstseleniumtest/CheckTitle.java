package com.firstseleniumtest;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckTitle {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/kamalbelkati/Documents/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testTitle(){
        driver.get(ConfigurationReader.getProperty("myweburl"));

        //System.out.println(driver.getTitle());

        String exepted = "AdamDev";
        String result = driver.getTitle();

        Assert.assertEquals(exepted , result);

        BrowserUtils.sleep(5);

        driver.findElement(By.xpath("//*[@id=\"cta\"]/div/a")).sendKeys(Keys.ENTER);



    }

}
