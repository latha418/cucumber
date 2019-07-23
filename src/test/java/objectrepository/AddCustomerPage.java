package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.BaseClass;

public class AddCustomerPage extends BaseClass{

	public AddCustomerPage() {
		PageFactory.initElements(driver,this);
	}
	

@FindBy(xpath="//label[@for='done']")
private WebElement radioBtnDone;

public WebElement getRadioBtnDone() {
	return radioBtnDone;
}


@FindBy(xpath="//label[@for='pending']")
private WebElement radioBtnPend;

public WebElement getRadioBtnPend() {
	return radioBtnPend;
}


@FindBy(id="fname")
private WebElement fname;

public WebElement getFname() {
	return fname;
}


@FindBy(id="lname")
private WebElement lname;

public WebElement getLname() {
	return lname;
}


@FindBy(id="email")
private WebElement email;

public WebElement getEmail() {
	return email;
}


@FindBy(xpath="//textarea[@id='message']")
private WebElement address;

public WebElement getAddress() {
	return address;
}


@FindBy(id="telephoneno")
private WebElement tPhone;

public WebElement gettPhone() {
	return tPhone;
}


@FindBy(xpath="//input[@type='submit']")
private WebElement submitBtn;

public WebElement getSubmitBtn() {
	return submitBtn;
}


@FindBy(xpath="//input[@type='reset']")
private WebElement resetBtn;

public WebElement getResetBtn() {
	return resetBtn;
}


@FindBy(tagName="h3")
private WebElement custId;

public WebElement getCustId() {
	return custId;
}


@FindBy(xpath="//label[@id='message7']")
private WebElement popupmsg;

public WebElement getPopupmsg() {
	return popupmsg;
}


}
