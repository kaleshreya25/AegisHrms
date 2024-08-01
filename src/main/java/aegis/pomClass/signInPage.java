package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage {
	
	public signInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
		public WebElement emailTextField;
	
	@FindBy(id = "password")
	public WebElement passwordTextField;
	
	@FindBy(xpath = "//button[text() = 'Log in']")
	public WebElement LoginButton;

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	


}
