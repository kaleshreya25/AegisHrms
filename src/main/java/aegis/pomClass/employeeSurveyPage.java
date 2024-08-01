package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employeeSurveyPage {
	
	public employeeSurveyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Create New Survey']")
	public WebElement createNewSurveyButton;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-testid='AddCircleOutlineIcon'])[1]")
	public WebElement plus1Icon;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-testid='AddCircleOutlineIcon'])[2]")
	public WebElement plus2Icon;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-testid='AddCircleOutlineIcon'])[3]")
	public WebElement plus3Icon;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-testid='AddCircleOutlineIcon'])[4]")
	public WebElement plus4Icon;

	public WebElement getCreateNewSurveyButton() {
		return createNewSurveyButton;
	}

	public WebElement getPlus1Icon() {
		return plus1Icon;
	}

	public WebElement getPlus2Icon() {
		return plus2Icon;
	}

	public WebElement getPlus3Icon() {
		return plus3Icon;
	}

	public WebElement getPlus4Icon() {
		return plus4Icon;
	}
	
	
	
}
