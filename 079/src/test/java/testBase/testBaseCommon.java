package testBase;

import java.io.FileNotFoundException;
import java.io.IOException;

import utils.browserDriver;
import utils.readProperties;

public class testBaseCommon {
	public readProperties propertyFile = new readProperties();
	//public browserDriver browserSelect = new browserDriver();

	public void init() throws FileNotFoundException, IOException{
		propertyFile.loadPropertyFile();
		browserDriver.browser(propertyFile.getBrowser());
		browserDriver.driver.get(propertyFile.getURL());
	}

}
