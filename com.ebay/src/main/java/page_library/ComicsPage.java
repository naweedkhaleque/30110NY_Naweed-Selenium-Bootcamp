package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class ComicsPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[4]")
    public WebElement silverAgeComicsEra;

    public ComicsPage() {
        PageFactory.initElements(driver, this);
    }

    public SearchResultsPage clickOnSilverAgeComics() {
        safeClickOnElement(silverAgeComicsEra);

        return new SearchResultsPage();
    }
}
