/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.List;
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
public class MakeModelTest {
    WebDriver driver;
    private String baseUrl;
    
    public MakeModelTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void mmtForm() {  
                System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Search"));
        // Make Model Trim
        
        Select make = new Select(driver.findElement(By.name("makeFilter0")));
        List<WebElement> mk = make.getOptions();
        int m = mk.size();
       
     
        int z = 1;
            while(z < m){
            make.selectByIndex(z);
            
            String mke = driver.findElement(By.name("makeFilter0")).getAttribute("value");
           
            Select model = new Select(driver.findElement(By.name("modelFilter0")));
            List<WebElement> md = model.getOptions();
            int mod = md.size();

            //String mdl = driver.findElement(By.name("modelFilter0")).getAttribute("value");

////            Select trim = new Select(driver.findElement(By.name("trimFilter0")));
////            List<WebElement> trm = trim.getOptions();
////            int t = trm.size();
////            int actual = (t-1);    
            //model.selectByIndex(mod);
            System.out.println("For Make " + mke + " Has " + mod + " models available to choose");
            
    ++z;
   
     
    }
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
