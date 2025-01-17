package aegis.TestScripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.addOrganisationPage;
import aegis.pomClass.homePage;
import aegis.pomClass.organisationListPage;

@Listeners(aegis.GenericUtility.listners.class)
public class edit_organisation_from_organisation_list extends baseTest {

	@Test
	public void editOrganisationDetails() throws IOException, InterruptedException {
		
		webdriverUtility web=new webdriverUtility();
		homePage home=new homePage(listnerDriver);
		organisationListPage org=new organisationListPage(listnerDriver);
		addOrganisationPage add=new addOrganisationPage(listnerDriver);
		
		home.goToOrganizationButton.click();
		org.moreOptionIcon.click();
		org.blueEditIcon.click();
		
		add.mobile.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(3000);
		add.mobile.sendKeys("8888543120");
		add.description.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(3000);
		add.description.sendKeys("bbbbbbbb");
		web.webPageScreenshot(listnerDriver);
		
		add.submitButton.click();
		Thread.sleep(3000);
		listnerDriver.navigate().back();
		
	}
	
}
