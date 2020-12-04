package pageObjects;

import org.openqa.selenium.By;
import helper.Base;
import helper.Generic;

public class AppleDevicePage extends Base {
	Generic gen = new Generic();

	public void selectMac(String deviceName) throws Exception {
		By Mac = By.xpath("//li[@class='chapternav-item chapternav-item-" + deviceName + "']");
		gen.clickElement(Mac);
	}

	public boolean verifyProduct(String deviceName) throws Exception {
		By Mac = By.xpath("//a[@href='/befr/macbook-air/']");
		return gen.VerifyText(deviceName, Mac);
	}
}
