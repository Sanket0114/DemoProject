package TestNG_Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_Test extends Base {

	Kite_Login log1;
	Kite_Pin pin;
	Kite_Home home;
	Kite_Logout log2;

	@BeforeClass
	public void browserOpen() throws IOException {
		openBrowser();
		log1 = new Kite_Login(driver);
		pin = new Kite_Pin(driver);
		home = new Kite_Home(driver);
		log2 = new Kite_Logout(driver);

	}

	@BeforeMethod
	public void Login() throws EncryptedDocumentException, IOException, InterruptedException {
		log1.setKiteUserName(Utility.getTestData(0, 0));
		Thread.sleep(1000);

		log1.setKitePWD(Utility.getTestData(0, 1));
		Thread.sleep(1000);

		log1.clickKiteLoginBtn();
		
		pin.setKitePin(Utility.getTestData(0, 2));
		Thread.sleep(1000);

		pin.clickKiteSubmitBtn();
		Thread.sleep(5000);

	}

	@Test
	public void TC1() throws EncryptedDocumentException, IOException {
		String expResult = Utility.getTestData(0, 3);
		String actResult = home.verifyKiteUserID();
		Assert.assertEquals(actResult, expResult, "Act and Exp Is Different");
	}

	@AfterMethod
	public void Logout() throws InterruptedException {
		home.clickKiteUserID();
		Thread.sleep(1000);
		
		log2.clickKiteLogOutBtn();

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();

	}

}
