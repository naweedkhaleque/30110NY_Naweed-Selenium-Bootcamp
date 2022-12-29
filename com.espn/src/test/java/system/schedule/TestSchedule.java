package system.schedule;

import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SportsPage;
import page_library.TeamPage;

public class TestSchedule extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLakersSchedule")
    public void testViewLakersSchedule(String expected) {
        HomePage homePage = new HomePage();
        TeamPage teamPage = homePage.systemBar.navigateToLakersPage();
        teamPage.clickOnLakersScheduleButton();

        Assert.assertEquals(teamPage.getLakersScheduleTitleText(), expected);

    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testWorldCupSchedule")
    public void testViewWorldCupFixture(String expected) {
        HomePage homePage = new HomePage();
        SportsPage sportsLeaguePage = homePage.systemBar.clickOnWorldCupButton();
        sportsLeaguePage.clickOnFixturesButton();
        sportsLeaguePage.clickOnWorldCupDate();

        webDriverWait.until(ExpectedConditions.visibilityOf(sportsLeaguePage.dateHeading));
        Assert.assertEquals(sportsLeaguePage.getWorldCupDateHeadingText(), expected);
    }
}
