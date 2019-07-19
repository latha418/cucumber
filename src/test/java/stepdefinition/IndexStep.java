package stepdefinition;

import cucumber.api.java.en.Given;
import pages.IndexPage;

public class IndexStep extends BaseClass{
	
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	    IndexPage ip=new IndexPage();
	    btnClick(ip.getAddCustomer());
	}
	
	@Given("user is in add tariffplan page")
	public void user_is_in_add_tariffplan_page() {
		IndexPage ip=new IndexPage();
		btnClick(ip.getAddTariffPlan());
	}

	

	

	


}
