package demoqa.pages;

import base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By elementsCard = By.xpath("//h5[text() = 'Elements']");
    private By formsCard = By.xpath("//h5[text() = 'Forms']");
    private By alertsFrameWindowsCard = By.xpath("//h5[text() = 'Alerts, Frame & Windows']");
    private By widgetsCard = By.xpath("//h5[text() = 'Widgets']");
    private By interactionsCard = By.xpath("//h5[text() = 'Interactions']");
    private By bookStoreApplicationCard = By.xpath("//h5[text() = 'Book Store Application']");

    public ElementsPage goToElementsPage(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public FormsPage goToFormsPage(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public AlertsFrameWindowsPage goToAlertsFrameWindowsPage(){
        scrollToElementJS(alertsFrameWindowsCard);
        click(alertsFrameWindowsCard);
        return new AlertsFrameWindowsPage();
    }

    public WidgetsPage gotToWidgetsPage(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public InteractionsPage goToInteractionsPage(){
        scrollToElementJS(interactionsCard);
        click(interactionsCard);
        return new InteractionsPage();
    }

    public BookStoreApplicationPage goToBookStoreApplicationPage(){
        scrollToElementJS(bookStoreApplicationCard);
        click(bookStoreApplicationCard);
        return new BookStoreApplicationPage();
    }

}
