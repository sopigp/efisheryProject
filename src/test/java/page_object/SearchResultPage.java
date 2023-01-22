package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

import utilities.BaseClass;

public class SearchResultPage extends BaseClass {
	
	@FindBy(id = "placeholder")
	private WebElement searchMenu;
	
	@FindBy(xpath = "//input[@id='input']")
	private WebElement fieldInput;
	
	@FindBy(xpath = "//input[@id='input']")
	private WebElement setSearching;
	
	@FindBy(xpath = "//ytmusic-shelf-renderer[1]//a[@href='browse/MPREb_lXcSNHxruBs']")
	private WebElement resultSong;
	
	@FindBy(xpath = "//ytmusic-shelf-renderer[1]//yt-icon[@class='icon style-scope ytmusic-play-button-renderer']")
	private WebElement chooseResultSong;

	public SearchResultPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	public void getCurrentURL() {
		String strUrl = webdriver.getCurrentUrl();
	    System.out.println("Current Url is:"+ strUrl);
	}
	
	public void clickSearchMenu() {
		searchMenu.click();
	}
	
	public void clickFieldSearch() {
		fieldInput.click();
	}
	
	public void searchKeyword(String keyword) {
		setSearching.sendKeys(keyword);
	}
	
	public boolean verfyResultSong() {
		resultSong.isDisplayed();
		return true;
	}
	
	public void clickResultSong() {
		chooseResultSong.click();
	}
	
}
