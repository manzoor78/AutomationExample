package utils;

import java.util.concurrent.TimeUnit;

import utils.browserDriver;

public class commonUtils {
	
	public static boolean implicitWait(long time){
		try {
			browserDriver.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			System.out.println("waited for "+time+" seconds implicityly... ");
		
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	

}
