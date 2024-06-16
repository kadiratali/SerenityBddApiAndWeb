package pageobjects;

import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BaseTest;
import utilities.WebElementUtils;

import static constants.SearchProductContants.SELECTOR_INFO_MESSAGE;
import static constants.SearchProductContants.SELECTOR_TITLE_RESULT_PRODUCT;

public class SearchResultPage extends WebElementUtils {

    public String getTitleFromResultProduct() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(SELECTOR_TITLE_RESULT_PRODUCT));

        return find(SELECTOR_TITLE_RESULT_PRODUCT).getText();
    }

    public String getInfoMessage(){
        waitFor(ExpectedConditions.visibilityOfElementLocated(SELECTOR_INFO_MESSAGE));

        return find(SELECTOR_INFO_MESSAGE).getText().trim();
    }
}
