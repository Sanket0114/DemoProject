package TestNG_Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	static WebDriver driver;

	public void openBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\chromedriver_win32 1\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(Utility.getPropertyFileData("url"));

	}

}
