package com.anhtester.bai10_annotatinons;

import org.testng.annotations.*;

public class Demo_Anotations {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite Chạy trước toàn bộ suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite Chạy sau toàn bộ suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest Chạy trước tất cả các test trong một thẻ <test>");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest Chạy sau tất cả các test trong một thẻ <test>");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass Chạy trước tất cả các test trong class này");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass Chạy sau tất cả các test trong class này");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod Chạy trước mỗi phương thức test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod Chạy sau mỗi phương thức test");
    }

    @BeforeGroups("login")
    public void beforeGroup() {
        System.out.println("BeforeGroups Chạy trước nhóm test login");
    }

    @AfterGroups("login")
    public void afterGroup() {
        System.out.println("AfterGroups Chạy sau nhóm test login");
    }

    @Test
    public void test_A_LoginSuccess() {
        System.out.println("This is Login Success Test");
    }

    @Test
    public void test_B_LoginFailed() {
        System.out.println("This is Login Failed Test");
    }
    @Test
    public void test_B_LoginEmailFailed() {
        System.out.println("This is Login email Failed Test");
    }
    @Test(groups = {"login", "regression"})
    public void test_B_LoginPassFailed() {
        System.out.println("This is Login password Failed Test");
    }
}
