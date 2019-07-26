package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	Actions actions;
	
	@FindBy(xpath = "//ul[@id='homefeatured']/li[1]//img")
	WebElement firstRowFirstItem;
	
	@FindBy(xpath = "//ul[@id='homefeatured']/li[1]//span[text()='Add to cart']")
	WebElement addToCartFirstRowFirstItem;
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.actions = new Actions(driver);
	}
	
	private void hoverOverItem(WebElement target) {
		actions.moveToElement(target).build().perform();
	}
	
	public void hoverFirstRowFirstItem() {
		hoverOverItem(firstRowFirstItem);
	}
	
	public void addToCartFirstRowFirstElement() {
		hoverFirstRowFirstItem();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addToCartFirstRowFirstItem.click();
		
	}
	
	

}
