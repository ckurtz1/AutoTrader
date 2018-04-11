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
public class PriceTest {
        private WebDriver driver;
        private String baseUrl;
  
    public PriceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void priceCompare() {
        
        System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Search"));
        
            Select minprice = new Select(driver.findElement(By.name("minPrice")));
            List<WebElement> minp = minprice.getOptions();
            int c = minp.size();
            System.out.println("Number of iterations " + c);
        int i = 1;
            while(i<c){
            
            //Select minprice = new Select(driver.findElement(By.name("minPrice")));
            minprice.selectByIndex(i);
            
            Select maxprice = new Select(driver.findElement(By.name("maxPrice")));
            maxprice.selectByIndex(1);
//            List<WebElement> mxp = maxprice.getOptions();
//            int d = mxp.size();
//            System.out.println("Max prices left " + d);
//            int sum = (d-c);
//            System.out.println("This number should equal 40.  The number is " + sum);
            
            String min = driver.findElement(By.name("minPrice")).getAttribute("value");
            String max = driver.findElement(By.name("maxPrice")).getAttribute("value");

                if(min.equals(max)) {
                    System.out.println("The Min and Max value of " + min + " match");
                } else {
                    System.out.println("Values don't match min= " + min + " max= " + max );
                }
 
            maxprice.selectByIndex(0); // Need to set this back to default so min price is sequenntial
            i++;
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
