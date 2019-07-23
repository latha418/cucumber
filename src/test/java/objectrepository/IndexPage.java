package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.BaseClass;

public class IndexPage extends BaseClass {
public IndexPage() {
	PageFactory.initElements(driver,this);
}
@FindBy(linkText="Add Customer")
private WebElement addCustomer;

public WebElement getAddCustomer() {
	return addCustomer;
}

public WebElement getAddTariffPlanToCustomer() {
	return addTariffPlanToCustomer;
}

public WebElement getAddTariffPlan() {
	return addTariffPlan;
}

public WebElement getPayBilling() {
	return payBilling;
}

@FindBy(linkText="Add Tariff Plan to Customer")
private WebElement addTariffPlanToCustomer;

@FindBy(linkText="Add Tariff Plan")
private WebElement addTariffPlan;

@FindBy(linkText="Pay Billing")
private WebElement payBilling;





















}
