package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchResults extends Base{

    By amazonResultsLocator = By.id("vn1s0p1c0");


    public GoogleSearchResults(WebDriver driver) {
        super(driver);
    }

public WebElement amazonResults() throws InterruptedException {
        Thread.sleep(5000);
    if (isDisplayed(amazonResultsLocator)){
        click(amazonResultsLocator);
    }  else {
        System.out.println("Page was not found");
    }      return null;
}
}
