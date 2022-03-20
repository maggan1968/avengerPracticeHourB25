package com.cydeo.tests.day05_03_19_2022_SeleniumOOP;

public class MyChromeDriver extends MyRemoteWebDriver{

    @Override
    public void executeScript() {
        System.out.println("Chrome is executing script");
    }

    @Override
    public void findElement() {
        System.out.println("Chrome is finding element");
    }

    @Override
    public void findElements() {
        System.out.println("Chrome is finding elements");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome is taking screenshot");
    }

    @Override
    public void get(String url) {
        System.out.println("Chrome is going to "+ url);
    }

    @Override
    public void getTitle() {
        System.out.println("Chrome is getting title");
    }
}
