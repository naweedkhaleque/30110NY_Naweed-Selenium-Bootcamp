package system.favorites;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SearchResultsPage;

public class TestFavorites extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testAddFavorites")
    public void testAddFavorites(String searchTerm, String expectedCount) {
        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        searchResultsPage.doNarrowSearch();

        searchResultsPage.checkAddTwoFavorites();

        Assert.assertEquals(searchResultsPage.getCountOfFavoritesText(), expectedCount);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testRemoveFavorites")
    public void testRemoveFavorites(String searchTerm, String expectedText) {
        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        searchResultsPage.doNarrowSearch();

        searchResultsPage.removeFavorites();

        Assert.assertEquals(searchResultsPage.getNoFavoritesYetModalText(), expectedText);
    }
}
