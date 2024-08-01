package aegis.GenericUtility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class webdriverUtility {
	
	File temp;
	File dest;
	
	javaUtility java=new javaUtility();
	String path=frameworkConstants.screenShotPath;
	
	public void webPageScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		temp=ts.getScreenshotAs(OutputType.FILE);
		dest=new File(path+"ssOfpage"+java.localdateTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	public void webElementScreenshot(WebElement element) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)element;
		temp=ts.getScreenshotAs(OutputType.FILE);
		dest=new File(path+"ssOfelement"+java.localdateTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	
}
