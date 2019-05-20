package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class crossBrowser {
 
@Test
// Here this parameters we will take from testng.xml
@Parameters("Browser")
public  void test1(String browser) {
 
if(browser.equalsIgnoreCase("FF")){
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raja Chowdary\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
 
driver.manage().window().maximize();
 
driver.get("http://www.facebook.com");
 
driver.quit();
 
}
if(browser.equalsIgnoreCase("Chrome")){
	 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja Chowdary\\Downloads\\chromedriver_win32\\chromedriver.exe");
 
WebDriver driver=new ChromeDriver();
 
driver.manage().window().maximize();
 
driver.get("http://www.wiu.edu/");
 
driver.quit();
}
}

}
