package com.vytrack.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Browser {

    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds*1000);
        } catch(InterruptedException ie){
            ie.printStackTrace();
            System.out.println("Exception happened in sleep method!");
        }
    }

    // Function to Take screenshot
    public static void takeScreenshot(String FileName){
        try{
            File File = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(File, new File("C:\\Users\\ilyak\\OneDrive\\Pictures\\Screenshots\\vyTrack\\salesmanager\\salesmanager"
                    + FileName + ".jpeg"));
        } catch(IOException ie){
        }
    }
}
