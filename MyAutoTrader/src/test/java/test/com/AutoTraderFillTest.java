/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
public class AutoTraderFillTest {
    WebDriver driver;
    private String baseUrl;
    
public AutoTraderFillTest() {
     
    }
   
    @Test
    public void fillForm() {
       System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Search"));
        
        String title = driver.getTitle();
        System.out.println("This is the title = " + title);
        
        
        // radius
        WebElement radius = driver.findElement(By.name("searchRadius"));

        Select objSel = new Select(radius);
        List <WebElement> weblist = objSel.getOptions();
        int iCnt = weblist.size();
        Random num = new Random();
        int iSelect = num.nextInt(iCnt);
         objSel.selectByIndex(iSelect);
         System.out.println(radius.getAttribute("value"));
 

            
     
        //ZIP code enter 
        driver.findElement(By.name("zip")).sendKeys("60056");
//
//
//            //Condition new cert
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[3]/label/div")).click();// This selects CERTIFIED!!!!!!!!!1
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[3]/div/div[2]/div/div/div/div[2]/label/div")).click();// This deselects USED!!!!!!!!!1

//  
//            //Price between 
        // min price
        WebElement price1 = driver.findElement(By.name("minPrice"));

        Select price1Sel = new Select(price1);
        List <WebElement> price1list = price1Sel.getOptions();
        int price1Cnt = price1list.size();
        Random price1num = new Random();
        int price1Select = price1num.nextInt(price1Cnt);
         price1Sel.selectByIndex(price1Select);
         System.out.println(price1.getAttribute("value"));
 

        // max price
        WebElement price2 = driver.findElement(By.name("maxPrice"));

        Select price2Sel = new Select(price2);
        List <WebElement> price2list = price2Sel.getOptions();
        int price2Cnt = price2list.size();
        Random price2num = new Random();
        int price2Select = price2num.nextInt(price2Cnt);
         price2Sel.selectByIndex(price2Select);
         System.out.println(price2.getAttribute("value"));


//        /// Style
        //driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[5]/div/div[2]/div/div/div[2]/label[3]/div")).click();   //  "Truck");

//        //Drive Type   
//        //select all
//      
//        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[6]/div/div[2]/div/div/label[3]/div")).click();   // "AWD/4WD");        
//
//        // Start Year
        WebElement year1 = driver.findElement(By.name("startYear"));
           Select year1Sel = new Select(year1);
        List <WebElement> year1list = year1Sel.getOptions();
        int year1Cnt = year1list.size();
        Random year1num = new Random();
        int year1Select = year1num.nextInt(year1Cnt);
         year1Sel.selectByIndex(year1Select);
         System.out.println(year1.getAttribute("value"));

      // End Year 
        WebElement year2 = driver.findElement(By.name("endYear"));

        Select year2Sel = new Select(year2);
        List <WebElement> year2list = year2Sel.getOptions();
        int year2Cnt = year2list.size();
        Random year2num = new Random();
        int year2Select = year2num.nextInt(year2Cnt);
         year2Sel.selectByIndex(year2Select);
         System.out.println(year2.getAttribute("value"));
         

//
//        // Make Model Trim
           //make
        WebElement make1 = driver.findElement(By.name("makeFilter0"));

        Select make1Sel = new Select(make1);
        List <WebElement> make1list = make1Sel.getOptions();
        int make1Cnt = make1list.size();
        Random make1num = new Random();
        int make1Select = make1num.nextInt(make1Cnt);
         make1Sel.selectByIndex(make1Select);
         System.out.println(make1.getAttribute("value"));
//        
//
        //model
        WebElement model1 = driver.findElement(By.name("modelFilter0"));

        Select model1Sel = new Select(model1);
        List <WebElement> model1list = model1Sel.getOptions();
        int model1Cnt = model1list.size();
        Random model1num = new Random();
        int model1Select = model1num.nextInt(model1Cnt);
        model1Sel.selectByIndex(model1Select);
        System.out.println(model1.getAttribute("value"));
         
         //trim
        WebElement trim1 = driver.findElement(By.name("trimFilter0"));

        Select trim1Sel = new Select(trim1);
        List <WebElement> trim1list = trim1Sel.getOptions();
        int trim1Cnt = trim1list.size();
        Random trim1num = new Random();
        int trim1Select = trim1num.nextInt(trim1Cnt);
        trim1Sel.selectByIndex(trim1Select);
        System.out.println(trim1.getAttribute("value"));

                  
//    // Milelage
        WebElement mpg1 = driver.findElement(By.name("maxMileage"));

        Select mpg1Sel = new Select(mpg1);
        List <WebElement> mpg1list = mpg1Sel.getOptions();
        int mpg1Cnt = mpg1list.size();
        Random mpg1num = new Random();
        int mpg1Select = mpg1num.nextInt(mpg1Cnt);
        mpg1Sel.selectByIndex(mpg1Select);
        System.out.println(mpg1.getAttribute("value"));

//      
//          //Sellers
//      //Select all three 
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[15]/div/div[2]/div/div/label[1]/div[1]")).click();
//    
//    
//        //Listing contains
        driver.findElement(By.xpath("//div[@id='mountNode']/div/div[2]/div/form/div[16]/div/div[2]/div/div/label[1]/div[1]")).click();
//    
//    

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 15);
        
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


//
}
    


