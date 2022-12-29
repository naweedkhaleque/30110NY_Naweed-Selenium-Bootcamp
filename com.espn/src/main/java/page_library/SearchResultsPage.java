package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy (xpath = "//ul[@class='player__Results']//a[@href]")
    public WebElement islamMakhachevLink;

    @FindBy (xpath = "//li[@class='player__Results__Item']//a[@href]")
    public WebElement lebronJamesLink;

    public SearchResultsPage() {
        PageFactory.initElements(driver,this);
    }

    public AthletesPage clickOnIslamMakhachev() {
        safeClickOnElement(islamMakhachevLink);

        return new AthletesPage();
    }

    public AthletesPage clickOnLebronJames() {
        safeClickOnElement(lebronJamesLink);

        return new AthletesPage();
    }

}
