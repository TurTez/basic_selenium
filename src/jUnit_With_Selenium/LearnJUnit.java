package jUnit_With_Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LearnJUnit {

    @Before
    public void beforeTest(){
        System.out.println("before test");
    }
    @After
    public void afterTest(){
        System.out.println("after test");
    }
    @Test //java look for @test to execute not the main
    public void testWD(){
        System.out.println("This is the test");
    }
}
