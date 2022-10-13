package com.vytrack;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CalendarRepeatDayInputBox {

    // 3. Click the “Calendar Events” under the Activities
    // 4. Click the “Create Calendar Event” button
    // 5. Check the Repeat checkbox
    // 6. Users enter an INVALID integer (x<1 || x>99), Verify users get 2 error messages:
    // If enters less than 1 —> user should see “The value have not to be less than 1.”
    // If enters more than99 —> user should see “The value have not to be more than 99.”
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // 1. set up browser
        // 2. Go to website: https://qa1.vytrack.com/user/login
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa1.vytrack.com/user/login");
        WebElement usernameInput=driver.findElement(By.id("prependedInput"));
        usernameInput.sendKeys("user25");
        WebElement userPass = driver.findElement(By.id("prependedInput2"));
        userPass.sendKeys("UserUser123");
        WebElement signInBtn = driver.findElement(By.name("_submit"));
        signInBtn.click();

    }

    @Test
    public void verify_calendar_events_btn () {
        // 3. Click the “Calendar Events” under the Activities
        WebElement activities=driver.findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[3]"));
        activities.click();

        BrowserUtils.sleep(1);

        WebElement calendarEventsBtn = driver.findElement(By.xpath("//a[@href='/calendar/event']/span[@class='title title-level-2']"));
        calendarEventsBtn.click();

        WebElement calendarEventsCreat=driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
        calendarEventsCreat.click();

        BrowserUtils.sleep(1);

        //Assert.assertTrue(calendarEventsBtn.isDisplayed());
        WebElement reapet = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        reapet.click();
//input[@id='recurrence-repeat-view242']
        WebElement verifyOne = driver.findElement(By.xpath("(//label[@class='fields-row']//input[@class='recurrence-subview-control__number'])[1]"));
        // System.out.println(verifyOne.getText());//1

        String expectedOne= "1";
        String actualOne=verifyOne.getAttribute("value");

        Assert.assertEquals(actualOne,expectedOne,"Failed!");

        verifyOne.clear();

        WebElement redSign = driver.findElement(By.xpath("//span[@style='top: 445px; left: 1056px;']"));
        System.out.println(redSign.getText());
        String expectedText="This value should not be blank.";
        String actualText=redSign.getText();
        Assert.assertTrue(expectedText.equals("This value should not be blank."));
        verifyOne.sendKeys("-1");

        WebElement negativeNum=driver.findElement(By.xpath("//span[text()='The value have not to be less than 1.']"));
        String expectedNegative= "The value have not to be less than 1.";
        String actualNegative= negativeNum.getText();
        Assert.assertEquals(expectedNegative,actualNegative, "failed!!!");
        verifyOne.clear();
        BrowserUtils.sleep(1);
        verifyOne.sendKeys("101");
        WebElement over99 = driver.findElement(By.xpath("(//div[@class='recurrence-subview-control__item']/span//span)[2]"));
        String actualOverText=over99.getText();
        String expectedOverText="The value have not to be more than 99.";
        Assert.assertEquals(expectedOverText,actualOverText,"Failed99!");


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
