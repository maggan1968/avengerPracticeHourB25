package com.cydeo.tests.day2_12_02_2022;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC05_url_Contains_Login {
    public static void main(String[] args) {
       // TC:5 As a user I should be able to see the login page

        //1-open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-click Login label
        WebElement loginWebElement = driver.findElement(By.xpath("//ul[@id='top-menu']//a[.='LOGIN']"));

        //mac: command+ option+T to put Thread. sleep inside in tey/catch
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginWebElement.click();
        //4-verify the url contains login
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("login")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.close();


    }
}
