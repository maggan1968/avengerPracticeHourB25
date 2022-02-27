package com.cydeo.tests.day2_12_02_2022;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC07_User_Is_Joh_Doe {
    public static void main(String[] args) {


        //TC:7 As a user I should be able to see User is John Doe

        //1-open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");
        //3-click Login label
       driver.findElement(By.xpath("//ul[@id='top-menu']/li[6]/a")).click();

        //4-enter username "User1"
        WebElement userNameWebElement = driver.findElement(By.xpath("//input[@id='prependedInput']"));
         userNameWebElement.sendKeys("User1");
        //5-enter password "UserUser123"
        WebElement passwordWebElement = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        passwordWebElement.sendKeys("UserUser123");
        //6-click LOG IN
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
        //7-verify the user John Doe
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String expectedUserName = "John Doe";
        WebElement actualUserName = driver.findElement(By.xpath("//a[@href='javascript: void(0);']"));
        String actualName = actualUserName.getText().trim();

        if(expectedUserName.equals(actualName)){
            System.out.println("USER NAME MATCHED EXPECTED RESULT!");
        }else{
            System.out.println("USER NAME DID NOT MATCH EXPECTED RESULT!");
        }

        driver.close();

    }
}
