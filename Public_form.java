package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Public_form {
    private static final Log log = LogFactory.getLog(Public_form.class);

    public static void main (String[] args) throws InterruptedException, AWTException, IOException, TesseractException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--start-maximized");
        chrome.addArguments("--remote-allow-origins=*");
        chrome.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chrome);
        driver.get("https://staging.eegdatahub.com/patient-form/e5f5a5e5-2ccf-4973-a47b-615609741170");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.id("first_Name")).sendKeys("Hari");
        driver.findElement(By.id("last_Name")).sendKeys("Rush order");

        WebElement date = driver.findElement(By.xpath("//input[@placeholder='Select date']"));
        date.click();
        date.sendKeys("06-09-2000" + Keys.ENTER);

        driver.findElement(By.xpath("//input[@id='birth']")).click();
        driver.findElement(By.xpath("//div[@title='Male']")).click();


        WebElement dropdown = driver.findElement(By.xpath("//input[@id='birthIdentity']"));
        dropdown.click();
        Thread.sleep(2000);

        //       driver.findElement(By.xpath("((//span[contains(@class, 'ant-select-selection-item') and @title=\"Male\"])[last()]")).click();
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_DOWN);  // Press Down Arrow (Adjust if necessary)
        robot1.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(500);
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);
        //  String s=driver.findElement(By.xpath("//input[@placeholder='Male']")).getAttribute("placeholder");
        //System.out.println(s);


        driver.findElement(By.id("email")).sendKeys("arunpandian.a@kosoft.co");

        driver.findElement(By.xpath("//input[@id='contactphone']")).sendKeys("9597224187");

        driver.findElement(By.xpath("//input[@id='handedness']")).click();
        driver.findElement(By.xpath("//*[text()='Right Hand']")).click();

        Thread.sleep(1000);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);


        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[1]/div[4]/table/tbody/tr[1]/td[2]/label/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[1]/div[4]/table/tbody/tr[2]/td[2]/label/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[1]/div[4]/table/tbody/tr[3]/td[2]/label/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[1]/div[4]/table/tbody/tr[4]/td[2]/label/span/input")).click();

        Thread.sleep(1000);
        JavascriptExecutor k = (JavascriptExecutor) driver;
        k.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[1]/div[4]/table/tbody/tr[5]/td[2]/label/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[1]/div[4]/table/tbody/tr[6]/td[2]/label/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[1]/div[4]/table/tbody/tr[7]/td[2]/label/span/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/div[1]/div[4]/table/tbody/tr[8]/td[2]/label/span/input")).click();
//        Thread.sleep(1000);
//        Robot robot2 = new Robot();
//        robot2.keyPress(KeyEvent.VK_TAB);  // Press Down Arrow (Adjust if necessary)
//        robot2.keyRelease(KeyEvent.VK_TAB);
//        Thread.sleep(1000);


        WebElement drop = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[1]/div[6]/div/div[2]/div[1]/div"));
        drop.click();
        driver.findElement(By.xpath("(//input[@type='search'])[6]")).sendKeys("JANUMET (Oral Pill)");
        Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[2]/div[2]/div[1]")).click();
        Actions action1 = new Actions(driver);
        action1.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        JavascriptExecutor last = (JavascriptExecutor) driver;
        last.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);


//
//        driver.findElement(By.xpath("//input[@placeholder='Enter Captcha Value']")).click();
//
//
//        //Enter the captcha manually
//
//        Thread.sleep(20000);
//
//        driver.findElement(By.xpath("//button[@type='submit']")).click();




//        WebElement scrollableDiv = driver.findElement(By.cssSelector("h6.termcontent.scrollable-term-container"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = ((Number) js.executeScript("return arguments[0].scrollHeight;", scrollableDiv)).longValue();
//        long clientHeight = ((Number) js.executeScript("return arguments[0].clientHeight;", scrollableDiv)).longValue();
//        long currentHeight =0 ;
//
//
//
//        while (currentHeight + clientHeight < lastHeight) {
//            js.executeScript("arguments[0].scrollTop += 90;", scrollableDiv);
//            Thread.sleep(100);
//            currentHeight = ((Number) js.executeScript("return arguments[0].scrollTop;", scrollableDiv)).longValue();
//
//            Actions fill = new Actions(driver);
//            fill.scrollToElement(scrollableDiv);
//            fill.sendKeys(Keys.ARROW_DOWN);
//
//
//        }
//        WebElement scrollableDiv = driver.findElement(By.cssSelector("h6.termcontent.scrollable-term-container"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        long lastHeight = ((Number) js.executeScript("return arguments[0].scrollHeight;", scrollableDiv)).longValue();
//        long clientHeight = ((Number) js.executeScript("return arguments[0].clientHeight;", scrollableDiv)).longValue();
//        long currentHeight = 0;
//
//        int maxTries = 50; // avoid infinite loop
//        int attempts = 0;
//
//        while ((currentHeight + clientHeight < lastHeight) && attempts < maxTries) {
//            js.executeScript("arguments[0].scrollTop += 90;", scrollableDiv);
//            Thread.sleep(100);
//            currentHeight = ((Number) js.executeScript("return arguments[0].scrollTop;", scrollableDiv)).longValue();
//            attempts++;
//        }
//
//        System.out.println("Scrolling completed or max tries reached.");
//
//
//
//        System.out.println("Scrolling completed!");
//
//
//
//
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//*[text()='I Agree']")).click();
//
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[text()='I Do Not Agree']")).click();
//        System.out.println("Customer click Do not agree");
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//span[text()='Ok']")).click();
//        System.out.println("Cancel the request");
//
//
//





    }
}

