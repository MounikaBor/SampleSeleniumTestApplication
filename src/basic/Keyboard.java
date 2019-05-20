package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raja Chowdary\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.get("https://www.google.com");

driver.manage().window().maximize();

Actions act=new Actions(driver);

act.contextClick(driver.findElement(By.linkText("Yes, show me"))).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();

}

}

