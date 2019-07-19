package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.BaseClass;

public class BillingPage extends BaseClass{

	public BillingPage() {
		PageFactory.initElements(driver,this);
	}

@FindBy(id="customer_id")
private WebElement custId;
}
