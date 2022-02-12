package com.cydeo.tests.day2_12_02_2022;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
    public static void main(String[] args) {

        // TC:1 As a user I should be able to see Home is displayed

        //1-open a Chrome browser
        /**
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         try {
         Thread.sleep(2000);
         } catch (InterruptedException e) {
         e.printStackTrace();
         }
         **/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2-go to https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-verify Home is displayed
        WebElement homeWebElement = driver.findElement(By.xpath("//ul[@id='top-menu']/li[1]/a"));
        if (homeWebElement.isDisplayed()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}



