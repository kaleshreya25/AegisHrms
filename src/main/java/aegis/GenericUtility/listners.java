package aegis.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners extends baseTest implements ITestListener,ISuiteListener {

	javaUtility java=new javaUtility();
	
	public void onTestFailure(ITestResult result) {
		
		String path = frameworkConstants.ListnerShots+java.localdateTime()+".png";
		
		TakesScreenshot ts=(TakesScreenshot)baseTest.listnerDriver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
