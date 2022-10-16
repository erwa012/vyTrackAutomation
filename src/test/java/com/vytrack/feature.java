package com.vytrack;

import com.vytrack.utilities.Browser;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class feature {

    @Test
    public void test_calendar_user(){
        // 1. Users are on the homepage
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
        WebElement login = Driver.getDriver().findElement(By.xpath("//*[@id=\"prependedInput\"]"));
        login.sendKeys("user25");
        WebElement password = Driver.getDriver().findElement(By.xpath("//*[@id=\"prependedInput2\"]"));
        password.sendKeys("UserUser123");
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"_submit\"]"));
        Browser.takeScreenshot("1");
        loginButton.click();
        Browser.sleep(3);

        // 2. Click the “Calendar Events” under the Activities
        Actions ac = new Actions(Driver.getDriver());
        WebElement activities = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]"));
        ac.moveToElement(activities).build().perform();
        Browser.sleep(3);
        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span"));
        Browser.takeScreenshot("2");
        calendarEvents.click();
        Browser.sleep(3);

        // 3. Click the “Create Calendar Event” button
        WebElement createCalendarEventButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a"));
        Browser.takeScreenshot("3");
        createCalendarEventButton.click();
        Browser.sleep(3);

        // 4. Write a message in the Description field
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[//*[@id=\"calendarevent-form\"]/div/div/ul/li[1]/a]")));
        WebElement descriptionField = Driver.getDriver().findElement(By.xpath("//*[@id=\"tinymce\"]"));
        descriptionField.sendKeys("Saim compresses his files by doing a flying round house kick to the hard drive.");
        Browser.takeScreenshot("4");

        // 5. Verify the message is written in the input box
        Assert.assertTrue(descriptionField.isDisplayed());
    }

    @Test
    public void test_calendar_storemanager(){
        // 1. Users are on the homepage
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
        WebElement login = Driver.getDriver().findElement(By.xpath("//*[@id=\"prependedInput\"]"));
        login.sendKeys("storemanager71");
        WebElement password = Driver.getDriver().findElement(By.xpath("//*[@id=\"prependedInput2\"]"));
        password.sendKeys("UserUser123");
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"_submit\"]"));
        Browser.takeScreenshot("1");
        loginButton.click();
        Browser.sleep(3);

        // 2. Click the “Calendar Events” under the Activities
        Actions ac = new Actions(Driver.getDriver());
        WebElement activities = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]"));
        ac.moveToElement(activities).build().perform();
        Browser.sleep(3);
        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[4]/a/span"));
        Browser.takeScreenshot("2");
        calendarEvents.click();
        Browser.sleep(3);

        // 3. Click the “Create Calendar Event” button
        WebElement createCalendarEventButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a"));
        Browser.takeScreenshot("3");
        createCalendarEventButton.click();
        Browser.sleep(3);

        // 4. Write a message in the Description field
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[//*[@id=\"calendarevent-form\"]/div/div/ul/li[1]/a]")));
        WebElement descriptionField = Driver.getDriver().findElement(By.xpath("//*[@id=\"tinymce\"]"));
        descriptionField.sendKeys("Saim compresses his files by doing a flying round house kick to the hard drive.");
        Browser.takeScreenshot("4");

        // 5. Verify the message is written in the input box
        Assert.assertTrue(descriptionField.isDisplayed());
    }

    @Test
    public void test_calendar_salesmanager(){
        // 1. Users are on the homepage
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
        WebElement login = Driver.getDriver().findElement(By.xpath("//*[@id=\"prependedInput\"]"));
        login.sendKeys("salesmanager121");
        WebElement password = Driver.getDriver().findElement(By.xpath("//*[@id=\"prependedInput2\"]"));
        password.sendKeys("UserUser123");
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"_submit\"]"));
        Browser.takeScreenshot("1");
        loginButton.click();
        Browser.sleep(3);

        // 2. Click the “Calendar Events” under the Activities
        Actions ac = new Actions(Driver.getDriver());
        WebElement activities = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]"));
        ac.moveToElement(activities).build().perform();
        Browser.sleep(3);
        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/div/div/ul/li[4]/a/span"));
        Browser.takeScreenshot("2");
        calendarEvents.click();
        Browser.sleep(3);

        // 3. Click the “Create Calendar Event” button
        WebElement createCalendarEventButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a"));
        Browser.takeScreenshot("3");
        createCalendarEventButton.click();
        Browser.sleep(3);

        // 4. Write a message in the Description field
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[//*[@id=\"calendarevent-form\"]/div/div/ul/li[1]/a]")));
        WebElement descriptionField = Driver.getDriver().findElement(By.xpath("//*[@id=\"tinymce\"]"));
        descriptionField.sendKeys("Saim compresses his files by doing a flying round house kick to the hard drive.");
        Browser.takeScreenshot("4");

        // 5. Verify the message is written in the input box
        Assert.assertTrue(descriptionField.isDisplayed());
    }
}
