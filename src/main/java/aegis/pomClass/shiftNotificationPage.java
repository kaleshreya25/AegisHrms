package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shiftNotificationPage {
	
	public shiftNotificationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault c')]")
	public WebElement empIcon;
	
	@FindBy(xpath = "//button[text()='Accept']")
	public WebElement acceptButton;

	@FindBy(xpath = "//button[text()='Reject']")
	public WebElement rejectButton;

	public WebElement getHrIcon() {
		return empIcon;
	}

	public WebElement getAcceptButton() {
		return acceptButton;
	}

	public WebElement getRejectButton() {
		return rejectButton;
	}	
	
	

}
