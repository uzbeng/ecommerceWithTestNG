package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartSummaryPage {
	WebDriver driver;
	
	@FindBy(css = "table#cart_summary tbody>tr:nth-of-type(1)")
	WebElement itemOneInCart;
	
	@FindBy(xpath = "//table[@id='cart_summary']//tbody/tr[1]//span/span[@class='price']") //or (css = "table tr:nth-of-type(1) .cart_unit .price .price")
	WebElement itemOneUnitPrice;
	
	public ShoppingCartSummaryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public int getItemUnitPrice(WebElement element) {
		String priceStr = element.getText().replace("$", "");
		return Integer.parseInt(priceStr);
	}
	
	public int getNthRowItemUnitPrice(int rowNum) {
		WebElement element = driver.findElement(By.xpath("//table[@id='cart_summary']//tbody/tr["+rowNum+"]//span/span[@class='price']"));
		String priceStr = element.getText().replace("$", "");
		return Integer.parseInt(priceStr);
	}
	
	
	
	
	
	
}
