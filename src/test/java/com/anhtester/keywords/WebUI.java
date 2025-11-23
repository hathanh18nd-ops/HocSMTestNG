package com.anhtester.keywords;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebUI {
    public static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "arguments[0].style.border='1px solid red'";
        js.executeScript(script, element);
    }
    public static void highlightElement(WebDriver driver, WebElement element, String color) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "arguments[0].style.border='1px solid "+color+"'";
        js.executeScript(script, element);
    }
}
