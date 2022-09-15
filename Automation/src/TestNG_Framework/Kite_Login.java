package TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login {

	@FindBy(xpath = "//input[@type='text']")private WebElement UN;
	@FindBy(xpath = "//input[@type='password']")private WebElement PWD;
	@FindBy(xpath = "//button[contains(text(),'Login ')]")	private WebElement Login;

	public Kite_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setKiteUserName(String Username) {
		UN.sendKeys("XB2732");
	}

	public void setKitePWD(String Password) {
		PWD.sendKeys("Jaichandra@123");
	}

	public void clickKiteLoginBtn() {
		Login.click();
	}

}
