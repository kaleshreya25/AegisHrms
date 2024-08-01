package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class notificationPage {
	
	public notificationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Shift Notification']")
	public WebElement shiftNotification;
	
	@FindBy(xpath = "//h1[text()='Leave Notification']")
	public WebElement leaveNotification;

	public WebElement getShiftNotification() {
		return shiftNotification;
	}

	public WebElement getLeaveNotification() {
		return leaveNotification;
	}
	
	
	
}
