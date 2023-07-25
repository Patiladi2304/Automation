package TestngScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mumbai extends Baseclass {
	
	@Test
	public void MayaNagiri() {
		Reporter.log("mumbai is dream city",true);
	}

	
	@Test
	public void Dhoni() {
		Reporter.log("Captain Cool",true);
		
		
	}
}
