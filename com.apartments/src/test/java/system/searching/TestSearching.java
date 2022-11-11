package system.searching;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SearchResultsPage;

public class TestSearching extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testSimpleSearch")
    public void testSearchFunctionality(String expectedSearchTerm, String expectedText) {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.doSearch(expectedSearchTerm);

        Assert.assertEquals(searchResultsPage.getPriceDropdownText(), expectedText);
    }
}
