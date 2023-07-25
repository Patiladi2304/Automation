package TestngScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Actress {
	@Test(invocationCount = 5,priority = 3)
	public void createCustomer() {
		Assert.fail();
		Reporter.log("customer created",true);
	}
	@Test(priority = 1)
	public void modifyCustomer() {
		Reporter.log("customer modified",true);
	}
	
	@Test(priority = 2)
	public void editCustomer() {
		Reporter.log("customer edited",true);
	}
	
@Test(enabled = false)
public void deleteCustomer() {
	Reporter.log("Customer deleted",true);
	
}
}
