package org.mma.training.java.selenium.base;

/**
 * ********************************************************************************************************************
 * Author: Salma Akhter
 * Class Name: Base Class
 * Description: This class will store precondition (open browser) and post condition (open browser) of all the scripts
 * Reviewer Name:
 * Comments:
 * *********************************************************************************************************************
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.mma.training.java.selenium.util.BrowserFactory;
import org.mma.training.java.selenium.util.Helper;

import java.util.concurrent.TimeUnit;

public class BaseClass {

	
	public WebDriver driver;	
	public String Browser = "Chrome";
	public String baseurl = "http://sampleapp.tricentis.com/101/index.php";

	
	   @BeforeClass
	   public void StartBrowser() {	
		  try {
		  driver = BrowserFactory.startApplication(driver, Browser, baseurl);
		  
		     Thread.sleep(2000);
		   System.out.println(driver.getTitle());
		 // Assert.assertEquals(driver.getTitle(), "aydentax.com/");	
		  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	     } catch (InterruptedException e) {
	     }
	   } 
	   
	   
	   
	   @AfterClass
		   public void CloseBrowser() {	
		   BrowserFactory.closeBrowser(driver);	 
		 }
		 
	
	  @AfterMethod
	      public void tearDownMethod (ITestResult result) {
	      
	         if (result.getStatus()== ITestResult.FAILURE) {
	        	  Helper.captureScreenshot(driver);
	         }
	        
}
	   
  
	   
}

/**
 * *********************************************************************
 * End of the file
 * *********************************************************************
 */
