package basic;


	import org.apache.bcel.verifier.exc.StaticCodeConstraintException;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class RightClick {

	public void TestClick() throws Exception{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raja Chowdary\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();

	driver.get("http://www.google.com");

	driver.manage().window().maximize();

	Actions act=new Actions(driver);

	act.contextClick(driver.findElement(By.linkText("gmail"))).perform();
	

	}
	}


