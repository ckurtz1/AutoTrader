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
public class SpecTest {
    WebDriver driver;
    private String baseUrl;    
    
    public SpecTest() {
        
        
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
    //open engine types
     driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div/div/span")).click();
        //Select all engine types
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[1]/div")).click();//3
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[2]/div")).click();//4
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[3]/div")).click();//5
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[4]/div")).click();//6
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[5]/div")).click();//8
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[6]/div")).click();//10
          
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label/div")).click();//12
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[2]/div")).click();//16
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[3]/div")).click();//elec
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[4]/div")).click();//hybrid
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[5]/div")).click();//roto
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[6]/div")).click();//fuel

          // Deselect all engine types
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[1]/div")).click();//3
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[2]/div")).click();//4
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[3]/div")).click();//5
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[4]/div")).click();//6
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[5]/div")).click();//8
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div/label[6]/div")).click();//10
          
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label/div")).click();//12
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[2]/div")).click();//16
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[3]/div")).click();//elec
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[4]/div")).click();//hybrid
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[5]/div")).click();//roto
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/label[6]/div")).click();//fuel

     //Close engine types
          driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div/div/div/div/span")).click();
 
    //TRANS
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[2]/div/div/div/span")).click();
    
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[2]/div/div[2]/div/div/label/div")).click();//AUTOMATIC
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[2]/div/div[2]/div/div/label[2]/div")).click();//MANUAL
        
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[2]/div/div[2]/div/div/label/div")).click();//AUTOMATIC
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[2]/div/div[2]/div/div/label[2]/div")).click();//MANUAL
        
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[2]/div/div/div/span")).click();

//FUEL TYPE
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div/div")).click();//FUEL TYPE
    
    
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label/div")).click();//GAS
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[3]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[4]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[5]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[6]/div")).click();


        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label/div")).click();//GAS
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[3]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[4]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[5]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div[2]/div/div/label[6]/div")).click();


    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[3]/div/div/div")).click();//FUEL TYPE


//TRUCK CAB SIZE
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[4]/div/div/div/span")).click();//TRUCK CAB SIZE
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[4]/div/div[2]/div/div/label/div")).click();//GAS
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[4]/div/div[2]/div/div/label[2]/div")).click();//GAS
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[4]/div/div[2]/div/div/label[3]/div")).click();//GAS

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[4]/div/div[2]/div/div/label/div")).click();//GAS
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[4]/div/div[2]/div/div/label[2]/div")).click();//GAS
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[4]/div/div[2]/div/div/label[3]/div")).click();//GAS
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[4]/div/div/div/span")).click();//TRUCK CAB SIZE

    
    
    
    //DOORS
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[5]/div/div/div")).click();//DOORS
    
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[5]/div/div[2]/div/div/label/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[5]/div/div[2]/div/div/label[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[5]/div/div[2]/div/div/label[3]/div")).click();
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[5]/div/div[2]/div/div/label[4]/div")).click();
    
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[5]/div/div/div")).click();//DOORS

    //EXT COLOR  
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div/div/span")).click();//EXT COLOR
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[7]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[8]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[9]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[10]/div")).click();
            
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[7]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[8]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[9]/div")).click();

            //deselect
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[7]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[8]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[9]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div/label[10]/div")).click();
            
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[7]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[8]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div[2]/div/div/div/div[2]/label[9]/div")).click();

    
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[6]/div/div/div/span")).click();//EXT COLOR

    
    //INT COLOR
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div/div")).click();//INT COLOR
    
    
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[7]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[8]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[9]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[10]/div")).click();
            
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[7]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[8]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[9]/div")).click();

            //deselect
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[7]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[8]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[9]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div/label[10]/div")).click();
            
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[2]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[3]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[4]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[5]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[6]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[7]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[8]/div")).click();
            driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div[2]/div/div/div/div[2]/label[9]/div")).click();
    
    
    driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[12]/div/div[2]/div/div[7]/div/div/div")).click();//INT COLOR


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

