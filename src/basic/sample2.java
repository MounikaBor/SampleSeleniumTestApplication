package basic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sample2 {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raja Chowdary\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.get("http://www.google.com");

// Type on textbox
driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("test");

// Create object on Actions class
Actions builder=new Actions(driver);



// find the element which we want to Select from auto suggestion
WebElement ele=driver.findElement(By.xpath(".//*[@id='sbse3']/div[2]"));

// use Mouse hover action for that element
builder.moveToElement(ele).build().perform();

// Give wait for 2 seconds 
//Thread.sleep(2000);

// finally click on that element
builder.click(ele).build().perform();
}


}
