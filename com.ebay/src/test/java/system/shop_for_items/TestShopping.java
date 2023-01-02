package system.shop_for_items;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.*;

public class TestShopping extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "MotorcyclesDP")
    public void testMotorcycles(String motorsIndex, String make, String model, String text) {

        HomePage homePage = new HomePage();
        MotorcyclesPage motorcyclesPage = homePage.selectMotorsCategory(homePage.motorsCategories, Integer.parseInt(motorsIndex));
        motorcyclesPage.clickOnMotorcyclesTab();
        motorcyclesPage.clickOnAllMakesDropdown();
        selectFromDropdownByValue(motorcyclesPage.allMakesDropdown, make);
        motorcyclesPage.clickOnAllModelsDropdown();
        selectFromDropdownByValue(motorcyclesPage.allModelsDropdown, model);
        SearchResultsPage searchResultsPage = motorcyclesPage.clickOnFindAVehicleButton();

        Assert.assertEquals(searchResultsPage.getResultsText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "iPhoneDP")
    public void testSmartphones(String electronicsIndex, String text) {

        HomePage homePage = new HomePage();
        CellPhonesAndSmartphonesPage cellPhonesAndSmartphonesPage = homePage.selectElectronicsCategory(homePage.electronicsCategories, Integer.parseInt(electronicsIndex));
        cellPhonesAndSmartphonesPage.clickOnAppleBrand();
        SearchResultsPage searchResultsPage = cellPhonesAndSmartphonesPage.clickOnIphoneModel();

        Assert.assertEquals(searchResultsPage.getItemNameText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "ComicsDP")
    public void testComics(String collectiblesIndex, String text) {

        HomePage homePage = new HomePage();
        ComicsPage comicsPage = homePage.selectCollectiblesAndArtCategory(homePage.collectiblesAndArtCategories, Integer.parseInt(collectiblesIndex));
        SearchResultsPage searchResultsPage = comicsPage.clickOnSilverAgeComics();

        Assert.assertEquals(searchResultsPage.getCategoryTitleText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "FurnitureDP")
    public void testFurniture(String homeIndex, String text) {

        HomePage homePage = new HomePage();
        FurniturePage furniturePage = homePage.selectHomeAndGardenCategory(homePage.homeAndGardensCategories, Integer.parseInt(homeIndex));
        furniturePage.clickOnSofasCategory();
        SearchResultsPage searchResultsPage = furniturePage.clickOnSofas();

        Assert.assertEquals(searchResultsPage.getCategoryTitleText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "MensShirtsDP")
    public void testShirts(String clothingIndex, String text) {

        HomePage homePage = new HomePage();
        MensShirtsPage mensShirtsPage = homePage.selectClothingAndAccessoriesCategory(homePage.clothingAndAccessoriesCategories, Integer.parseInt(clothingIndex));
        mensShirtsPage.clickOnTShirts();
        SearchResultsPage searchResultsPage = mensShirtsPage.clickOnNike();

        Assert.assertEquals(searchResultsPage.getCategoryTitleText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "ActionFiguresDP")
    public void testActionFigures(String toysIndex, String text) {

        HomePage homePage = new HomePage();
        ActionFiguresPage actionFiguresPage = homePage.selectToysCategory(homePage.toysCategories, Integer.parseInt(toysIndex));
        actionFiguresPage.clickOnMattel();
        actionFiguresPage.clickOnConditionDropdown();
        actionFiguresPage.clickOnNewCondition();
        actionFiguresPage.clickOnFranchiseDropdown();
        SearchResultsPage searchResultsPage = actionFiguresPage.clickOnDcUniverse();

        Assert.assertEquals(searchResultsPage.getCategoryTitleText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "BikesDP")
    public void testBikes(String sportingGoodsIndex, String text) {

        HomePage homePage = new HomePage();
        BikesPage bikesPage = homePage.selectSportingGoodsCategory(homePage.sportingGoodsCategories, Integer.parseInt(sportingGoodsIndex));
        SearchResultsPage searchResultsPage = bikesPage.clickOnCannondaleBikes();

        Assert.assertEquals(searchResultsPage.getCategoryTitleText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "ElectricalEquipmentDP")
    public void testElectricalEquipment(String businessIndex, String text) {

        HomePage homePage = new HomePage();
        ElectricalSuppliesAndEquipmentPage electricalSuppliesAndEquipmentPage = homePage.selectBusinessAndIndustrialCategory(homePage.businessAndIndustrialCategories, Integer.parseInt(businessIndex));
        electricalSuppliesAndEquipmentPage.clickOnOscilloscopes();
        electricalSuppliesAndEquipmentPage.clickOnOscilloscopeTypeDropdown();
        SearchResultsPage searchResultsPage = electricalSuppliesAndEquipmentPage.clickOnMixedSignalOption();

        Assert.assertEquals(searchResultsPage.getCategoryTitleText(), text);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "LuxuryWatchesDP")
    public void testLuxuryWatches(String watchesIndex, String text) {

        HomePage homePage = new HomePage();
        LuxuryWatchesPage luxuryWatchesPage = homePage.selectJewelryAndWatchesCategory(homePage.jewelryAndWatchesCategories, Integer.parseInt(watchesIndex));
        luxuryWatchesPage.clickOnRolexLink();
        SearchResultsPage searchResultsPage = luxuryWatchesPage.clickOnRolexModel();

        Assert.assertEquals(searchResultsPage.getCategoryTitleText(), text);

    }

}
