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
import org.openqa.selenium.support.ui.Select;
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
	@FindBy(name="Navigation Camper") WebElement camperTab;
	@FindBy(name="Make") WebElement makeInput;
	@FindBy(name="[kW]") WebElement kWInput;
	@FindBy(name="Open Date of Manufacture Calender") WebElement manufactureDateInput; 
	@FindBy(name="Number of Seats") WebElement numberOfSeats;
	@FindBy(name="Fuel Type") WebElement fuelType;
	@FindBy(name="Payload") WebElement payload;
	@FindBy(name="Total Weight") WebElement totalWeight;
	@FindBy(name="List Price") WebElement listPrice;
	@FindBy(name="License Plate Number") WebElement licensePlateNumber;
	@FindBy(name="Annual Mileage") WebElement annualMileage;
	@FindBy(name="Next (Enter Insurant Data)") WebElement nextBtn;


	@Test	
	public void camperPageElementsAndMethods() {
		try {
			Thread.sleep(4000); // Wait statement

			// Methods - Camper
			Assert.assertTrue(systemLogo.isDisplayed(), "web element is not displayed");
			camperTab.click();
			makeInput.sendKeys(null);
			kWInput.sendKeys(null);
			manufactureDateInput.sendKeys(null);
			Select numberOfSeatsDrp = new Select (numberOfSeats);
			numberOfSeatsDrp.selectByVisibleText(null);
			Select fuelTypeDrp = new Select (fuelType);
			fuelTypeDrp.selectByVisibleText(null);
			payload.sendKeys(null);
			totalWeight.sendKeys(null);
			listPrice.sendKeys(null);
			licensePlateNumber.sendKeys(null);
			annualMileage.sendKeys(null);
			nextBtn.click();

			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}	
	}
}

/**
 * *********************************************************************
 * End of the file
 * *********************************************************************
 */
