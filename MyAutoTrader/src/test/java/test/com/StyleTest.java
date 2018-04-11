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
public class StyleTest {
        WebDriver driver;
    private String baseUrl;
    
    public StyleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    @Test
    public void styleForm1() {       
        System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Search"));
        /// Style
        // Select and Deselect each style.
         
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label")).click();   //  "Convertible");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label")).click();   //  "Convertible");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label[2]/div")).click();   //  "Coupe");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label[2]/div")).click();   //  "Coupe");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label[3]/div")).click();   //  "Hatchback");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label[3]/div")).click();   //  "Hatchback");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label/div")).click();   // , "Sedan");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label/div")).click();   // , "Sedan");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label[2]")).click();   //  "SUV/Crossover");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label[2]")).click();   //  "SUV/Crossover");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label[3]/div")).click();   //  "Truck");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label[3]/div")).click();   //  "Truck");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[3]/label/div")).click();   //  "Van/Minivan");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[3]/label/div")).click();   //  "Van/Minivan");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[3]/label[2]")).click();   //  "Wagon");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[3]/label[2]")).click();   //  "Wagon");
    
 
        
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label")).click();   //  "Convertible");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label[2]/div")).click();   //  "Coupe");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label[3]/div")).click();   //  "Hatchback");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label/div")).click();   // , "Sedan");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label[2]")).click();   //  "SUV/Crossover");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label[3]/div")).click();   //  "Truck");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[3]/label/div")).click();   //  "Van/Minivan");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[3]/label[2]")).click();   //  "Wagon");
        //deselect
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label")).click();   //  "Convertible");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label[2]/div")).click();   //  "Coupe");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div/label[3]/div")).click();   //  "Hatchback");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label/div")).click();   // , "Sedan");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label[2]")).click();   //  "SUV/Crossover");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label[3]/div")).click();   //  "Truck");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[3]/label/div")).click();   //  "Van/Minivan");
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[3]/label[2]")).click();   //  "Wagon");
        
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
