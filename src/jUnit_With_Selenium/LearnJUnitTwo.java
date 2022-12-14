package jUnit_With_Selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
public class LearnJUnitTwo {
    @Before
    public void beforeTest(){
        System.out.println("This is my test");
    }@After
    public void afterTest(){
        System.out.println("This is After Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }
}
