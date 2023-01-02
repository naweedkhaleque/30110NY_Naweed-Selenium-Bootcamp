package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class LuxuryWatchesPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[1]")
    public WebElement rolexLink;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[2]/a")
    public WebElement rolexModel;

    public LuxuryWatchesPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnRolexLink() {
        safeClickOnElement(rolexLink);
    }

    public SearchResultsPage clickOnRolexModel() {
        safeClickOnElement(rolexModel);

        return new SearchResultsPage();
    }

}
