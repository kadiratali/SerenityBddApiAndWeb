package constants;

import org.openqa.selenium.By;

public class SearchProductContants {

    public SearchProductContants() {
    }

    public static final By SELECTOR_INPUT_SEARCH = By.id("search");
    public static final By SELECTOR_TITLE_RESULT_PRODUCT = By.className("product-item-link");
    public static final By SELECTOR_INFO_MESSAGE = By.xpath("//div[@class='message notice']/div");

}
