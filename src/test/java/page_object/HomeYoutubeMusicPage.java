package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

import utilities.BaseClass;

public class HomeYoutubeMusicPage extends BaseClass {
	
//	Header Object 
	
	@FindBy(xpath = "//img[@src='//music.youtube.com/img/on_platform_logo_dark.svg']")
	private WebElement musicIcon;
	
	@FindBy(css = ".sign-in-link")
	private WebElement btnSignIn;
	
	@FindBy(xpath = "//yt-formatted-string[.='Home']")
	private WebElement btnHomeMenu;
	
	@FindBy(xpath = "//ytmusic-responsive-list-item-renderer[2]//yt-icon[@class='icon style-scope ytmusic-play-button-renderer']")
	private WebElement aSong;
	
	@FindBy(xpath = "//body/ytmusic-app[1]/ytmusic-app-layout[1]/ytmusic-player-page[1]/div[1]/div[3]/ytmusic-tab-renderer[1]/div[1]/ytmusic-player-queue[1]/div[1]/ytmusic-player-queue-item[1]")
	private WebElement selectedSong;
	
	@FindBy(xpath = "//body/ytmusic-app[1]/ytmusic-app-layout[1]/ytmusic-player-page[1]/div[1]/div[3]/ytmusic-tab-renderer[1]/div[1]/ytmusic-player-queue[1]/div[1]/ytmusic-player-queue-item[1]/div[2]/yt-formatted-string[1]")
	private WebElement songTitle;

	@FindBy(xpath = "//body/ytmusic-app[1]/ytmusic-app-layout[1]/ytmusic-player-page[1]/div[1]/div[3]/ytmusic-tab-renderer[1]/div[1]/ytmusic-player-queue[1]/div[1]/ytmusic-player-queue-item[1]/div[2]/div[1]/yt-formatted-string[1]")
	private WebElement songBand;
	
	public void clickMusicIcon() {
		musicIcon.click();
	}
	
	public void clickSignIn() {
		btnSignIn.click();
	}
	
	public HomeYoutubeMusicPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	public void getCurrentURL() {
		String strUrl = webdriver.getCurrentUrl();
	    System.out.println("Current Url is:"+ strUrl);
	}
	
	public void clickHomeMenu() {
		btnHomeMenu.click();
	}
	
	public void chooseaSong() {
		aSong.click();
	}
	
	public boolean verifyaSong() {
		selectedSong.isDisplayed();
		songTitle.isDisplayed();
		songBand.isDisplayed();
		return true;
	}
	
	
	
	
}
