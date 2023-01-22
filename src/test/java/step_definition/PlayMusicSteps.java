package step_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.HomeYoutubeMusicPage;

@SuppressWarnings("deprecation")

public class PlayMusicSteps {
	private WebDriver webdriver;

	public PlayMusicSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User already login on youtube music")
	public void homePage() throws Throwable {
		HomeYoutubeMusicPage homePage = new HomeYoutubeMusicPage(webdriver);
		homePage.getCurrentURL();
		homePage.clickSignIn();
		homePage.clickHomeMenu();
		homePage.clickMusicIcon();
		Thread.sleep(5000);
	}
	
	@And("User click one of song in playlist")
	public void chooseSong() throws Throwable {
		HomeYoutubeMusicPage chooseaSong = new HomeYoutubeMusicPage(webdriver);
		chooseaSong.chooseaSong();

	}
	
	@Then("User can hear the song")
	public void hearASong() throws Throwable {
		HomeYoutubeMusicPage verifyaSong = new HomeYoutubeMusicPage(webdriver);
		Thread.sleep(3000);
		verifyaSong.verifyaSong();
	}
	
	
}
