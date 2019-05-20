package basic;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.Response.OutputType;
import org.testng.annotations.Test;


@Test
public class dropdown {
	WebDriver driver=new FirefoxDriver();
    public void tc1(){
	//public static void main(String[] args){
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raja Chowdary\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");

		
		driver.manage().window().maximize();
		driver.get("http://www.xe.com/currencyconverter/convert/?Amount=1&From=USD&To=INR");
		String a=driver.findElement(By.xpath(".//*[@id='ucc-container']/span[2]/span[2]")).getText();
		driver.get("http://www.prokerala.com/news/finance/currency.php?from=USD&to=INR");
		String b= driver.findElement(By.xpath(".//*[@id='frmQuickConvert']/div[3]/div[1]/span[2]")).getText();
		
    	System.out.println("tc1 started");
         try{ 
        Assert.assertEquals(b,a);
        System.out.println("Match:" + a+ " is equal to "+b);
         }
         catch(AssertionError e){
        	 Assert.fail("Not Match:" + a +" not equal to "+b);
         }
        
    	System.out.println("tc1 Completed");
    }
    
    
   
    
}
