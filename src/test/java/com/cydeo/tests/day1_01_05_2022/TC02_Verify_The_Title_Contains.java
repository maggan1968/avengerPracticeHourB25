package com.cydeo.tests.day1_01_05_2022;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC02_Verify_The_Title_Contains {
    public static void main(String[] args) {
        //Setup the "browser driver"
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Go to "https://www.selenium.dev"
        driver.get("https://www.selenium.dev");

        //Verify the title contains "Selenium"
        WebElement TitleContainsWebElement = driver.findElement(By.partialLinkText("Selenium automates browsers. That's it!"));
         TitleContainsWebElement.sendKeys("Selenium");

        System.out.println("TitleContainsWebElement = " + TitleContainsWebElement);
        }

         }


