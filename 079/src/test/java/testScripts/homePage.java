package testScripts;

import org.testng.annotations.Test;

import pages.homePageLocators;
import testBase.testBaseCommon;
import utils.commonUtils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterClass;

public class homePage extends testBaseCommon{
	
	homePageLocators homePageLib = new homePageLocators();
  @Test
  public void findFlights() throws InterruptedException {
	  //String expected = "Flights on top !";
	  homePageLib.getSource();
	  Thread.sleep(4000);
	  homePageLib.getdest();
	  Thread.sleep(4000);
	  homePageLib.clickSearch();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void setup() throws FileNotFoundException, IOException {
	  init();
  }

  @AfterClass
  public void afterClass() {
	  //browserDriver.driver.close();
  }

}
