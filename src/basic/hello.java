package basic;



	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	 
	public class hello {
		 
	      
	    @Test
	    public void tc1(){
	        
	        System.out.println("tc1 done");
	    
	    }
	    
	    @Test
	    public void tc2(){
	    	
	        System.out.println("tc2 done");
	    }
	    
	    
	    @Test
	    public void tc3(){
	    	
	        System.out.println("tc3 done");
	    }
	    
	    @Test
	    public void tc4(){
	    	
	        System.out.println("tc4 done");
	    }
	    
	    
	    @Test
	    public void tc5(){
	    	
	        System.out.println("tc5 done");
	    }
	    
	    
	    @Test
	    public void tc6(){
	    	
	        System.out.println("tc6 done");
	    }
	    
	    @Test
	    public void tc7(){
	    	
	        System.out.println("tc7 done");
	    }
	    
	    @BeforeMethod
	    public void login(){
	        
	        System.out.println("login done");
	    
	    }
	    
	    @AfterMethod
	    public void logout(){
	        
	        System.out.println("logut done");
	        
	           
	    }
	    
	     
	    @BeforeTest
	    public void Clearingcache(){
	        
	        System.out.println("Clearingcache done");
	    
	    }
	    
	    @AfterTest
	    public void ClosingBrowser(){
	        
	        System.out.println("ClosingBrowser done");
	    
	    }
	}
	    

