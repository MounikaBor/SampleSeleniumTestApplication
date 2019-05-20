package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement female_radio_button=driver.findElement(By.xpath(".//*[@id='u_0_h']"));
		boolean status=female_radio_button.isDisplayed();
		System.out.println("Female radio button is displayed:"+status);
		female_radio_button.click();
		boolean status1=female_radio_button.isSelected();
		System.out.println("Female radio button is selected:"+status1);
		
	}
}
