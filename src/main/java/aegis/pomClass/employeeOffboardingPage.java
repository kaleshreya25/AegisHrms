package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employeeOffboardingPage {
	
	public employeeOffboardingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[contains(@class,'PrivateSwitchBase-input css-1m9pwf3')])")
	public WebElement checkbox;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-testid='DeleteOutlineIcon']")
	public WebElement redDeleteIcon;
	
	@FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedErr')]")
	public WebElement redDeleteButton;
	
	@FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-ou')]")
	public WebElement cancelButton;
	
	@FindBy(xpath = "//button[text()='Bulk Delete']")
	public WebElement bulkDeleteButton;
	
	@FindBy(xpath = "//button[text()='Delete']")
	public WebElement blueDeleteButton;
	
	@FindBy(id = ":r4:")
	public WebElement searchEmployeeNameTxtField;
	
	@FindBy(id = ":r5:")
	public WebElement searchDepartmentNameTxtField;
	
	@FindBy(id = ":r6:")
	public WebElement searchLocationTxtField;
	
}
