package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createNewSurveyPage {
	
	public createNewSurveyPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
	public WebElement titleTxtField;
	
	@FindBy(xpath = "(//p)[3]")
	public WebElement descriptionTxtField;
	

	@FindBy(id = "question-type-select-0")
	public WebElement selectQuestionTypeField;
	
	@FindBy(xpath = "//li[text()='Short Answer']")
	public WebElement shortAns;
	
	@FindBy(xpath = "//input[contains(@class,'MuiInputBase-input')]")
	public WebElement questionField;
	
	@FindBy(xpath = "//button[text()='Add Question']")
	public WebElement addQuestionButton;
	
	@FindBy(xpath = "//span[contains(@class,'MuiSwitch-track c')]")
	public WebElement requiredButton;
	
	@FindBy(name = "employeeSurveyStartingDate")
	public WebElement startdateField;
	
	@FindBy(name = "employeeSurveyEndDate")
	public WebElement endDateField;
	
	@FindBy(xpath = "//input[contains(@class,'PrivateSwitchBase-input css-1m9pwf3')]")
	public WebElement selectAllEmpCheckbox;
	
	@FindBy(xpath = "//button[text()='Select All']")
	public WebElement selectAllButton;
	
	@FindBy(id = "react-select-5-input")
	public WebElement emailTxtField;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//button[text()='Save For Now']")
	public WebElement saveForNowButton;
	
	@FindBy(xpath = "//button[text()='Close']")
	public WebElement closeButton;
	
	public WebElement getSelectAllButton() {
		return selectAllButton;
	}

	public WebElement getShortAns() {
		return shortAns;
	}

	public WebElement getTitleTxtField() {
		return titleTxtField;
	}

	public WebElement getDescriptionTxtField() {
		return descriptionTxtField;
	}

	public WebElement getSelectQuestionTypeField() {
		return selectQuestionTypeField;
	}

	public WebElement getQuestionField() {
		return questionField;
	}

	public WebElement getStartdateField() {
		return startdateField;
	}

	public WebElement getEndDateField() {
		return endDateField;
	}

	public WebElement getSelectAllEmpCheckbox() {
		return selectAllEmpCheckbox;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
