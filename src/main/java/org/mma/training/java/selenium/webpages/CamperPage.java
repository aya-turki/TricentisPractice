package org.mma.training.java.selenium.webpages;

import org.mma.training.java.selenium.base.BaseClass;

/**
 * *********************************************************************************
 * Author: Aya Turki
 * Class Name: Login page
 * Description: This class will store all the locator and methods of Login page
 * Reviewer Name:
 * Comments:
 * **********************************************************************************
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CamperPage {
	
	public WebDriver driver;
	public CamperPage(WebDriver driver){
	   this.driver = driver;	
	   }
	// Web elements - Camper	
	@FindBy(name="Tricentis Logo") WebElement systemLogo;
	
	@Test	
	public void camperPageElementsAndMethods() {
	   try {
		    Thread.sleep(4000); // Wait statement
	  
	        // Methods - Camper
		      Assert.assertTrue(systemLogo.isDisplayed(), "web element is not displayed");
        } catch (InterruptedException e) {
      }	
   }
}

/**
 * *********************************************************************
 * End of the file
 * *********************************************************************
 */
