package basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class depend {
	@Test
	public void testLogin()
	{

	System.out.println("login done");

	}

	@Test(dependsOnMethods={"testLogin"})
	public void searchAccount()
	{
	//System.out.println("search Account ");
		Assert.assertEquals("a","b","Text doesn't match");
	}

	@Test(dependsOnMethods={"testLogin","searchAccount"})
	public void testLogout()
	{
	System.out.println("logout");

	}
}
