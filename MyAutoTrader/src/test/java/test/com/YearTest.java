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
public class YearTest {
        WebDriver driver;
    private String baseUrl;
    
    public YearTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void yearForm(){ 
        System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Search"));
        
        // Start Year
// year select
       Select startyear = new Select(driver.findElement(By.name("startYear")));
       List<WebElement> sy = startyear.getOptions();
       int c = sy.size();
       
     
     int y = 1;
            while(y < c){
        //Select startyear = new Select(driver.findElement(By.name("startYear")));
            startyear.selectByIndex(y);
            System.out.println("The start year count = " + y);

         // End Year 
        Select endyear = new Select(driver.findElement(By.name("endYear")));
        List<WebElement> ey = endyear.getOptions();
        int d = ey.size();
        int e = ey.size();
        System.out.println("The end year has a count of " +d);
        int f = (y+d);
        System.out.println("This should be 39  " +f);

        
    ++y;
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
