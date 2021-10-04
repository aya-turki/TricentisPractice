package org.mma.training.java.selenium.datadriven;

import java.util.ArrayList;

import org.mma.training.java.selenium.util.Excel_Reader;

public class TestDataUtil {
	
	static Excel_Reader reader;
	//Get data from Excel for TC_104_Trcasaction_DepositToAccount(String Account, String Deposit) 
	  
	    public static ArrayList<Object[]> getCamperTabTestData() {
	      ArrayList<Object[]> myData = new ArrayList<Object[]>();
	        try {
	        	reader = new Excel_Reader("./testdata/testdata.xlsx");
	        	//reader = new Excel_Reader("/InputDataFile/testdata.xlsx");
	              
	            }catch (Exception e) {
	              e.printStackTrace(); 
	            }
	        
	        for (int rowCnt = 2; rowCnt <= reader.getRowCount("CamperTabTestData"); rowCnt++) {
	        
	        String userCamperMake = reader.getCellData("CamperTabTestData", "CamperMake", rowCnt);
	        String userEnginePerformance = reader.getCellData("CamperTabTestData", "EnginePerformance", rowCnt);         
	        String userDateOfManufacture = reader.getCellData("CamperTabTestData", "DateOfManufacture", rowCnt);
	        String userNumberOfSeats = reader.getCellData("CamperTabTestData", "NumberOfSeats", rowCnt);  
	        String userFuelType = reader.getCellData("CamperTabTestData", "FuelType", rowCnt);
	        String userPayload = reader.getCellData("CamperTabTestData", "Payload", rowCnt);  
	        String userTotalWeight = reader.getCellData("CamperTabTestData", "TotalWeight", rowCnt);
	        String userListPrice = reader.getCellData("CamperTabTestData", "ListPrice", rowCnt);  
	        String userAnnualMileage = reader.getCellData("CamperTabTestData", "AnnualMileage", rowCnt);     
	        String userFirstName = reader.getCellData("CamperTabTestData", "FirstName", rowCnt);  
	        String userLastName = reader.getCellData("CamperTabTestData", "LastName", rowCnt);
	        String userDateOfBirth = reader.getCellData("CamperTabTestData", "DateOfBirth", rowCnt);  
	        String userStreetAddress = reader.getCellData("CamperTabTestData", "StreetAddress", rowCnt);
	        String userCountry = reader.getCellData("CamperTabTestData", "Country", rowCnt);  
	        String userZipCode = reader.getCellData("CamperTabTestData", "ZipCode", rowCnt);
	        String userOccupation = reader.getCellData("CamperTabTestData", "Occupation", rowCnt);  
	        String userStartDate = reader.getCellData("CamperTabTestData", "StartDate", rowCnt);
	        String userInsuranceSum = reader.getCellData("CamperTabTestData", "InsuranceSum", rowCnt);  
	        String userDamageInsurance = reader.getCellData("CamperTabTestData", "DamageInsurance", rowCnt);
	        String userEmail = reader.getCellData("CamperTabTestData", "Email", rowCnt);  
	        String userUserName = reader.getCellData("CamperTabTestData", "UserName", rowCnt);
	        String userPassword = reader.getCellData("CamperTabTestData", "Password", rowCnt); 
	        String userConfirmPassword = reader.getCellData("CamperTabTestData", "ConfirmPassword", rowCnt);
	                 
	        Object ob[] = {userCamperMake,
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
	        		userConfirmPassword};
	                 
	        myData.add(ob);
	     
	     }
	return myData;
	    }
	
	

}
