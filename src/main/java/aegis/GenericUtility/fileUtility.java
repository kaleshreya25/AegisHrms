package aegis.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileUtility {
	
	FileInputStream fis;
	
	public String propertyFile(String key) throws IOException {
		fis = new FileInputStream(frameworkConstants.propertyPath);
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
	
	public String allOtherData(String key) throws IOException {
		fis = new FileInputStream(frameworkConstants.otherData);
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}

}
