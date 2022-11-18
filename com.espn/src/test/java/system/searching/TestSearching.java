package system.searching;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.AthletesPage;
import page_library.HomePage;
import page_library.SearchResultsPage;

public class TestSearching extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testFightHistory")
    public void testMmaSearch(String searchTerm, String expected) {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.doSearch(searchTerm);
        AthletesPage athletePage = searchResultsPage.clickOnIslamMakhachev();
        athletePage.clickOnFightHistoryTab();

        Assert.assertEquals(athletePage.getFightHistoryHeadingText(), expected);

    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLeBronStats")
    public void testLebronSearch(String searchTerm, String expected) {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.doSearch(searchTerm);
        AthletesPage athletePage = searchResultsPage.clickOnLebronJames();

        Assert.assertEquals(athletePage.getLebronStatsText(), expected);
    }
}
