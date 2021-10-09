package org.mma.training.java.selenium.tricentis;


import org.mma.training.java.selenium.base.BaseClass;
import org.mma.training.java.selenium.webpages.CamperPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTricentis extends BaseClass {
	
	@Test (dataProvider="getCamperTabTestData")
	
	public void camperPageValidation(String userCamperMake, String userEnginePerformance, String userDateOfManufacture, 
		String userNumberOfSeats, String userFuelType, String userPayload, String userTotalWeight, String userListPrice, 
		String userAnnualMileage, String userFirstName, String userLastName, String userDateOfBirth, String userStreetAddress,
		String userCountry, String userZipCode, String userOccupation, String userStartDate, String userInsuranceSum, 
		String userDamageInsurance, String userEmail, String userUserName, String userPassword, String userConfirmPassword) {
		
		CamperPage camperPage = PageFactory.initElements(driver, CamperPage.class);
		camperPage.camperPageElementsAndMethods(userCamperMake,
        		userEnginePerformance,
        		userDateOfManufacture,
        		userNumberOfSeats,
        		userFuelType,
        		userPayload,
        		userTotalWeight,
        		userListPrice,
        		userAnnualMileage,
        		userFirstName,
        		userLastName,
        		userDateOfBirth,
        		userStreetAddress,
        		userCountry,
        		userZipCode,
        		userOccupation,
        		userStartDate,
        		userInsuranceSum,
        		userDamageInsurance,
        		userEmail,
        		userUserName,
        		userPassword,
        		userConfirmPassword);
		
	//	camperPage.camperPageElementsAndMethods(userCamperMake, userEnginePerformance, userDateOfManufacture, userNumberOfSeats, userFuelType,
		//    	userPayload, userTotalWeight, userListPrice, userAnnualMileage);

	}
	
	
	

}
