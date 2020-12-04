package pageObjects;

import org.openqa.selenium.By;
import helper.Base;
import helper.Generic;

public class AppleLogin extends Base {

	Generic gen = new Generic();

	By language = By.xpath("//*[@class='button-befr rollover-befr']");

	By options = By.xpath("//*[@id='ac-gn-bag']/div/a");

	By signin = By.xpath("//*[@data-analytics-activitymap-link-id='signIn']");

	By email = By.xpath("//*[@type='email']");

	By password = By.xpath("//*[@type='password']");

	By submit = By.xpath("//*[@data-autom='signin-submit-button']");

	By signout = By.xpath("//*[@data-analytics-activitymap-link-id='signOut']");

	public void clickLanguage() throws Exception {
		gen.clickElement(language);
	}

	public void clickOption() throws Exception {
		gen.clickElement(options);
	}

	public void clickSignin() throws Exception {
		gen.clickElement(signin);
	}

	public void enterEmail() throws Exception {
		gen.inputText(email, "3lokhs@gmail.com");
	}

	public void enterPassword() throws Exception {
		gen.inputText(password, "Passw0rd123$");
	}

	public void clickSubmit() throws Exception {
		gen.clickElement(submit);
	}

	public void clickSignout() throws Exception {
		gen.clickElement(signout);
	}

	public void Login() throws Exception {
		this.clickLanguage();
		this.clickOption();
		this.clickSignin();
		this.enterEmail();
		this.enterPassword();
		this.clickSubmit();
	}

	public void Logout() throws Exception {
		Thread.sleep(2000);
		this.clickOption();
		this.clickSignout();
	}
}
