package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import modules.TermsnConditions;
import modules.VerifyAddressProceed;
import pageobjects.AddressPage;
import pageobjects.AutomationHomePage;
import pageobjects.AutomationHomePage.HeaderPage;

public class TermsnConditionsSteps {
 	public WebDriver driver;
    public List<HashMap<String, String>> datamap;


    public TermsnConditionsSteps() {
        driver = Hooks.driver;
        datamap = DataHelper.data();
    }
	 
    @When("^I navigate to Terms and conditions page$")
    public void i_navigate_to_Terms_and_conditions_page() throws Throwable {
    	PageFactory.initElements(driver,AutomationHomePage.HeaderPage.class);
//    	TermsnCondn.Execute(driver,datamap);
    	HeaderPage.link_terms_Cond.click();
    }


	@Then("^I validate Terms and conditions page$")
	public void i_validate_Terms_and_conditions_page() throws Throwable {
		PageFactory.initElements(driver, AutomationHomePage.class);
	    TermsnConditions.expectedTCpage();
	}
}
