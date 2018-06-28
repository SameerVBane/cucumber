package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class AutomationHomePage extends BaseClass{

	public AutomationHomePage(WebDriver driver){
		super(driver);
	}    

	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	public static WebElement sign_in;
	
	@FindBy(how=How.LINK_TEXT, using="Contact us")
	public static WebElement contact_us;
	
	@FindBy(how=How.LINK_TEXT, using="Sign out")
	public static WebElement sign_out;
	
		
	public static class HeaderPage 
	{
		
		@FindBy(how=How.LINK_TEXT, using="Women")
		public static WebElement menu_women;
		
		@FindBy(how=How.XPATH, using="//*a[@title='Dresses']")
		public static WebElement menu_dresses;
		
		@FindBy(how=How.XPATH, using="//*a[@title='T-shirts']")
		public static WebElement menu_tshirts;
		
		@FindBy(how=How.LINK_TEXT,using="Terms and conditions of use")
		public static WebElement link_terms_Cond;
		
		@FindBy(how=How.CLASS_NAME, using="page-heading")
		public static WebElement page_heading;

		public static class WomenPage
		{
			@FindBy(how=How.LINK_TEXT,using="Dresses")
			public static WebElement dresses;

			public static class DressesPage
			{

				@FindBy(how=How.LINK_TEXT,using="Summer Dresses")
				public static WebElement summer_dresses;

			}
		}
		

		
	}
	
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	