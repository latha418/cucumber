package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import objectrepository.AccessPage;
import objectrepository.AddCustomerPage;

public class AccessSteps extends BaseClass{

	@Then("The user should see custmerId generated")
	public void the_user_should_see_custmerId_generated() {
		AddCustomerPage ap=new AddCustomerPage();
	    Assert.assertTrue(ap.getCustId().isDisplayed());
	  }
	@Given("user is in access page")
	public void user_is_in_access_page() {
		AddCustomerPage ap=new AddCustomerPage();
		String text = ap.getCustId().getText();
		System.out.println(text);
	}

	@When("user click on home button")
	public void user_click_on_home_button() {
	    AccessPage ac=new AccessPage();
	    btnClick(ac.getHomeBtn());
	}

	@Then("user should navigate to home page or Index page")
	public void user_should_navigate_to_home_page_or_Index_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("index.html"));
	}

	

}


