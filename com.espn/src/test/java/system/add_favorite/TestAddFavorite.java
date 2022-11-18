package system.add_favorite;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;

public class TestAddFavorite extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testAddFavorites")
    public void testAddFavorites(String expected) {
        HomePage homePage = new HomePage();
        homePage.systemBar.addFavorites();

        Assert.assertEquals(homePage.systemBar.getUnfollowFavoritesText(), expected);

    }
}
