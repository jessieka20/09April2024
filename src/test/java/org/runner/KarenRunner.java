package org.runner;

import java.time.Duration;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.ClothingPojo;
import org.pojo.KarenPojo;
import org.pojo.LoginPojo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KarenRunner extends BaseClass {

	@Test
	private void test1() {

//1
		launchBrowser("Chrome");
//2
		launchUrl("https://www.karenmillen.com/");
//3
		SoftAssert s = new SoftAssert();
		s.assertEquals(fetchTitle(), "Women's Clothing | Ladies Clothes & Fashion | Karen Millen");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		KarenPojo p = new KarenPojo();
		WebElement btn = p.getAcceptBtn();
		btn.click();
//4,5
		WebElement logoBtn = p.getLogoBtn();

		if (logoBtn.isDisplayed() && logoBtn.isEnabled()) {
			logoBtn.click();
		} else {
			System.out.println("Check for the presence of logoBtn");
		}
//6
		WebElement logn = p.getLogn();
		logn.click();

	}

	@Test(dataProvider = "Data")
	private void test2(String a, String b) {

		LoginPojo l = new LoginPojo();
//7
		WebElement emField = l.getEm();
		if (emField.isDisplayed()) {
			emField.sendKeys(a);
		}

		else {
			System.out.println("Check for the presence of emailField");
		}
//8
		WebElement pwdField = l.getPwd();
		if (pwdField.isDisplayed()) {
			pwdField.sendKeys(b);
		}

		else {
			System.out.println("Check for the presence of passwordField");
		}

//9
		WebElement loginBtn = l.getLogin();

		if (loginBtn.isDisplayed() && loginBtn.isEnabled()) {
			loginBtn.click();
		} else {
			System.out.println("Check for the presence of loginButton");
		}

	}

//10,  11,12,13,14
	@DataProvider(name = "Data")
	private Object[][] inputDatas() {

		return new Object[][] {

				{ "jessiekacareer@gmail.com", "Jes@2024" }

		};
	}

	@Test
	private void test3() {

		ClothingPojo c = new ClothingPojo();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//15
		WebElement menu = c.getMenu();
		WebDriverWait a = new WebDriverWait(driver, Duration.ofSeconds(40));
		a.until(ExpectedConditions.elementToBeClickable(menu));

//16--
		WebElement categ = c.getCateg();
		categ.click();

// 17
		WebElement pc = c.getParticularCat();
		pc.click();

//18
		WebElement size = c.getSize();
		size.click();
//19
		WebElement cart = c.getCart();
		cart.click();
//20
		WebElement vwBag = c.getVwBag();
		vwBag.click();

//21
		WebElement cp = c.getCheckPrice();
		fetchText(cp);

	}

//	@Test
//	private void test4() {
////22, 23
//		ClothingPojo c = new ClothingPojo();
//		WebElement lgOut = c.getLgOut();
//		if (lgOut.isDisplayed() && lgOut.isDisplayed()) {
//			lgOut.click();
//		} else {
//			System.out.println("Logout was unsuccessful");
//		}
////24
//		SoftAssert s = new SoftAssert();
//		s.assertEquals(fetchTitle(), "Log in to Your Account");
//		System.out.println("Navigated to login page");
//
////25
//		close();
//	}

}
