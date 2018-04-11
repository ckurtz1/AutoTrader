/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ckurt
 */
public class ZipCodeTest {
    private WebDriver driver;
    private String baseUrl;
    
    public ZipCodeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void zipcode() {
        System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.titleContains("Search"));
    
        //  ZIP code 
        
        
        driver.findElement(By.name("zip")).sendKeys("11111");
        
        // Submit
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 30);

        WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        assertTrue(bodyText.contains("Enter a valid ZIP"));
        
        System.out.println("An incorrect ZIP code entry was detected");
        
        driver.quit();

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\data\\geckodriver.exe");

        //System.setProperty("webdriver.gecko.driver", "C:\\data\\geckodriver.exe");
        baseUrl ="https://www.autotrader.com/cars-for-sale/";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
