package com.vytrack.tests.ts57;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC57 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1. Set up browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa1.vytrack.com/user/login");

    }

    @Test
    public void tc57driver(){
        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
        inputUsername.sendKeys("user25");

        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
        inputPassword.sendKeys("UserUser123");

        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        WebElement lrnHowToUse= driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
        lrnHowToUse.click();
        WebElement msg1= driver.findElement(By.xpath("//h3[.='How To Use Pinbar']"));
        String actualMsg1= msg1.getText();
        String expectedMsg1= "How To Use Pinbar";

        WebElement msg2= driver.findElement(By.xpath("//p[1][normalize-space(.='             Use pin icon on the right top corner of page to create fast access link in the pinbar.         ')]"));
        String actualMsg2= msg2.getText();
        String expectedMsg2= "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertEquals(actualMsg1,expectedMsg1);
        Assert.assertEquals(actualMsg2,expectedMsg2);

        WebElement pinPic = driver.findElement(By.xpath("//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']"));
        System.out.println("pinPic.getAttribute(\"src\") = " + pinPic.getAttribute("src"));
        String actualSrc= pinPic.getAttribute("src");
        String expectedSrc= "/bundles/oronavigation/images/pinbar-location.jpg";
        if(actualSrc.endsWith(expectedSrc)){
            System.out.println("Image source verification passed");
        }}
        @Test
        public void tc57manager(){
            WebElement inputUsername = driver.findElement(By.id("prependedInput"));
            inputUsername.sendKeys("storemanager72");

            WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
            inputPassword.sendKeys("UserUser123");

            WebElement loginBtn = driver.findElement(By.id("_submit"));
            loginBtn.click();

            WebElement lrnHowToUse= driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
            lrnHowToUse.click();
            WebElement msg1= driver.findElement(By.xpath("//h3[.='How To Use Pinbar']"));
            String actualMsg1= msg1.getText();
            String expectedMsg1= "How To Use Pinbar";

            WebElement msg2= driver.findElement(By.xpath("//p[1][normalize-space(.='             Use pin icon on the right top corner of page to create fast access link in the pinbar.         ')]"));
            String actualMsg2= msg2.getText();
            String expectedMsg2= "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

            Assert.assertEquals(actualMsg1,expectedMsg1);
            Assert.assertEquals(actualMsg2,expectedMsg2);

            WebElement pinPic = driver.findElement(By.xpath("//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']"));
            System.out.println("pinPic.getAttribute(\"src\") = " + pinPic.getAttribute("src"));
            String actualSrc= pinPic.getAttribute("src");
            String expectedSrc= "/bundles/oronavigation/images/pinbar-location.jpg";
            if(actualSrc.endsWith(expectedSrc)){
                System.out.println("Image source verification passed");
            }}


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }}
