package stepdefinition;



import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
@Before
public void initiate() {
	driverInitiate();
	loadUrl("http://demo.guru99.com/telecom/index.html");
}
@After
public void quitIt() {
    quitBrowser();
}

}
