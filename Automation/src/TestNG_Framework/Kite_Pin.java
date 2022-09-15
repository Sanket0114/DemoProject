package TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Pin {
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[contains(text(),'Continue ')]")private WebElement submit;

	public Kite_Pin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setKitePin(String Pin) {
		pin.sendKeys("940395");
	}

	public void clickKiteSubmitBtn() {
		submit.click();
	}

}
