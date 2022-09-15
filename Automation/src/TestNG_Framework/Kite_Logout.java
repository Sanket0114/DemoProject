package TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Logout {

	@FindBy(xpath = "//a[contains(text(),' Logout')]")private WebElement Logout;

	public Kite_Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickKiteLogOutBtn() {
		Logout.click();
	}

}
