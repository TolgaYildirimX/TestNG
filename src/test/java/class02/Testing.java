package class02;

import org.testng.annotations.*;

public class Testing {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BEFORE SUITE !!!!!");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AFTER SUITE !!!!!!");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BEFORE TEST");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AFTER TEST");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("this is after class");
    }



    @BeforeMethod
    public void before(){
        System.out.println("this is before method");
    }

    @AfterMethod
    public void after(){
        System.out.println("this is after method");
    }


    @Test
    public void test(){
        System.out.println("fist");
    }

    @Test
    public void test2(){
        System.out.println("second");
    }

}
