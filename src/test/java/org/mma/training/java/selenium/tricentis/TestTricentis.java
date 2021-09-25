package org.mma.training.java.selenium.tricentis;

import org.mma.training.java.selenium.base.BaseClass;
import org.mma.training.java.selenium.webpages.CamperPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTricentis extends BaseClass {
	
	@Test
	
	public void camperPageValidation() {
		
		CamperPage camperPage = PageFactory.initElements(driver, CamperPage.class);
		camperPage.camperPageElementsAndMethods();
		
	}
	
	
	

}
