package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import utils.browserDriver;
import utils.commonUtils;

public class homePageLocators {
	
	By flights = By.xpath(".//a[@id='header_tab_flights']");
	By source = By.xpath(".//input[@id='hp-widget__sfrom']");
	By dest = By.id("hp-widget__sTo");
	By search = By.id("searchBtn");
	By departDateField = By.xpath(".//input[@id='hp-widget__depart']");
	By currentDepartDate = By.xpath(".//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[contains(@class,'ui-state-active')]");
	By searchResult = By.xpath(".//div[@class='modify_search noneAll']");
	By notification = By.xpath(".//a[@id='webklipper-publisher-widget-container-notification-close-div']/i");
	
	public void getSource() throws InterruptedException{
		commonUtils.implicitWait(3000);
		browserDriver.driver.findElement(flights).click();
		commonUtils.implicitWait(3000);
		browserDriver.driver.findElement(source).click();
		//commonUtils.implicitWait(4000);
		Thread.sleep(3000);
		browserDriver.driver.findElement(source).sendKeys("Bangalore");
	}
	
	public void getdest() throws InterruptedException{
		browserDriver.driver.findElement(dest).click();
		//commonUtils.implicitWait(3000);
		Thread.sleep(3000);
		browserDriver.driver.findElement(dest).sendKeys("Delhi");
	}
	
	public void clickSearch(){
		browserDriver.driver.findElement(search).click();
	}
	
	
	public void click_depart_date_field() {
		browserDriver.driver.findElement(departDateField).click();
	}
	
	public String get_current_depart_date() {
		System.out.println(browserDriver.driver.findElement(currentDepartDate).getText());
		return browserDriver.driver.findElement(currentDepartDate).getText();
	}
	
	public void select_depart_date(int day) {
		String dateLocate=".//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[contains(text(),'";
		String actualDateLocator = dateLocate+day+"')]";
		System.out.println(actualDateLocator);
		By select_depart_date = By.xpath(actualDateLocator);
		browserDriver.driver.findElement(select_depart_date).click();
	}
	
	public WebElement getSearchResult() {
		return browserDriver.driver.findElement(searchResult);
	}
	
	public void notification_close() {
		browserDriver.driver.findElement(notification).click();
	}
}
