package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class AthletesPage extends SharedStepsUI {

    @FindBy(xpath = "//ul [@class='ui-tabs']//li[3]/a[@href]")
    public WebElement raceResultsTab;

    @FindBy (xpath = "//div[@id='my-players-table']//h2")
    public WebElement lewisHamiltonRaceResultsTitle;

    @FindBy (xpath = "//h1[@class='PlayerHeader__Name flex flex-column ttu fw-bold pr4 h2']/span[1]")
    public WebElement kobeBryantName;

    @FindBy (xpath = "//ul[@class='Nav__Secondary__Menu center flex items-center relative']//li[5]/a[@href]")
    public WebElement fightHistoryTab;

    @FindBy (xpath = "//div[@class='Wrapper Card__Content']/h2")
    public WebElement fightHistoryHeading;

    @FindBy (xpath = "//aside[@class='StatBlock br-5 ba overflow-hidden flex-expand StatBlock--multiple bg-clr-white brdr-clr-gray-06 PlayerHeader__StatBlock']/h2")
    public WebElement lebronStatsHeading;

    public AthletesPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnRaceResultsTab() {
        safeClickOnElement(raceResultsTab);
    }
    public String getResultsTitleText() {
        return getTrimmedElementText(lewisHamiltonRaceResultsTitle);
    }
    public String getKobeText() {
        return getTrimmedElementText(kobeBryantName);
    }
    public void clickOnFightHistoryTab() {
        safeClickOnElement(fightHistoryTab);
    }

    public String getFightHistoryHeadingText() {
        return getTrimmedElementText(fightHistoryHeading);
    }

    public String getLebronStatsText() {
        return getTrimmedElementText(lebronStatsHeading);
    }

}
