package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {

    @Test
    public void cfirstTest(){
        System.out.println("this is my first test");
    }

    @Test
    public void asecondTest(){
        System.out.println("this is second test");
    }

    @Test
    public void bthirdTest(){
        System.out.println("this is third test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("******************pre-condition******************");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("******************after-condition******************");
    }

}
