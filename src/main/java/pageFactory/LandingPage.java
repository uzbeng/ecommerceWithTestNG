package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	@FindBy(css = "a.login")
	WebElement signInBtn;
	
	@FindBy(css = "div.shopping_cart>a")
	WebElement cartBtn;
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSigninBtn() {
		signInBtn.click();
	}
	
	

}
