package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shiftManagementPage {
	
	public shiftManagementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[contains(@class,'MuiBadge-root css-1rzb3uu')])[3]")
	public WebElement calenderIcon;
	
	@FindBy(xpath = "//button[text()='Apply for shift']")
	public WebElement applyForShiftButton;
	
	@FindBy(xpath = "(//div[@role='combobox'])[1]")
	public WebElement monthTxtField;
	
	@FindBy(xpath = "//li[text()='August']")
	public WebElement selectAugustOption;
	
	@FindBy(xpath = "//button[text()='13']")
	public WebElement selectDate13;
	
	@FindBy(xpath = "//button[text()='23']")
	public WebElement selectDate23;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//button[text()='Delete']")
	public WebElement deleteButton;
	
	@FindBy(id = "demo-simple-select")
	public WebElement selectShiftType;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-testid='DeleteIcon']")
	public WebElement redDeleteButton;

	
	
	public WebElement getCalenderIcon() {
		return calenderIcon;
	}

	public WebElement getApplyForShiftButton() {
		return applyForShiftButton;
	}


	public WebElement getMonthTxtField() {
		return monthTxtField;
	}

	public WebElement getSelectAugustOption() {
		return selectAugustOption;
	}

	public WebElement getSelectDate12() {
		return selectDate13;
	}
	
	public WebElement getSelectDate22() {
		return selectDate23;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getUpdateButton() {
		return updateButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getSelectShiftType() {
		return selectShiftType;
	}

	public WebElement getRedDeleteButton() {
		return redDeleteButton;
	}
	
	

}
