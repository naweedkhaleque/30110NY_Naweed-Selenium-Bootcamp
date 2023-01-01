package system.search;

import base.BasePage;
import page_library.HomePage;
import page_library.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearching extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "SearchDP")
    public void testSearch(String searchTerm, String categoryValue, String expectedText) {

        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.systemBar.doSearch(searchTerm, homePage.systemBar.categoryDropdown, categoryValue);

        Assert.assertEquals(searchResultsPage.getResultsText(), expectedText);
    }
}
