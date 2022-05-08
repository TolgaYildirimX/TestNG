package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginExample {

    public static WebDriver driver;

    // to login şnto syntax HRMS app with following credentials
    // userName: Admin
    //pass: 12345
    @Test
    public void ainvalidCredentials1(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("12345");
        driver.findElement(By.id("btnLogin")).click();
        String text= driver.findElement(By.id("spanMessage")).getText();
        System.out.println(text);
    }


    // to login şnto syntax HRMS app with following credentials
    // userName: NoAdmin
    //pass: 123456
    @Test
    public void binvalidCredentials2(){
        driver.findElement(By.id("txtUsername")).sendKeys("NoAdmin");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text= driver.findElement(By.id("spanMessage")).getText();
        System.out.println(text);
    }

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
