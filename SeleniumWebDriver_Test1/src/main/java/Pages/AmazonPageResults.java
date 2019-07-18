package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPageResults extends Base {

By tittleLocator = By.cssSelector("#search > div.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(4) > div.s-result-list.s-search-results.sg-row > div:nth-child(1) > div > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-8-of-16.sg-col-16-of-24.sg-col-12-of-20.sg-col-24-of-32.sg-col.sg-col-28-of-36.sg-col-20-of-28 > div > div:nth-child(1) > div > div > div:nth-child(1) > h2 > a > span");
By addToCart = By.cssSelector("#add-to-cart-button");

    public AmazonPageResults(WebDriver driver) {
        super(driver);
    }
    public WebElement BookTittle () throws InterruptedException {
        Thread.sleep(5000);
        if (isDisplayed(tittleLocator)) {
            click(tittleLocator);
        } else {
            System.out.println("Tittle was not found");
        }
        return null;
    }

    public WebElement AddToCart () throws InterruptedException {
        Thread.sleep(5000);
        if (isDisplayed(addToCart)){
            click(addToCart);
        } else {
            System.out.println("Cart was not found");
        }
        return null;

    }
}
