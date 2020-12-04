package pageObjects;

import org.openqa.selenium.By;
import helper.Generic;

import helper.Base;

public class AppleHomepage extends Base {

	Generic gen = new Generic();

	public void selectProduct(String deviceName) throws Exception {
		By product = By.xpath("//a[@class='ac-gn-link ac-gn-link-" + deviceName + "']");
		gen.clickElement(product);
	}
}
