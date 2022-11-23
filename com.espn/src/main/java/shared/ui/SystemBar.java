package shared.ui;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page_library.SearchResultsPage;
import page_library.SportsPage;
import page_library.TeamPage;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//li[@class='sports menu-nhl']/a[@href]")
    public WebElement nhlButton;

    @FindBy (xpath = "//*[@id='global-nav']/ul/li[3]/div/ul[1]/li[2]/a")
    public WebElement nhlScoresButton;

    @FindBy (xpath = "//li[@class='sports menu-nba']/a[@href]")
    public WebElement nbaButton;

    @FindBy (xpath = "//*[@id='global-nav']/ul/li[4]/div/ul[2]/li/div/ul[1]/li[3]/a")
    public WebElement netsButton;

    @FindBy (xpath = "//li[@class='sports menu-mlb']/a[@href]")
    public WebElement mlbButton;

    @FindBy (xpath = "//*[@id='global-nav']/ul/li[6]/div/ul[2]/li/div/ul[4]/li[4]/a")
    public WebElement metsButton;

    @FindBy (xpath = "//*[@id='global-nav']/ul/li[6]/a")
    public WebElement soccerButton;

    @FindBy (xpath = "//li[@class='teams soccer']//li[2]/a[@href and @name='&lpos=subnav+subnav__team_fifa_world_cup']")
    public WebElement worldCupButton;

    @FindBy (xpath = "//*[@id='global-nav']/ul/li[7]/a")
    public WebElement moreButton;

    @FindBy (xpath = "//li[@class='sports menu-mma']/a[@href]")
    public WebElement mmaButton;

    @FindBy (xpath = "//li[@class='sports menu-f1']/a[@href]")
    public WebElement f1Button;

    @FindBy (xpath = "//li[@class='sports menu-wwe']/a[@href]")
    public WebElement wweButton;

    @FindBy (id = "global-search-trigger")
    public WebElement searchButton;

    @FindBy (id = "global-search-input")
    public WebElement searchField;

    @FindBy (className = "btn-search")
    public WebElement secondSearchButton;

    @FindBy (xpath = "//li[@class='user']/a[@href]")
    public WebElement accountIcon;

    @FindBy (xpath = "//div[@class='current-favorites']//a")
    public WebElement addFavoritesButton;

    @FindBy (id = "favorites-manager-iframe")
    public WebElement myFavoritesIFrame;

    @FindBy (xpath = "//ul[@class='FavMgmt__Section']//li[3]//button[@class='Button Button--sm Button--alt']")
    public WebElement followNbaButton;

    @FindBy (xpath = "//section[@class='FavMgmt__Col FavMgmt__Col--Right flex flex-column']//ul[3]//button[@class='Button Button--sm Button--alt']")
    public WebElement unfollowNbaButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public TeamPage clickOnTeam(WebElement element) {
        safeClickOnElement(element);

        return new TeamPage();
    }

    public SportsPage clickOnOtherLeagues(WebElement element) {
        hoverOverElement(moreButton);
        safeClickOnElement(element);

        return new SportsPage();
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public void inputSearchTerm(String searchTerm) {
        sendKeysToElement(searchField, searchTerm);
    }

    public void clickOnSecondSearchButton() {
        safeClickOnElement(secondSearchButton);
    }

    public String getNetsText() {
        return getTrimmedElementText(netsButton);
    }

    public String getMetsText() {
        return getTrimmedElementText(metsButton);
    }

    public TeamPage navigateToNetsPage() {
        hoverOverElement(nbaButton);
        clickOnTeam(netsButton);

        return new TeamPage();
    }

    public SportsPage clickOnF1() {
        clickOnOtherLeagues(f1Button);

        return new SportsPage();
    }

    public SportsPage clickOnWorldCupButton() {
        hoverOverElement(soccerButton);
        safeClickOnElement(worldCupButton);

        return new SportsPage();
    }

    public SportsPage clickOnWweButton() {
        clickOnOtherLeagues(wweButton);

        return new SportsPage();
    }

    public SportsPage clickOnMmaButton() {
        clickOnOtherLeagues(mmaButton);

        return new SportsPage();
    }

    public void clickOnAddFavoritesButton() {
        safeClickOnElement(addFavoritesButton);
    }

    public void clickOnNbaFollowButton() {
        safeClickOnElement(followNbaButton);
    }

    public SportsPage clickOnNhlScoresButton() {
        hoverOverElement(nhlButton);
        safeClickOnElement(nhlScoresButton);

        return new SportsPage();
    }

    public SearchResultsPage doSearch(String searchTerm) {
        clickOnSearchButton();
        inputSearchTerm(searchTerm);
        pressEnterKey();

        return new SearchResultsPage();
    }

    public void addFavorites() {
        hoverOverElement(accountIcon);
        clickOnAddFavoritesButton();
        switchToIFrame(myFavoritesIFrame);
        clickOnNbaFollowButton();
    }

    public String getUnfollowFavoritesText() {
        return getTrimmedElementText(unfollowNbaButton);
    }
}
