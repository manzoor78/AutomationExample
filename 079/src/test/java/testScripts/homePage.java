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

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class homePage extends testBaseCommon{
	
	homePageLocators homePageLib = new homePageLocators();
	
	// To find all the flights flying from Bangalore to Delhi next week
  @Test
  public void findFlights() throws InterruptedException {
	  
	 //Input the source as Bangalore
	  homePageLib.getSource();
	  
	 // Input the destination as Delhi
	  homePageLib.getdest();
	  
	  homePageLib.click_depart_date_field();
	  //Get the current Day
	  String dateStr = homePageLib.get_current_depart_date();
	  int todaysDate = Integer.parseInt(dateStr);

	  //Select Depart Date equal to current day plus 7
	  homePageLib.select_depart_date(add(todaysDate,7));
	  commonUtils.implicitWait(3000);
	  
	  //Search for flights
	  homePageLib.clickSearch();
	  
	  Assert.assertTrue(homePageLib.getSearchResult().isDisplayed());
	  System.out.println("Test execution pass");
	  
  }
  
  public int add(int x, int y) {
	  return x+y;
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
	  //browserDriver.driver.quit();
  }

}
