package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "SearchDP")
    public Object[][] getSearchTerm() {
        return excel.readStringArrays("Searching");
    }

    @DataProvider(name = "MotorcyclesDP")
    public Object[][] getMotorcycleSpecs() {
        return excel.readStringArrays("ShopMotorcycles");
    }

    @DataProvider(name = "iPhoneDP")
    public Object[][] getSmartphone() {
        return excel.readStringArrays("ShopSmartphones");
    }

    @DataProvider(name = "ComicsDP")
    public Object[][] getComicsEra() {
        return excel.readStringArrays("ShopComics");
    }

    @DataProvider(name = "FurnitureDP")
    public Object[][] getFurnitureType() {
        return excel.readStringArrays("ShopFurniture");
    }

    @DataProvider(name = "MensShirtsDP")
    public Object[][] getShirtType() {
        return excel.readStringArrays("ShopMensShirts");
    }


    @DataProvider(name = "ActionFiguresDP")
    public Object[][] getActionFigureDetails() {
        return excel.readStringArrays("ShopActionFigures");
    }

    @DataProvider(name = "BikesDP")
    public Object[][] getCannondaleBikes() {
        return excel.readStringArrays("ShopBikes");
    }

    @DataProvider(name = "ElectricalEquipmentDP")
    public Object[][] getOscilloscopeType() {
        return excel.readStringArrays("ShopOscilloscopes");
    }

    @DataProvider(name = "LuxuryWatchesDP")
    public Object[][] getWatchModel() {
        return excel.readStringArrays("ShopLuxuryWatches");
    }

}
