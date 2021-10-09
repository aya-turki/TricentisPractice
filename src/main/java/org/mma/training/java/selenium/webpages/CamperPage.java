package org.mma.training.java.selenium.webpages;
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
	@FindBy(name="Next (Enter Insurant Data)") WebElement insurantDatNextBtn;

	@FindBy(xpath="//input[@id='firstname']") WebElement firstName;
	@FindBy(xpath="//input[@id='lastname']") WebElement lastName;
	@FindBy(xpath="//input[@id='birthdate']") WebElement birthDate;
	@FindBy(xpath="//select[@id='country']") WebElement countryDrp;
	@FindBy(xpath="//div[@class='fullwidth-block']") WebElement zipCode;
	@FindBy(xpath="//select[@id='occupation']") WebElement occupationDrp;
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span") WebElement hobbiesSpeedy;
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span") WebElement hobbiesSkydiving;
	@FindBy(name="Next (Enter Product Data)") WebElement productDatNextBtn;

	@FindBy(name="Start Date") WebElement startDate;
	@FindBy(name="Insurance Sum") WebElement insuranceSum;
	@FindBy(name="Merit Rating") WebElement meritRating;
	@FindBy(name="Damage Insurance") WebElement damageInsurance;
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span") WebElement euroProtection; 
	@FindBy(name="Courtesy Car") WebElement courtesyCar;
	@FindBy(name="Next (Select Price Option)") WebElement SelectPriceOptionNextBtn;
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]") WebElement silverRadio; 
	@FindBy(name="Next (Send Quote)") WebElement sendQuoteNextBtn;
	@FindBy(name="E-Mail") WebElement email;
	@FindBy(name="Username") WebElement userInput;
	@FindBy(name="Password") WebElement passInput;
	@FindBy(name="Confirm Password") WebElement confirmPassInput;
	@FindBy(name="Send E-Mail") WebElement sendEmailNextBtn;
	

	@Test	
	public void camperPageElementsAndMethods(String mInput, String kInput, 
			String manuInput, String nosDrp, String fType, String pload, 
			String tw, String lpInput, String amInput, String fnInput, String lsInput, 
			String bdInput, String ucDrp, String zpInput, String ocDrp, String sdInput, String isDrp, 
			String mrDrp, String dmDrp, String ccDrp) {
		try {
			Thread.sleep(4000); // Wait statement

			// Methods - Camper
			Assert.assertTrue(systemLogo.isDisplayed(), "web element is not displayed");
			// 1 Enter Vehicle Data 
			camperTab.click();
			makeInput.sendKeys(mInput);
			kWInput.sendKeys(kInput);
			manufactureDateInput.sendKeys(manuInput);
			Select numberOfSeatsDrp = new Select (numberOfSeats);
			numberOfSeatsDrp.selectByVisibleText(nosDrp);
			Select fuelTypeDrp = new Select (fuelType);
			fuelTypeDrp.selectByVisibleText(fType);
			payload.sendKeys(pload);
			totalWeight.sendKeys(tw);
			listPrice.sendKeys(lpInput);
			// licensePlateNumber.sendKeys(null);
			annualMileage.sendKeys(amInput);
			insurantDatNextBtn.click();
			
			//  2 Enter Insurant Data
			
			firstName.sendKeys(fnInput);
			lastName.sendKeys(lsInput);
			birthDate.sendKeys(bdInput);
			
			Select userCountry = new Select (countryDrp);
			userCountry.selectByVisibleText(ucDrp);
			zipCode.sendKeys(zpInput);
		
			Select userOccupation = new Select (occupationDrp);
			userOccupation.selectByVisibleText(ocDrp);
			hobbiesSpeedy.click();
			productDatNextBtn.click();

			// 3 Enter Product Data
			startDate.sendKeys(sdInput);
			Select insuranceSumDrp = new Select (insuranceSum);
			insuranceSumDrp.selectByVisibleText(isDrp);
			Select meritRatingDrp = new Select (meritRating);
			meritRatingDrp.selectByVisibleText(mrDrp);
			Select damageInsuranceDrp = new Select (damageInsurance);
			damageInsuranceDrp.selectByVisibleText(dmDrp);
			euroProtection.click();
			Select courtesyCarDrp = new Select (courtesyCar);
			courtesyCarDrp.selectByVisibleText(ccDrp);
			silverRadio.click();
			sendQuoteNextBtn.click();

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
