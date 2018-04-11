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
public class FeatureTest {
    WebDriver driver;
    private String baseUrl;
    
    public FeatureTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
    
     //FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\ckurt\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\mk4m2kov.tester"));
     //FirefoxOptions opt = new FirefoxOptions();
     //opt.setProfile(profile);
     //driver = new FirefoxDriver(opt);  
     //driver.get(baseUrl);
     
        System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Search"));
     
     //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ADD CODE HERE TO TEST
    //conv
     driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div/div")).click();
        //Select all 
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[3]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[4]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[5]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[6]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[7]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[8]/div")).click();
        
        //deSelect all 
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[3]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[4]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[5]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[6]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[7]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div[2]/div/div/label[8]/div")).click();

//Close conv
     driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div/div/div/div")).click();
 
     
     
    //lux
     driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div/div")).click();
    
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div[2]/div/div/label/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div[2]/div/div/label[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div[2]/div/div/label[3]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div[2]/div/div/label[4]/div")).click();

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div[2]/div/div/label/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div[2]/div/div/label[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div[2]/div/div/label[3]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div[2]/div/div/label[4]/div")).click();
      //lux close          
     driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[2]/div/div/div")).click();

//tech
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div/div")).click();//FUEL TYPE
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[7]/div")).click();

            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div[2]/div/div/label[7]/div")).click();

//tech close 
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[3]/div/div/div")).click();//FUEL TYPE


//misc
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[4]/div/div/div")).click();//TRUCK CAB SIZE
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[4]/div/div[2]/div/div/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[4]/div/div[2]/div/div/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[4]/div/div[2]/div/div/label[3]/div")).click();

            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[4]/div/div[2]/div/div/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[4]/div/div[2]/div/div/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[4]/div/div[2]/div/div/label[3]/div")).click();
  //misc close      
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[13]/div/div[2]/div/div[4]/div/div/div")).click();//TRUCK CAB SIZE

    
    
  

driver.quit();

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    
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


