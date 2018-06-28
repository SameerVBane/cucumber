package modules;

import org.junit.Assert;

import pageobjects.AutomationHomePage;

public class TermsnConditions {
	
	public static void expectedTCpage() {
		
		String ActualPage = AutomationHomePage.HeaderPage.page_heading.getText();
	    String ExpectedPage = "TERMS AND CONDITIONS OF USE333";
	    Assert.assertEquals( ActualPage,ExpectedPage);
	}
	

}
