/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;



import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author shashi
 */
public class AutoTest {
    
   
   private WebDriver driver;
   private String baseUrl;
    
    public AutoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
////     @Test
////     public void testadd() {
////     
////     //assertEquals(calc.add(2,2), 4);
////     
////     }
////     @Test
////     public void testmul() {
////     
////     //assertEquals(calc.mul(2,3), 6);
     
//     }
    
     
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        //calc = new Calc();
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");


//        System.setProperty("webdriver.gecko.driver", "C:\\data\\geckodriver.exe");

         baseUrl ="https://www.autotrader.com//";
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     @Test
    public void fillForm() {
        
        System.out.println("launching Chrome browser"); 
        driver = new ChromeDriver(); 
        if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
        
      

//        FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\shashi\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\z4lakrot.tester"));
//        FirefoxOptions opt = new FirefoxOptions();
//        opt.setProfile(profile);
//        driver = new FirefoxDriver(opt);
//        driver.get(baseUrl);

            
        Select auto = new Select(driver.findElement(By.id("makeCodeListPlaceHolderBMW")));
        auto.selectByIndex(7);
        auto.selectByIndex(7);
        driver.findElement(By.id("modelCodeListPlaceHolder")).click();
        driver.findElement(By.name("modelCodeListPlaceHolder")).sendKeys("7");
        driver.findElement(By.name("zip")).clear();
        driver.findElement(By.name("zip")).sendKeys("60107");  
        //driver.findElement(By.name("zip")).click();
        driver.findElement(By.id("Search")).click();
        
        WebDriverWait wait1 = new WebDriverWait(driver, 15);
        wait1.until(ExpectedConditions.titleContains("BMW"));
        
        Select radius = new Select(driver.findElement(By.name("searchRadius")));
        radius.selectByIndex(5);
        
        Select minyear = new Select(driver.findElement(By.name("startYear")));
        minyear.selectByIndex(29);
        
        Select maxyear = new Select(driver.findElement(By.name("endYear")));
        maxyear.selectByIndex(7);
        
        Select minprice = new Select(driver.findElement(By.name("minPrice")));
        minprice.selectByIndex(25);
        
        Select maxprice = new Select(driver.findElement(By.name("maxPrice")));
        maxprice.selectByIndex(7);
        
        Select mileage = new Select(driver.findElement(By.name("maxMileage")));
        mileage.selectByIndex(3);

        
       
        
       driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[6]/div/div[1]/div/h3/strong")).click();
       driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[6]/div/div[2]/div[1]/div/label[6]/div[1]")).click();

        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[9]/div/div[1]/div/h3/strong")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[9]/div/div[2]/div[1]/div/label[8]/div[1]")).click();
        
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[11]/div/div[1]/div/h3/strong")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[11]/div/div[2]/div[1]/div/label[1]/div[1]")).click();
        
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[1]/div/h3/strong")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[1]/div[1]")).click();
        
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[2]/div[1]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[3]/div[1]")).click();
         driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[4]/div[1]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[5]/div[1]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[6]/div[1]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[7]/div[1]")).click();
         driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[8]/div[1]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[9]/div[1]")).click();
         driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[12]/div/div[2]/div[1]/div/label[10]/div[1]")).click();
        
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[13]/div/div[2]/div[1]/div/label[1]/div[1]")).click();
        
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[15]/div/div[1]/div/h3/strong")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[15]/div/div[2]/div[1]/div/label[2]/div[1]")).click();
           
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[19]/div/div[1]/div/h3/strong")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/form[1]/div[19]/div/div[2]/div[1]/div/label[1]/div[1]")).click();
         
       driver.findElement(By.xpath("html/body/div[1]/div/div[1]/header/div/div/nav/div/div[1]/div/div[1]/a/img[1]")).click();
      
       WebDriverWait wait2 = new WebDriverWait(driver, 5);
        wait1.until(ExpectedConditions.titleContains("Homepage"));
         driver.quit();
        
//         Select sortby = new Select(driver.findElement(By.name("sortBy")));
//        sortby.selectByIndex(3);
//        
//        Select perpage = new Select(driver.findElement(By.name("numRecords")));
//        perpage.selectByIndex(0);
//       
     
       // driver.findElement(By.xpath("html/body/div[1]/div/div[1]/header/div/div/nav/div/div[1]/div/div[1]/a/img[1]")).click();
        
        //WebDriverWait wait2 = new WebDriverWait(driver, 5);
       // WebElement element = wait2.until(ExpectedConditions.elementToBeClickable(By.name("html/body/div[1]/div/div[1]/header/div/div/nav/div/div[1]/div/div[1]/a/img[1]")));
       // driver.quit();

//year.selectByIndex(4);
               // driver.findElement(By.name("searchRadius")).sendKeys("5");
                // driver.findElement(By.name("startYear")).sendKeys("22");
                // driver.findElement(By.name("endYear")).sendKeys("28");
                // driver.findElement(By.name("maxMileage")).click();
                // driver.findElement(By.name("maxMileage")).sendKeys("Under 75,000");
               //  driver.findElement(By.name("sortBy")).sendKeys("5");
         
//                 
//                 int i = 1;
//             while(i<40){
//
//Select minprice = new Select(driver.findElement(By.name("minPrice")));
//minprice.selectByIndex(i);

//Select maxprice = new Select(driver.findElement(By.name("maxPrice")));
//maxprice.selectByIndex(1);
//
//String min = driver.findElement(By.name("minPrice")).getAttribute("value");
//String max = driver.findElement(By.name("maxPrice")).getAttribute("value");
//
//if(min.equals(max)) {
//System.out.println("The Min and Max value of " + min + " match");
//} else {
//System.out.println("Values don't match min= " + min + " max= " + max );
//}
//
//maxprice.selectByIndex(0); // Need to set this back to default so min price is sequenntial
//i++;
//   WebDriverWait wait = new WebDriverWait(driver, 10);        
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/nav/div/div[1]/div/div[1]/a/img[1]")));
//driver.findElement(By.className("display-none")).click();
//  
       
    }
    }
    
    

             
             
    



                 
                 
           
                 
                 
       
//          
                    
                
                        
               // driver.findElement(By.id("startYear2015")).click();
                
                //driver.findElement(By.className("atcui-checkbox-input")).click();
                //driver.findElement(By.id("j_id_1y1")).click();
                //driver.findElement(By.className("input-label")).click();
                
                //driver.findElement(By.className("atcui-selectOneMenu-styled")).sendKeys("2012");
                //driver.findElement(By.className("atcui-selectOneMenu-styled")).sendKeys("2018");
                