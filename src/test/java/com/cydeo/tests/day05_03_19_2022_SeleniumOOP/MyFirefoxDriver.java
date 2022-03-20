package com.cydeo.tests.day05_03_19_2022_SeleniumOOP;

public class MyFirefoxDriver extends MyRemoteWebDriver {


    @Override
    public void executeScript() {
        System.out.println("Firefox is executing script");
    }

    @Override
    public void findElement() {
        System.out.println("Firefox is finding element");
    }

    @Override
    public void findElements() {
        System.out.println("Firefox is finding elements");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox is taking screenshot");
    }

    @Override
    public void get(String url) {
        System.out.println("Firefox is going to "+ url);
    }

    @Override
    public void getTitle() {
        System.out.println("Firefox is getting title");
    }

}
