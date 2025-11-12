package com.anhtester.bai10_annotatinons.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_Test {
    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest Chạy trước tất cả các test trong một thẻ <test>");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest Chạy sau tất cả các test trong một thẻ <test>");
    }
}
