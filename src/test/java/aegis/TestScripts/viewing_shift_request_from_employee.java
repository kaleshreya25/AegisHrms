package aegis.TestScripts;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.pomClass.homePage;
import aegis.pomClass.notificationPage;
import aegis.pomClass.organisationListPage;
import aegis.pomClass.shiftNotificationPage;

@Listeners(aegis.GenericUtility.listners.class)
public class viewing_shift_request_from_employee extends baseTest {

	@Test
	public void viewNotificationOfShiftManagement() throws InterruptedException {
		
		shiftNotificationPage shift=new shiftNotificationPage(listnerDriver);
		notificationPage notification=new notificationPage(listnerDriver);
		homePage home=new homePage(listnerDriver);
		organisationListPage org=new organisationListPage(listnerDriver);
		listnerDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		home.goToOrganizationButton.click();
		org.setupButton.click();
		
		home.notificationIcon.click();
		
		notification.shiftNotification.click();
		shift.empIcon.click();
		shift.acceptButton.click();
		Thread.sleep(3000);
		shift.acceptButton.click();
		
	}
	
}
