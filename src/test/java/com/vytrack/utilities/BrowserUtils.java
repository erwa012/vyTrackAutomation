package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {
    //Methods are Static. Because we do not want to create an object to call those methods.
    // We just want call those methods with class name. That is whey they are static type

    /*
     *This method is used to pause the code for given seconds
     * It is static method we can call with class name
     * BrowserUtils.sleep(3); -> call in other classes
     * @param seconds
     */

    public static void sleep(int seconds) { // static -> called methods  with class name
        // Thread.sleep(); method com from Tread, we made sleep() method -> com from BrowserUtils
        // 1 second = 1000 millisecond
        // millis = seconds*1000

        try {
            Thread.sleep(seconds * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method!");
        }
    }
    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle
    // BrowserUtils.verifyTitle(driver,"Google") //-> call
    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
