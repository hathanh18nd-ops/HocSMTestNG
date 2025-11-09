package com.anhtester.bai9_setup_testNG.anhtester2;

import org.testng.annotations.Test;

public class DemoTestNG2 {
    @Test(groups = {"smoke","regression"})
    public void testCase1() {
        System.out.println("This is Test Case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("This is Test Case 2");
    }

    @Test(groups = {"smoke"})
    public void testCase3() {
        System.out.println("This is Test Case 3");
    }

    @Test(groups = {"smoke","regression"})
    public void testCase4() {
        System.out.println("This is Test Case 4");
    }
}
