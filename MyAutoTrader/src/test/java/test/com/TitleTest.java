/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
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
public class TitleTest {
    private WebDriver driver;
    private String baseUrl;

 
    public TitleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void MainTitle() {
        System.out.println("launching Chrome browser"); 
        driver = new ChromeDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Autotrader"));

////        // Main page title
        System.out.println("The main page test");
        String maintitle = driver.getTitle();
        System.out.println("This is the main page title = " + maintitle);
        String expmaintitle = "New Cars, Used Cars - Find Cars for Sale and Reviews at Autotrader";
        
        if(maintitle.equals(expmaintitle)) {
            System.out.println("The Page Title is Correct");
        } else {
             System.out.println("Page Title is Incorrect " + maintitle );
        }
        
        String mainurl = driver.getCurrentUrl();
        System.out.println("This is the main page URL = " + mainurl);
        String expmainurl = "https://www.autotrader.com";
       
        if(mainurl.equals(expmainurl)){
            System.out.println("The URL is correct");
        } else {
            System.out.println("The URL is incorrect");
        }
        
////        
////       
////        //Cars for Sale"
        System.out.println("The cars for sale page test");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div/header/div/div/nav/div/div[2]/ul/li/a")).click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleContains("Search"));

        String cfstitle = driver.getTitle();
        System.out.println("Cars for sale title = " + cfstitle);
        String expcfstitle = "Search for Cars For Sale Online - Find a Car at Autotrader";
        
        if(cfstitle.equals(expcfstitle)) {
            System.out.println("The Page Title is Correct");
        } else {
             System.out.println("Page Title is Incorrect " + cfstitle );
        }
        
        String cfsurl = driver.getCurrentUrl();
        System.out.println("This is the main page URL = " + cfsurl);
        String expcfsurl = "https://www.autotrader.com/cars-for-sale/";
       
        if(cfsurl.equals(expcfsurl)){
            System.out.println("The URL is correct");
        } else {
            System.out.println("The URL is incorrect");
        }
              
        driver.navigate().back();


////        //Sell my car
        System.out.println("The sell my car  page test");

        driver.findElement(By.xpath("//div[@id='mountNode']/div/div/header/div/div/nav/div/div[2]/ul/li[2]/a")).click();
 
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Sell"));

        String smctitle = driver.getTitle();
        System.out.println("Sell my car page title = " + smctitle);
        String expsmctitle = "Sell my car - Sell a Car, Sell a Used Car, Car Trade-in at Autotrader";
        
        if(smctitle.equals(expsmctitle)) {
            System.out.println("The Page Title is Correct");
        } else {
             System.out.println("Page Title is Incorrect " + smctitle );
        }
        
        String smcurl = driver.getCurrentUrl();
        System.out.println("This is the sell my car page URL = " + smcurl);
        String expsmcurl = "https://www.autotrader.com/sell-my-car/";
       
        if(smcurl.equals(expsmcurl)){
            System.out.println("The URL is correct");
        } else {
            System.out.println("The URL is incorrect");
        }
      
        driver.navigate().back();
////        
////        //Trade my car
        System.out.println("The trade my page test");

	driver.findElement(By.xpath("//div[@id='mountNode']/div/div/header/div/div/nav/div/div[2]/ul/li[3]/a")).click();
 
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Free"));

        String tmctitle = driver.getTitle();
        System.out.println("Trade my car page title = " + tmctitle);
        String exptmctitle = "Free Instant Cash Offer and Car Trade-in Value Range from Kelley Blue Book - Autotrader";
        
        if(tmctitle.equals(exptmctitle)) {
            System.out.println("The Page Title is Correct");
        } else {
             System.out.println("Page Title is Incorrect " + tmctitle );
        }
        
        String tmcurl = driver.getCurrentUrl();
        System.out.println("This is the Trade my car page URL = " + tmcurl);
        String exptmcurl = "https://www.autotrader.com/trade-in-instant-cash-offer/?LNX=TIMATCHPNAV";
       
        if(tmcurl.equals(exptmcurl)){
            System.out.println("The URL is correct");
        } else {
            System.out.println("The URL is incorrect");
        }
      
        driver.navigate().back();
        
//////        //Find a Dealer
//                System.out.println("The find a dealer page test");
//
//	driver.findElement(By.xpath("//div[@id='mountNode']/div/div/header/div/div/nav/div/div[2]/ul/li[5]/a")).click();
//
// 
//        //WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.titleContains("Dealers"));
//
//        String dealerstitle = driver.getTitle();
//        System.out.println("Find a Dealers page title = " + dealerstitle);
//        String expdealerstitle = "Autotrader-Find Car Dealers Near You";
//        
//        if(dealerstitle.equals(expdealerstitle)) {
//            System.out.println("The Page Title is Correct");
//        } else {
//             System.out.println("Page Title is Incorrect " + dealerstitle );
//        }
//        
//        String dealersurl = driver.getCurrentUrl();
//        System.out.println("This is the Trade my car page URL = " + dealersurl);
//        String expdealersurl = "https://www.autotrader.com/car-dealers/";
//       
//        if(dealersurl.equals(expdealersurl)){
//            System.out.println("The URL is correct");
//        } else {
//            System.out.println("The URL is incorrect");
//        }
//      
//        driver.navigate().back();
        
////        //Find a Loan
        System.out.println("The find a loan page test");

//    
//	driver.findElement(By.xpath("//div[@id='mountNode']/div/div/header/div/div/nav/div/div[2]/ul/li[6]/a")).click();
//        
//	//WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.urlContains("loans"));
//
//        String loantitle = driver.getTitle();
//        System.out.println("Find a loan page title = " + loantitle);
//        String exploantitle = "Search for Cars For Sale Online - Find a Car at Autotrader";
//        
//        if(loantitle.equals(exploantitle)) {
//            System.out.println("The Page Title is Correct");
//        } else {
//             System.out.println("Page Title is Incorrect " + loantitle );
//        }
//        
//        String loanurl = driver.getCurrentUrl();
//        System.out.println("This is the Loan page URL = " + loanurl);
//        String exploanurl = "https://www.autotrader.com/car-loans/";
//       
//        if(loanurl.equals(exploanurl)){
//            System.out.println("The URL is correct");
//        } else {
//            System.out.println("The URL is incorrect");
//        }
//      
//        driver.navigate().back();
////        
////             //Find Insurance
////
            System.out.println("The find insurance page test");

	driver.findElement(By.xpath("//div[@id='mountNode']/div/div/header/div/div/nav/div/div[2]/ul/li[7]/a")).click();
        
	//WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Geico"));

        String institle = driver.getTitle();
        System.out.println("Find insurace page title = " + institle);
        String expinstitle = "Online Auto Insurance Quote - Geico & Autotrader";
        
        if(institle.equals(expinstitle)) {
            System.out.println("The Page Title is Correct");
        } else {
             System.out.println("Page Title is Incorrect " + institle );
        }
        
        String insurl = driver.getCurrentUrl();
        System.out.println("This is the ins page URL = " + insurl);
        String expinsurl = "https://www.autotrader.com/insurance/index.xhtml";
       
        if(insurl.equals(expinsurl)){
            System.out.println("The URL is correct");
        } else {
            System.out.println("The URL is incorrect");
        }
      
        driver.navigate().back();
////        driver.quit();

    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        baseUrl ="https://www.autotrader.com";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
