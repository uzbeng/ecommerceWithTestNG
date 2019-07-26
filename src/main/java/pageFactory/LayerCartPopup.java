package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LayerCartPopup {
	
	WebDriver driver;
	
	@FindBy(css = "div#layer_cart div.button-container>a")
	WebElement proceedToChekoutBtn;
	
	@FindBy(css = "div#layer_cart div.button-container>span")
	WebElement continueShoppingBtn;
	
	
	public LayerCartPopup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickProceedToCheckoutBtn() {
		proceedToChekoutBtn.click();
	}
	
	public void clickContinueShoppingBtn() {
		continueShoppingBtn.click();
	}

}
