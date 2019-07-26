package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver driver;
	
	@FindBy(css = "div>a.home")
	WebElement returnToHomeBtn;
	
	@FindBy(css = "a[title='Orders']")
	WebElement orderHistoryAndDetailsBtn;
	
	@FindBy(css = "a[title='Credit slips']")
	WebElement myCreditSlipsBtn;
	
	@FindBy(css = "a[title='Addresses']")
	WebElement myAddressesBtn;
	
	@FindBy(css = "a[title='Information']")
	WebElement myPersonalInformationBtn;
	
	@FindBy(css = "a[title='My wishlists']")
	WebElement myWishlistsBtn;
	
	@FindBy(css = "a[title='Home']")
	WebElement homeBottomBtn;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOrderHistoryBtn() {
		orderHistoryAndDetailsBtn.click();
	}
	
	public void clickMyCreditSlipsBtn() {
		myCreditSlipsBtn.click();
	}
	
	public void clickMyAddressBtn() {
		myAddressesBtn.click();
	}
	
	public void clickMyPersonalInfoBtn() {
		myPersonalInformationBtn.click();
	}
	
	public void clickMyWishlistBtn() {
		myWishlistsBtn.click();
	}
	
	public void clickReturnToHomeBtn() {
		returnToHomeBtn.click();
	}
	
	public void clickHomeBtn() {
		homeBottomBtn.click();
	}
	
	public boolean orderHistoryBtnIsDisplayed() {
		return orderHistoryAndDetailsBtn.isDisplayed();
	}
	
	
	
	
	
	
}
