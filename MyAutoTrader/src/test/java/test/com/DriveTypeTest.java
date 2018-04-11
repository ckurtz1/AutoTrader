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
public class DriveTypeTest {
    WebDriver driver;
    private String baseUrl;

    
    public DriveTypeTest() {
       
    }


@Test
    public void drivetypeForm(){  
        
         System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Search"));
    
           
        //select all
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label/div")).click();   // "Front Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[2]/div")).click();   //"Rear Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[3]/div")).click();   // "AWD/4WD");        
        //deselect all
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label/div")).click();   // "Front Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[2]/div")).click();   //"Rear Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[3]/div")).click();   // "AWD/4WD"); 
        
        //fwd only
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label/div")).click();   // "Front Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label/div")).click();   // "Front Wheel Drive");
        //rwd only
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[2]/div")).click();   //"Rear Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[2]/div")).click();   //"Rear Wheel Drive");
        //4wd only
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[3]/div")).click();   // "AWD/4WD");        
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[3]/div")).click();   // "AWD/4WD");        

        //fwd & rwd
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label/div")).click();   // "Front Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[2]/div")).click();   //"Rear Wheel Drive");
        //fwd & 4wd
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[2]/div")).click();   //"Rear Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[3]/div")).click();   // "AWD/4WD");        
        //rwd & 4wd
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label/div")).click();   // "Front Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[2]/div")).click();   //"Rear Wheel Drive");
        //clean up
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label/div")).click();   // "Front Wheel Drive");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[2]/div")).click();   //"Rear Wheel Drive");   
        
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
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
