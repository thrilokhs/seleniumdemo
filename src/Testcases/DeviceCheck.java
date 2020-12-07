package Testcases;

import org.testng.annotations.Test;
import helper.Base;
import pageObjects.AppleDevicePage;
import pageObjects.AppleHomepage;

public class DeviceCheck extends Base {
	AppleHomepage homepage = new AppleHomepage();
	AppleDevicePage device = new AppleDevicePage();

	@Test(description = "This Test Case can verify the presence of all 7 products and its subproducts")
	public void buy_mac() throws Exception {
		
		//Apple Main Product Selection
		homepage.selectVariant("mac");
		
		//Apple Sub-Product or Device Selection
		device.selectItem("macbook-air"); 
		
		//Device Landing page name to be verified
		device.verifyProduct("MacBook Air");

	}
}
