package basic;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class groups {

	
	
		@Test(alwaysRun=true)
	    public void tc1(){
	        
	        System.out.println("tc1 done");
	    
	    }
	    
	    @Test(groups={"GRP2"})
	    public void tc2(){
	    	
	        System.out.println("tc2 done");
	    }
	    
	    
	    @Test(enabled=false)
	    public void tc3(){
	    	
	        System.out.println("tc3 done");
	    }
	    
	    @Test(groups={"GRP1"})
	    public void tc4(){
	    	
	        System.out.println("tc4 done");
	    }
	    
	    
	    @Test(groups={"GRP2"})
	    public void tc5(){
	    	
	        System.out.println("tc5 done");
	    }
	    
	    
	    @Test(groups={"GRP2"})
	    public void tc6(){
	    	
	        System.out.println("tc6 done");
	    }
	    
	    @Test(groups={"GRP2"})
	    public void tc7(){
	    	
	        System.out.println("tc7 done");
	    }
	

}
