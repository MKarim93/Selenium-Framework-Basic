package demoqa.pages;

import base.BasePage;
import org.openqa.selenium.By;

public class ElementsPage extends BasePage {

    private String elementsPageURL = "https://demoqa.com/elements";

    public boolean isElementsPageURLDisplayed(){
        String currentURL = driver.getCurrentUrl();
        return currentURL.equals(elementsPageURL);
    }
}
