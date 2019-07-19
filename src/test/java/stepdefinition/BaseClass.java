package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public WebDriver driverInitiate() {
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Ravi\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
        return driver;
    }
public void loadUrl(String str) {
	driver.get(str);
    }
public void type(WebElement ele, String str) {
ele.sendKeys(str);
    }
public void btnClick(WebElement ele) {
	ele.click();
}
public void quitBrowser() {
	driver.quit();
}
public void clearText(WebElement ele) {
	ele.clear();
}
}
