package step_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.HomeYoutubeMusicPage;
import page_object.SearchResultPage;

@SuppressWarnings("deprecation")

public class SearchMusicSteps {
	private WebDriver webdriver;

	public SearchMusicSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User already login with correct account")
	public void homePage() throws Throwable {
		HomeYoutubeMusicPage homePage = new HomeYoutubeMusicPage(webdriver);
		homePage.getCurrentURL();
		homePage.clickSignIn();
		homePage.clickHomeMenu();
		homePage.clickMusicIcon();
		Thread.sleep(5000);

	}
	
	@And("User search menu")
	public void searchMenu() throws Throwable {
		SearchResultPage searching = new SearchResultPage(webdriver);
		searching.clickSearchMenu();
		searching.clickFieldSearch();

	}
	
	@And("User input the title song")
	public void inputSearchKeyword() throws Throwable {
		SearchResultPage inputKeyword = new SearchResultPage(webdriver);
//		inputKeyword.searchKeyword(keyword);
		WebElement search = webdriver.findElement(By.xpath("//input[@id='input']"));
		Thread.sleep(5000);
		search.sendKeys("new light");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

	}
	
	@When("User click the song")
	public void chooseResultSong() throws Throwable {
		SearchResultPage verifyResultSong = new SearchResultPage(webdriver);
		verifyResultSong.verfyResultSong();

	}
	
	@Then("User can hear that song")
	public void searchResult() throws Throwable {
		SearchResultPage playResultSong = new SearchResultPage(webdriver);
		playResultSong.clickResultSong();
	}
	
	
}
