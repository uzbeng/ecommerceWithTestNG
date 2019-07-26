package testNGTests;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageFactory.HomePage;
import pageFactory.LandingPage;
import pageFactory.LayerCartPopup;
import pageFactory.MyAccountPage;
import pageFactory.SignInPage;
import utilities.Base;

public class LoginTest extends Base {
	WebDriver driver;
	TakesScreenshot screenshot;
	SignInPage signInPage;
	MyAccountPage myAccountPage;
	LandingPage landingPage;
	HomePage homePage;
	LayerCartPopup layerCart;

	@BeforeClass
	public void setupDriver() {
		try {
			driver = initializeDriver();
		} catch (IOException e) {
			e.printStackTrace();
		}
		signInPage = new SignInPage(driver);
		myAccountPage = new MyAccountPage(driver);
		landingPage = new LandingPage(driver);
		homePage = new HomePage(driver);
		layerCart = new LayerCartPopup(driver);

	}

	@BeforeMethod
	public void loginToThePage() {
		driver.get(properties.getProperty("baseUrl"));
		landingPage.clickOnSigninBtn();
		signInPage.signIntoAccount(properties.getProperty("userEmail"), properties.getProperty("password"));
		if (myAccountPage.orderHistoryBtnIsDisplayed()) {
			System.out.println("Sign in page is open");
		} else {
			System.out.println("Error, you could not login");
		}
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@Test
	public void userPurchasesItem() {
		myAccountPage.clickHomeBtn();
		homePage.addToCartFirstRowFirstElement();
		layerCart.clickProceedToCheckoutBtn();
	}
}
