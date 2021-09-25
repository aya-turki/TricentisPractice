package org.mma.training.java.selenium.datadriven;

import java.util.ArrayList;

import org.mma.training.java.selenium.util.Excel_Reader;



public class TestDataUtil {
	
	static Excel_Reader reader;
	//Get data from Excel for TC_104_Trcasaction_DepositToAccount(String Account, String Deposit) 
	  
	    public static ArrayList<Object[]> getLoginTestData() {
	      ArrayList<Object[]> myData = new ArrayList<Object[]>();
	        try {
	        	reader = new Excel_Reader("C:\\Users\\Aya\\Downloads\\ProfoundRadiance\\InputDataFile\\testdata.xlsx");
	        	//reader = new Excel_Reader("/InputDataFile/testdata.xlsx");
	              
	            }catch (Exception e) {
	              e.printStackTrace(); 
	            }
	        
	        for (int rowCnt = 2; rowCnt <= reader.getRowCount("LoginTestData"); rowCnt++) {
	        
	        String UserID = reader.getCellData("LoginTestData", "Username", rowCnt);
	        String Passwd = reader.getCellData("LoginTestData", "Password", rowCnt);        
	       
	        
	          
	        Object ob[] = {UserID, Passwd};
	          
	        myData.add(ob);
	     
	     }
	return myData;
	    }
	
	

}
