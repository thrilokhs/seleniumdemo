package pageObjects;

import org.openqa.selenium.By;
import helper.Base;
import helper.Generic;

public class AppleDevicePage extends Base {
	Generic gen = new Generic();

	public void selectItem(String deviceName) throws Exception {
		By Device = By.xpath("//li[@class='chapternav-item chapternav-item-" + deviceName + "']");
		gen.clickElement(Device);
	}

	public boolean verifyProduct(String deviceName) throws Exception {
		By Device = By.xpath("//a[@href='/befr/" + deviceName + "/']");
		return gen.VerifyText(deviceName, Device);
	}
}
