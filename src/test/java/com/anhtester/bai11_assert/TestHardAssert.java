package com.anhtester.bai11_assert;

import com.anhtester.LocatorCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestHardAssert extends BaseTest {
    String customerName = "Hapt Test Company 001";
    @Test(enabled = false)
    public void testHardAssert() {

        driver.get("https://anhtester.com");

        String expectedTitle = "Anh Tester Automation Testing";
        String actualTitle = driver.getTitle();

        System.out.println("*** Checking For The Title ***");

        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match! (Tiêu đề không khớp!)");
    }
    @Test(priority = 2)
    public void testLogin() throws InterruptedException {
        driver.get(LocatorCRM.url);
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.buttonLogin)).click();
        Thread.sleep(2000);
//        boolean checkDashboard = driver.findElement(By.xpath(LocatorCRM.menuDashboard)).isDisplayed();
        List<WebElement> checkmenuDashboard = driver.findElements(By.xpath(LocatorCRM.menuDashboard));
//        System.out.println("Số lượng phần tử tìm thấy: " + elements.size());
        Assert.assertTrue(checkmenuDashboard.size() > 0, "Login failed - Đăng nhập không thành công");
        System.out.println("Đăng nhập thành công");
    }
    @Test(priority = 3)
    public void addNewCustomer() throws InterruptedException {
        driver.get(LocatorCRM.url);
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.buttonLogin)).click();
        Thread.sleep(2000);
//        boolean checkDashboard = driver.findElement(By.xpath(LocatorCRM.menuDashboard)).isDisplayed();
        List<WebElement> checkmenuDashboard = driver.findElements(By.xpath(LocatorCRM.menuDashboard));
//        System.out.println("Số lượng phần tử tìm thấy: " + elements.size());
        Assert.assertTrue(checkmenuDashboard.size() > 0, "Login failed - Đăng nhập không thành công");
        System.out.println("Đăng nhập thành công");

        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        List<WebElement> checkheaderCustomer = driver.findElements(By.xpath(LocatorCRM.headerCustomerPage));
        Assert.assertTrue(checkheaderCustomer.size() > 0, "Customer page is not displayed - Trang Khách hàng không hiển thị");
        String headerText = driver.findElement(By.xpath(LocatorCRM.headerCustomerPage)).getText();
        Assert.assertEquals(headerText, "Customers Summary", "Customer page header text does not match - Tiêu đề trang Khách hàng không khớp");
        System.out.println("Trang Khách hàng hiển thị thành công");
        driver.findElement(By.xpath(LocatorCRM.buttonNewCustomer)).click();
        driver.findElement(By.xpath(LocatorCRM.inputCompany)).sendKeys(customerName);
        driver.findElement(By.xpath(LocatorCRM.inputVAT)).sendKeys("12");
        driver.findElement(By.xpath(LocatorCRM.inputPhone)).sendKeys("0818888888");
        driver.findElement(By.xpath(LocatorCRM.inputWebsite)).sendKeys("hapttest.com");
        driver.findElement(By.xpath(LocatorCRM.dropdownGroups)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputSearchGroups)).sendKeys("vip", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.dropdownGroups)).click();
        driver.findElement(By.xpath(LocatorCRM.dropdownCurrency)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputSearchCurrency)).sendKeys("usd", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.dropdownDefaultLanguage)).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath(LocatorCRM.clickValueDefaultLanguage)).click();
//        driver.findElement(By.xpath(LocatorCRM.selectValueLanguage("Czech"))).click();
        driver.findElement(By.xpath(String.format(LocatorCRM.clickValueDefaultLanguageDynamic, "English"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputAddress)).sendKeys("Hanoi, Vietnam");
        driver.findElement(By.xpath(LocatorCRM.inputCity)).sendKeys("Hanoi");
        driver.findElement(By.xpath(LocatorCRM.inputState)).sendKeys("Ba Dinh");
        driver.findElement(By.xpath(LocatorCRM.inputZipCode)).sendKeys("100000");
        driver.findElement(By.xpath(LocatorCRM.dropdownCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorCRM.inputSearchCountry)).sendKeys("viet", Keys.ENTER);
        Thread.sleep(1000);
//        driver.findElement(By.xpath(LocatorCRM.buttonSave)).click();
        Thread.sleep(2000);
    }
}
