package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.BaseClass;

public class AccessPage extends BaseClass{
public AccessPage() {
		PageFactory.initElements(driver, this);
   }
	@FindBy(tagName="h3")
	private WebElement custIdNo;
	
	public WebElement getCustIdNo() {
		return custIdNo;
	}
	
	
	@FindBy(xpath="//a[@class='button']")
	private WebElement homeBtn;
	
	public WebElement getHomeBtn() {
		return homeBtn;
	}
	
	
	
}	
	
	
	
	

