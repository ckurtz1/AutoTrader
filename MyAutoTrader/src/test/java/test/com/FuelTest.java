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
public class FuelTest {
        WebDriver driver;
    private String baseUrl;
    
    public FuelTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
@Test
    public void fueleconForm() {  
        System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Search"));  
        
      //MPG
      // Select all
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[1]/div[1]")).click();
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[2]/div[1]")).click();
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[3]/div[1]")).click();
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[4]/div[1]")).click();
      //Deselect all
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[1]/div[1]")).click();
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[2]/div[1]")).click();
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[3]/div[1]")).click();
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[4]/div[1]")).click();
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[4]/div[1]")).click();

      // Select 1
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[1]/div[1]")).click();
      //Deselect 1
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[1]/div[1]")).click();

      // Select 2
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[2]/div[1]")).click();
      //Deselect 2
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[2]/div[1]")).click();
      
      // Select 3
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[3]/div[1]")).click();
      //Deselect 3
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[3]/div[1]")).click();
      
      // Select 4
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[4]/div[1]")).click();
      //Deselect 4
      driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[11]/div/div[2]/div/div/label[4]/div[1]")).click();
      
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
