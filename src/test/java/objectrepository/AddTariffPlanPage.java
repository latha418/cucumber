package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.BaseClass;

public class AddTariffPlanPage extends BaseClass {
	
	public AddTariffPlanPage() {
		PageFactory.initElements(driver,this);
	}

@FindBy(name="rental")
private WebElement monthRental;

@FindBy(name="local_minutes")
private WebElement freeLocalmin;

@FindBy(name="inter_minutes")
private WebElement freeIntermin;

@FindBy( name="sms_pack")
private WebElement freeSms;

@FindBy(name="minutes_charges")
private WebElement localCharge;

@FindBy(name="inter_charges")
private WebElement interCharge;

@FindBy(id="sms_charges")
private WebElement smsCharge;

public WebElement getMonthRental() {
	return monthRental;
}

public WebElement getFreeLocalmin() {
	return freeLocalmin;
}

public WebElement getFreeIntermin() {
	return freeIntermin;
}

public WebElement getFreeSms() {
	return freeSms;
}

public WebElement getLocalCharge() {
	return localCharge;
}

public WebElement getInterCharge() {
	return interCharge;
}

public WebElement getSmsCharge() {
	return smsCharge;
}

public WebElement getSubmitBtn() {
	return submitBtn;
}

public WebElement getResetBtn() {
	return resetBtn;
}

public WebElement getCongratsMsg() {
	return congratsMsg;
}

public WebElement getHomeBtn() {
	return homeBtn;
}

@FindBy(xpath="//input[@type='submit']")
private WebElement submitBtn;

@FindBy(xpath="//input[@type='reset']")
private WebElement resetBtn;

@FindBy(tagName="h2")
private WebElement congratsMsg;

@FindBy(xpath="//a[@class='button']")
private WebElement homeBtn;

   }
