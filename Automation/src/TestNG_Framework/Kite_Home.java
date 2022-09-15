package TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home {

	@FindBy(xpath = "//span[contains(text(),'XB2732')]")private WebElement UsrID;

	public Kite_Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String verifyKiteUserID() {
		String actResult = UsrID.getText();
		return actResult;
	}

	public void clickKiteUserID() {
		UsrID.click();
	}

}
