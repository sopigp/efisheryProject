package step_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.ExploreMusicPage;
import page_object.HomeYoutubeMusicPage;

@SuppressWarnings("deprecation")

public class ExploreMusicSteps {
	private WebDriver webdriver;

	public ExploreMusicSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User on homepage with already login")
	public void homePage() throws Throwable {
		HomeYoutubeMusicPage homePage = new HomeYoutubeMusicPage(webdriver);
		homePage.getCurrentURL();
		homePage.clickSignIn();
		homePage.clickHomeMenu();
		homePage.clickMusicIcon();
		Thread.sleep(5000);

	}
	
	@And("User click explore menu")
	public void exploreMenu() throws Throwable {
		ExploreMusicPage clickExploreMenu = new ExploreMusicPage(webdriver);
		clickExploreMenu.clickExploreMenu();

	}
	
	@Then("User should be navigated to explore menu")
	public void navigateToExploreMenu() throws Throwable {
		ExploreMusicPage indexMenu = new ExploreMusicPage(webdriver);
		indexMenu.verifyExploreIndexMenu();

	}
	
	@When("User explore the music based on categories")
	public void chooseSongfromNewAlbumandSingleSection() throws Throwable {
		ExploreMusicPage exploreIndexMenu = new ExploreMusicPage(webdriver);
		exploreIndexMenu.verifyExploreIndexMenu();

	}
	
	@When("User can see new album and single section, mood and genres section, trending section, new music video section")
	public void exploreMusicBasedonCategories() throws Throwable {
		ExploreMusicPage exploreMusicBasedonCategories = new ExploreMusicPage(webdriver);
		exploreMusicBasedonCategories.verifyNewAlbumAndsingleSection();
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		
		exploreMusicBasedonCategories.verifyMoodAndGenresSection();
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		
		exploreMusicBasedonCategories.verifyTrendingSection();
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		
		exploreMusicBasedonCategories.verifyNewVideosSection();
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);

	}
	
}
