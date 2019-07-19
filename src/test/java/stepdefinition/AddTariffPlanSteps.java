package stepdefinition;

import java.util.Map;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AddTariffPlanPage;

public class AddTariffPlanSteps extends BaseClass{
	
	@When("entered all details {string},{string},{string},{string},{string},{string},{string}")
	public void entered_all_details(String monthrental, String freelocal, String freeinter, String freesms, String localcharge, String intercharge, String smscharge) {
		AddTariffPlanPage at=new AddTariffPlanPage();
	    type(at.getMonthRental(),monthrental);
	    type(at.getFreeLocalmin(),freelocal);
	    type(at.getFreeIntermin(),freeinter);
	    type(at.getFreeSms(),freesms);
	    type(at.getLocalCharge(),localcharge);
	    type(at.getInterCharge(),intercharge);
	    type(at.getSmsCharge(),smscharge);
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		AddTariffPlanPage at=new AddTariffPlanPage();
		btnClick(at.getSubmitBtn());
	}

	@Then("user should see congrats message")
	public void user_should_see_congrats_message() {
		AddTariffPlanPage at=new AddTariffPlanPage();
		Assert.assertEquals("Congratulation you add Tariff Plan", at.getCongratsMsg().getText());
	}
	
	@When("entered all details")
	public void entered_all_details(io.cucumber.datatable.DataTable custDetails) {
		AddTariffPlanPage at=new AddTariffPlanPage();
		Map<String,String> custDetailsmap=custDetails.asMap(String.class,String.class);
	   type(at.getMonthRental(),custDetailsmap.get("monthrent"));
	   type(at.getMonthRental(),custDetailsmap.get("freelocalmins"));
	   type(at.getMonthRental(),custDetailsmap.get("freeintermins"));
	   type(at.getMonthRental(),custDetailsmap.get("freesms"));
	   type(at.getMonthRental(),custDetailsmap.get("localchargemins"));
	   type(at.getMonthRental(),custDetailsmap.get("interchargemins"));
	   type(at.getMonthRental(),custDetailsmap.get("smscharges"));
	}
	@Then("user click on home button it should navigate to Homepage or IndexPage")
	public void user_click_on_home_button_it_should_navigate_to_Homepage_or_IndexPage() {
		Assert.assertTrue(driver.getCurrentUrl().contains("index.html"));
	}


	
	
	
	
	
	
	




}
