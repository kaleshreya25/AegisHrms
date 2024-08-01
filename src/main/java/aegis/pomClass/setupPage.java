package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class setupPage {
	
	public setupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//select Profile
	@FindBy(xpath = "//input[contains(@id,'react-select-2-input')]")
	public WebElement profileField;
	
	//communication
	@FindBy(xpath = "(//h1[text()='Communication'])[2]")
	public WebElement communication;
	@FindBy(linkText = "Employee Survey")
	public WebElement employeeSurvey;
	
	//employee
	@FindBy(xpath = "(//h1[text()='Employee'])")
	public WebElement employee;
	@FindBy(linkText = "Onboarding")
	public WebElement onboarding;
	@FindBy(linkText = "Offboarding")
	public WebElement offboarding;
	@FindBy(linkText = "Employee List")
	public WebElement employeeList;
	
	//organisation
	@FindBy(xpath = "(//h1[text()='Organisation'])")
	public WebElement organisation;
	@FindBy(linkText = "Add Organisation")
	public WebElement addOrganisation;
	@FindBy(linkText = "Organisation List")
	public WebElement organisationList;
	@FindBy(linkText = "Organisation Hierarchy")
	public WebElement organisationHierarchy;
	
	//self Help
	@FindBy(xpath = "//h1[text()='Self Help']")
	public WebElement selfHelp;
	@FindBy(xpath = "//h1[text()='Attendance & Leave Management']")
	public WebElement attendenceMangement;
	@FindBy(xpath = "//h1[text()='Account Settings']")
	public WebElement accountSetting;
	@FindBy(xpath = "//h1[text()='Shift Management']")
	public WebElement shiftManagement;
	
	//department
	@FindBy(xpath = "//h1[text()='Department']")
	public WebElement department;
	@FindBy(linkText = "Add Department")
	public WebElement addDepartment;
	@FindBy(linkText = "Delete Department")
	public WebElement deleteDepartment;
	@FindBy(linkText = "Manage Department")
	public WebElement manageDepartment;
	

	
	
	public WebElement getDepartment() {
		return department;
	}

	public WebElement getAddDepartment() {
		return addDepartment;
	}

	public WebElement getDeleteDepartment() {
		return deleteDepartment;
	}

	public WebElement getManageDepartment() {
		return manageDepartment;
	}

	public WebElement getProfileField() {
		return profileField;
	}

	public WebElement getSelfHelp() {
		return selfHelp;
	}

	public WebElement getAttendenceMangement() {
		return attendenceMangement;
	}

	public WebElement getAccountSetting() {
		return accountSetting;
	}

	public WebElement getShiftManagement() {
		return shiftManagement;
	}

	public WebElement getEmployee() {
		return employee;
	}

	public WebElement getOnboarding() {
		return onboarding;
	}

	public WebElement getOffboarding() {
		return offboarding;
	}

	public WebElement getEmployeeList() {
		return employeeList;
	}

	public WebElement getOrganisation() {
		return organisation;
	}

	public WebElement getAddOrganisation() {
		return addOrganisation;
	}

	public WebElement getOrganisationList() {
		return organisationList;
	}

	public WebElement getOrganisationHierarchy() {
		return organisationHierarchy;
	}

	public WebElement getCommunication() {
		return communication;
	}

	public WebElement getEmployeeSurvey() {
		return employeeSurvey;
	}

}
