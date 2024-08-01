package aegis.TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.employeeOffboardingPage;
import aegis.pomClass.homePage;
import aegis.pomClass.organisationListPage;
import aegis.pomClass.setupPage;

@Listeners(aegis.GenericUtility.listners.class)
public class employee_offboarding_in_employee extends baseTest {
	
	@Test
	public void offboarding() throws IOException {
		
		setupPage setup=new setupPage(listnerDriver);
		organisationListPage org=new organisationListPage(listnerDriver);
		employeeOffboardingPage offboard=new employeeOffboardingPage(listnerDriver);
		homePage home=new homePage(listnerDriver);
		webdriverUtility web=new webdriverUtility();
		
		home.goToOrganizationButton.click();
		org.setupButton.click();
		
		home.navigationButon.click();
		setup.employee.click();
		setup.offboarding.click();
		
		web.webPageScreenshot(listnerDriver);
		offboard.searchEmployeeNameTxtField.sendKeys("employee");
		web.webElementScreenshot(offboard.searchEmployeeNameTxtField);
		offboard.redDeleteIcon.click();
		web.webPageScreenshot(listnerDriver);
		offboard.redDeleteButton.click();
		
	}

}
