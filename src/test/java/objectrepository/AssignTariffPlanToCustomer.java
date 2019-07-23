package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignTariffPlanToCustomer {
@FindBy(name="customer_id")
private WebElement customerId;

@FindBy(xpath="//input[@type='submit']")
private WebElement submitBtn;

}
