package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testSimpleSearch")
    public Object[][] getSimpleSearchTerm() {
        return excel.readStringArrays("SimpleSearch");
    }
}
