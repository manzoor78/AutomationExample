package pages;

import org.openqa.selenium.By;

import utils.browserDriver;
import utils.commonUtils;

public class homePageLocators {
	
	By source = By.id("hp-widget__sfrom");
	By dest = By.id("hp-widget__sTo");
	By search = By.id("searchBtn");
	
	public void getSource() throws InterruptedException{
		browserDriver.driver.findElement(source).click();
		commonUtils.implicitWait(3);
		browserDriver.driver.findElement(source).sendKeys("Bangalore");
	}
	
	public void getdest() throws InterruptedException{
		browserDriver.driver.findElement(dest).click();
		Thread.sleep(3000);
		browserDriver.driver.findElement(dest).sendKeys("Delhi");
	}
	
	public void clickSearch(){
		browserDriver.driver.findElement(search).click();
	}
	
}
