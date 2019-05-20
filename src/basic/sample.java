package basic;



	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class sample {
		 
	      
	    @Test
	    public void testcase1(){
	    	System.setProperty("webdriver.chrome.driver", "src/resourceDriverforChrome74/chromedriver.exe");
	    	
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.facebook.com");
			driver.manage().window().maximize();
			WebElement female_radio_button=driver.findElement(By.xpath(".//*[@id='u_0_9']"));
			boolean status=female_radio_button.isDisplayed();
			System.out.println("Female radio button is displayed:"+status);
			female_radio_button.click();
			boolean status1=female_radio_button.isSelected();
			System.out.println("Female radio button is selected:"+status1);
			driver.quit();
	        System.out.println("tc1 done");
	    
	    }
	    
	    @Test
	    public void testcase2(){
	    	
	        System.out.println("tc2 done");
	    }
	    
	    
	   
	    
	    @BeforeMethod
	    public void login(){
	        
	        System.out.println("login done");
	    
	    }
	    
	    @AfterMethod
	    public void logout(){
	        
	        System.out.println("logout done");
	        
	           
	    }
	    
	     
	    @BeforeTest
	    public void clearingCache(){
	        
	        System.out.println("Clearingcache done");
	    
	    }
	    
	    @AfterTest
	    public void closingBrowser(){
	        
	    	
	        System.out.println("ClosingBrowser done");
	    
	    }
	}
	    


