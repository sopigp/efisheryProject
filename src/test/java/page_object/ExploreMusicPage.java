package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

import utilities.BaseClass;

public class ExploreMusicPage extends BaseClass {
	
	@FindBy(xpath = "//yt-formatted-string[.='Explore']")
	private WebElement btnExploreMenu;
	
	@FindBy(xpath = "//button[contains(.,'New releases')]")
	private WebElement newReleasesMenu;
	
	@FindBy(xpath = "//button[contains(.,'Charts')]")
	private WebElement chartsMenu;
	
	@FindBy(xpath = "//button[contains(.,'Moods & genres')]")
	private WebElement moodAndGenresMenu;
	
	@FindBy(xpath = "//ytmusic-carousel-shelf-renderer[1]/div[@class='ytmusic-shelf style-scope ytmusic-carousel-shelf-renderer']")
	private WebElement newAlbumAndSingleSection;
	
	@FindBy(xpath = "//ytmusic-carousel-shelf-renderer[2]/div[@class='ytmusic-shelf style-scope ytmusic-carousel-shelf-renderer']")
	private WebElement moodAndGenresSection;
	
	@FindBy(xpath = "//ytmusic-carousel-shelf-renderer[3]/div[@class='ytmusic-shelf style-scope ytmusic-carousel-shelf-renderer']")
	private WebElement trendingSection;
	
	@FindBy(xpath = "//ytmusic-carousel-shelf-renderer[4]/div[@class='ytmusic-shelf style-scope ytmusic-carousel-shelf-renderer']")
	private WebElement newMusicVideosSection;

	public ExploreMusicPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	public void getCurrentURL() {
		String strUrl = webdriver.getCurrentUrl();
	    System.out.println("Current Url is:"+ strUrl);
	}
	
	public void clickExploreMenu() {
		btnExploreMenu.click();
	}
	
	
	public boolean verifyExploreIndexMenu() {
		newReleasesMenu.isDisplayed();
		chartsMenu.isDisplayed();
		moodAndGenresMenu.isDisplayed();
		return true;
	}
	
	public boolean verifyNewAlbumAndsingleSection() {
		newAlbumAndSingleSection.isDisplayed();
		return true;
	}
	
	public boolean verifyMoodAndGenresSection() {
		moodAndGenresSection.isDisplayed();
		return true;
	}
	
	public boolean verifyTrendingSection() {
		trendingSection.isDisplayed();
		return true;
	}
	
	public boolean verifyNewVideosSection() {
		newMusicVideosSection.isDisplayed();
		return true;
	}
}
