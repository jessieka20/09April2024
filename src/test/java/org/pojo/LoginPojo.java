package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "(//input[@type='email'])[1]")
	private WebElement em;

	@CacheLookup
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement pwd;

	@CacheLookup
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement login;

	public WebElement getEm() {
		return em;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}

}
