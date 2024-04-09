package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KarenPojo extends BaseClass {

	public KarenPojo() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "(//button[text()='ACCEPT ALL'])[1]")
	private WebElement acceptBtn;

	@CacheLookup
	@FindBy(xpath = "//span[@class='user-account ']")
	private WebElement logoBtn;

	@CacheLookup
	@FindBy(xpath = "//a[text()='Log In']")
	private WebElement logn;

	public WebElement getLogn() {
		return logn;
	}

	public WebElement getAcceptBtn() {
		return acceptBtn;
	}

	public WebElement getLogoBtn() {
		return logoBtn;
	}

}
