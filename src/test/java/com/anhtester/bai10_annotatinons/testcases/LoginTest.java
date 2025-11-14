package com.anhtester.bai10_annotatinons.testcases;

import com.anhtester.LocatorCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(priority = 1)
    public void testLoginSuccess() throws InterruptedException {
        System.out.println("Starting Login Success Test");
        driver.get(LocatorCRM.url);
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.buttonLogin)).click();
        Thread.sleep(2000);
        System.out.println("This is Login Success Test");
    }

    @Test(priority = 2)
    public void testLoginFalseWithEmail() throws InterruptedException {
        System.out.println("Starting Login Failed Test with wrong email");
        driver.get(LocatorCRM.url);
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin123@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.buttonLogin)).click();
        Thread.sleep(1000);
        System.out.println("Dang nhap khong thanh cong sai email");
    }

}
