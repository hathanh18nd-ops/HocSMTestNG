package com.anhtester.bai10_annotatinons;

import org.testng.annotations.*;

public class Demo_Anotations_2 {
//    @BeforeSuite
//    public void beforeSuite() {
//        System.out.println("Chạy trước toàn bộ suite");
//    }
//
//    @AfterSuite
//    public void afterSuite() {
//        System.out.println("Chạy sau toàn bộ suite");
//    }
//
    @BeforeTest
    public void beforeTest() {
        System.out.println("Chạy trước tất cả các test trong một thẻ <test> 2");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Chạy sau tất cả các test trong một thẻ <test> 2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Chạy trước tất cả các test trong class này 2");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Chạy sau tất cả các test trong class này 2");
    }

    @Test
    public void test_A_LoginSuccess() {
        System.out.println("This is Login Success Test 2");
    }

    @Test
    public void test_B_LoginFailed() {
        System.out.println("This is Login Failed Test 2");
    }
}
