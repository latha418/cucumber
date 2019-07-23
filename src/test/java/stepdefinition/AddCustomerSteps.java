package stepdefinition;

import java.util.List;

import org.openqa.selenium.Alert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import objectrepository.AddCustomerPage;

public class AddCustomerSteps extends BaseClass {
	@When("The user fill the add customer details")
	public void the_user_fill_the_add_customer_details() {
	   AddCustomerPage ap=new AddCustomerPage();
	   btnClick(ap.getRadioBtnDone());
	   type(ap.getFname(), "madhu");
	   type(ap.getLname(), "latha");
	   type(ap.getEmail(), "latha@gmail.com");
	   type(ap.getAddress(), "address");
	   type(ap.gettPhone(), "898595");
	   
	 }
	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		AddCustomerPage ap=new AddCustomerPage();
		btnClick(ap.getSubmitBtn());
	}
	
	
	@When("The user clicks the reset button")
	public void the_user_clicks_the_reset_button() {
		AddCustomerPage ap=new AddCustomerPage();
	    btnClick(ap.getResetBtn());
	}

	@Then("The info given should be cleared")
	public void the_info_given_should_be_cleared() {
		AddCustomerPage ap=new AddCustomerPage();
		Assert.assertFalse(ap.getRadioBtnDone().isSelected());
		Assert.assertEquals("firstnamecleared", "", ap.getFname().getAttribute("value"));
		Assert.assertEquals("lastnamecleared", "", ap.getLname().getAttribute("value"));
		Assert.assertEquals("Emailcleared", "", ap.getEmail().getAttribute("value"));
		Assert.assertEquals("addresscleared", "", ap.getAddress().getAttribute("value"));
		Assert.assertEquals("Phone number cleared", "", ap.gettPhone().getAttribute("value"));
	}
	@When("customer add wrong format in mobile number textbox")
	public void customer_add_wrong_format_in_mobile_number_textbox(DataTable custDetails) {
	 List<String> custDetailsList =custDetails.asList(String.class);
	 System.out.println(custDetailsList);
	 AddCustomerPage ap=new AddCustomerPage();
	 btnClick(ap.getRadioBtnDone());
	 type(ap.getFname(), custDetailsList.get(0));
	 type(ap.getLname(), custDetailsList.get(0));
	 type(ap.getEmail(), custDetailsList.get(0));
	 type(ap.getAddress(), custDetailsList.get(0));
	 type(ap.gettPhone(), custDetailsList.get(0));
	 ap.getPopupmsg().getAttribute("value");
	}
	
	@Then("Pop up should come like Characters not allowed")
	public void pop_up_should_come_like_Characters_not_allowed() {
		AddCustomerPage ap=new AddCustomerPage();
	    Assert.assertEquals("verify message", "Characters are not allowed",
	    		ap.getPopupmsg().getText());
	    System.out.println(ap.getPopupmsg().getText());
	}
	
	@When("The user fill the add customer details and missed one field")
	public void the_user_fill_the_add_customer_details_and_missed_one_field() {
		AddCustomerPage ap=new AddCustomerPage();
		   btnClick(ap.getRadioBtnDone());
		   type(ap.getFname(), "madhu");
		   type(ap.getLname(), "latha");
		   type(ap.getEmail(), "latha@gmail.com");
		   type(ap.getAddress(), "address");
//		   Alert alert = driver.switchTo().alert();
//		   alert.accept();
//	    
	}

	@Then("The user should see pop up generated")
	public void the_user_should_see_pop_up_generated() {
		
		
        

		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	finally {
		System.out.println("Hai");
	}
	   
	}
	
	
	
	
	
	
	
	
	
	

}
