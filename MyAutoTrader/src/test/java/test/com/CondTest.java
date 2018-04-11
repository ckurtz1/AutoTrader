/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
public class CondTest {
    WebDriver driver;
    private String baseUrl;
    
    public CondTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void condForm() {
        System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Search"));
            //Condition Select all three options    
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div/label/div")).click();   // This selects NEW!!!!!!!!!1
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[2]/label/div")).click();// This selects USED!!!!!!!!!1
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[3]/label/div")).click();// This selects CERTIFIED!!!!!!!!!1

            // new used
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[3]/label/div")).click();// This deselects CERTIFIED!!!!!!!!!1
            
            //new cert
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[3]/label/div")).click();// This selects CERTIFIED!!!!!!!!!1
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[2]/label/div")).click();// This deselects USED!!!!!!!!!1
                     
            // just new
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[3]/label/div")).click();// This deselects CERTIFIED!!!!!!!!!1
            
            // used cert
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div/label/div")).click();   // This deselects NEW!!!!!!!!!1
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[3]/label/div")).click();// This selects CERTIFIED!!!!!!!!!1
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[2]/label/div")).click();// This selects USED!!!!!!!!!1
                        
            // just used
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[3]/label/div")).click();// This deselects CERTIFIED!!!!!!!!!1
            
            //just cert
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[3]/label/div")).click();// This selects CERTIFIED!!!!!!!!!1
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[2]/label/div")).click();// This deselects USED!!!!!!!!!1
            
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
        baseUrl ="https://www.autotrader.com/cars-for-sale/";
        //baseUrl ="https://www.autotrader.com";

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
