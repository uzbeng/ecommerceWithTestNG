package pageFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;
	
	@FindBy(css = "input#email")
	WebElement emailAddressBox;
	
	@FindBy(css = "input#passwd")
	WebElement passwordBox;
	
	@FindBy(css = "button#SubmitLogin")
	WebElement submitBtn;
	
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signIntoAccount(String email, String password) {
		emailAddressBox.sendKeys(email);
		passwordBox.sendKeys(password);
		submitBtn.click();
	}

}
