package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothingPojo extends BaseClass {

	public ClothingPojo() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "(//span[@class='no-link'])[2]")
	private WebElement menu;

	@CacheLookup
	@FindBy(xpath = "//a[text()='Flat Shoes']")
	private WebElement categ;

	@CacheLookup
	@FindBy(xpath = "(//div[@class='product-tile-name'])[1]")
	private WebElement particularCat;

	@CacheLookup
	@FindBy(xpath = "(//span[@class='swatchanchor-text'])[3]")
	private WebElement size;

	@CacheLookup
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement cart;

	@CacheLookup
	@FindBy(xpath = "//a[text()='View Bag']")
	private WebElement vwBag;

	@CacheLookup
	@FindBy(xpath = "// span[@class='price-adjusted-total']")
	private WebElement checkPrice;

	@CacheLookup
	@FindBy(xpath = "//a[@title='Log out']")
	private WebElement lgOut;

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getCateg() {
		return categ;
	}

	public WebElement getParticularCat() {
		return particularCat;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getVwBag() {
		return vwBag;
	}

	public WebElement getCheckPrice() {
		return checkPrice;
	}

	public WebElement getLgOut() {
		return lgOut;
	}

}
