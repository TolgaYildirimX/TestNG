package class02;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing2 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("i am beforeSuite method");
    }

    @BeforeTest
    public void beforeTest2(){
        System.out.println("i am beforeTest for class2");
    }

    @Test
    public void testa(){
        System.out.println("fist2");
    }

    @Test
    public void testb(){
        System.out.println("second2");
    }

}
