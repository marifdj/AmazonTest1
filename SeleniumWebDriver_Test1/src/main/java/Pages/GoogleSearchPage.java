package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage extends Base {

    By imputSearchLocator = By.name("q");
    By buttonSearchLocator = By.name("btnK");



    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement imputSearch() throws InterruptedException {
        Thread.sleep(5000);
        if (isDisplayed(imputSearchLocator)) {
            type("Amazon", imputSearchLocator );

        } else {
            System.out.println("Page was not found");
        }
        return null;
    }

public WebElement clickButton() throws InterruptedException {
        Thread.sleep(5000);
        if (isDisplayed(buttonSearchLocator)){
            click(buttonSearchLocator);
        } else {
            System.out.println("Page was not found");
        }
        return null;
}


}


