package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class TeamPage extends SharedStepsUI {

    @FindBy (xpath = "//ul[@class='Nav__Secondary__Menu center flex items-center relative']//li[4]/a")
    public WebElement lakersScheduleButton;

    @FindBy (xpath = "//div[@class='flex justify-between mt3 mb3 items-center']/h1")
    public WebElement lakersScheduleTitle;

    @FindBy (xpath = "//ul[@class='Nav__Secondary__Menu center flex items-center relative']//li[3]/a")
    public WebElement lakersStatsButton;

    @FindBy(xpath = "//div[@class='stats-header']//select[@class='dropdown__select']")
    public WebElement seasonDropdown;

    @FindBy (xpath = "//*[@id='fittPageContainer']/div[2]/div[5]/div/div/section/div/div[2]/div[1]/div/select[1]")
    public WebElement specificSeason;

    @FindBy (xpath = "//tbody[@class='Table__TBODY']//a[@href='https://www.espn.com/nba/player/_/id/110/kobe-bryant']")
    public WebElement kobeBryantLink;

    public TeamPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLakersScheduleButton() {
        safeClickOnElement(lakersScheduleButton);
    }
    public String getLakersScheduleTitleText() {
        return getTrimmedElementText(lakersScheduleTitle);
    }

    public void clickOnLakersStatsButton() {
        safeClickOnElement(lakersStatsButton);
    }
    public void clickOnSeasonDropdown() {
        safeClickOnElement(seasonDropdown);
    }

    public void selectSeason(String seasonValue) {
        selectFromDropdownByValue(specificSeason, seasonValue);
    }

    public AthletesPage clickOnKobeBryantLink() {
        safeClickOnElement(kobeBryantLink);

        return new AthletesPage();
    }
}
