package system.team_names;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;

public class TestTeamName extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNetsName")
    public void testNetsText(String expected) {
        HomePage homePage = new HomePage();

        hoverOverElement(homePage.systemBar.nbaButton);

        Assert.assertEquals(homePage.systemBar.getNetsText(), expected);

    }

    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "testMetsName")
    public void testMetsText(String expected) {
        HomePage homePage = new HomePage();

        hoverOverElement(homePage.systemBar.mlbButton);

        Assert.assertEquals(homePage.systemBar.getMetsText(), expected);

    }
}
