package com.anhtester.bai14_javaexecutor;

import com.anhtester.LocatorCRM;
import com.anhtester.common.BaseTest;
import com.anhtester.keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoJavaExecutor extends BaseTest {
    @Test
    public void jsExecutorDemo01() throws InterruptedException {
        // Creating the JavascriptExecutor interface object
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get(LocatorCRM.url);
        Thread.sleep(1000);
        WebElement butonLogin = driver.findElement(By.xpath(LocatorCRM.buttonLogin));
        WebElement inputEmail = driver.findElement(By.xpath(LocatorCRM.inputEmail));
        WebElement inputPassword = driver.findElement(By.xpath(LocatorCRM.inputPassword));

//        driver.get("https://anhtester.com/");
        Thread.sleep(1000);
        WebUI.highlightElement(driver, inputEmail);
        js.executeScript("arguments[0].setAttribute('value','admin@example.com');", inputEmail);
        WebUI.highlightElement(driver, inputPassword, "red");
        js.executeScript("arguments[0].setAttribute('value','123456');", inputPassword);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", butonLogin);

//        // Click on "Website Testing" module using JavascriptExecutor
//        WebElement button = driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']"));
//        js.executeScript("arguments[0].click();", button);
//        Thread.sleep(1000);

//        // Get page title and Domain using JavascriptExecu1tor
//        String titleText = js.executeScript("return document.title;").toString();
//        System.out.println("Page Title is: " + titleText);
//
//        String domainName = js.executeScript("return document.domain;").toString();
//        System.out.println("Domain is: " + domainName);
//
//        // Add Alert window using JavascriptExecutor
//        js.executeScript("alert('Successfully Logged In');");

        Thread.sleep(2000);
    }
}
