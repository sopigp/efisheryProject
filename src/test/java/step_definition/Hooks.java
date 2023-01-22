package step_definition;

import java.net.MalformedURLException;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import java.util.concurrent.TimeUnit;

public class Hooks {
	public static WebDriver webdriver;

	@Before
	public void openBrowser() throws MalformedURLException {
		System.out.println("Called openBrowser");
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--disable-popup-blocking");
		chromeOptions.addArguments("--profile-directory=Default");
		chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--disable-plugins-discovery");

		chromeOptions.addArguments("user_agent=DN");
		chromeOptions.addArguments("user-data-dir=C:\\Users\\asus\\AppData\\Local\\Google\\Chrome\\User Data");
		chromeOptions.addArguments("--profile-directory=Default");

		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\driver\\chromedriver.exe");
		webdriver = new ChromeDriver(chromeOptions);

		webdriver.manage().deleteAllCookies();
		webdriver.manage().window().maximize();
		webdriver.get("https://music.youtube.com/");
		webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@After
	public void closeBrowser(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException noSupportScreenshot) {
				System.err.println(noSupportScreenshot.getMessage());
			}
		}
//		webdriver.quit();
	}
}
