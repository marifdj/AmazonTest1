package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonPage extends Base {


    By adressButton = By.cssSelector("#nav-main > div.nav-left > div.a-section.glow-toaster.glow-toaster-theme-default.glow-toaster-slot-default.nav-coreFlyout.nav-flyout > div > div.glow-toaster-footer > span.a-button.a-spacing-top-base.a-button-base.glow-toaster-button.glow-toaster-button-dismiss > span");
    By imputSearch = By.cssSelector("#twotabsearchtextbox");
    By searchButton = By.cssSelector("#nav-search > form > div.nav-right > div > input");
    By dropDowmListCategories = By.cssSelector("#nav-search-dropdown-card > div");
    By allButtonInCategories_DropdowmList = By.cssSelector("#nav-search-dropdown-card > div > div > span");



    public AmazonPage(WebDriver driver) {
        super(driver);
    }

    public WebElement CustomerAdress() throws InterruptedException {
        Thread.sleep(5000);
        if (isDisplayed(adressButton)) {
            click(adressButton);
        } else {
            System.out.println("Adress button was not found");
        }
        return null;
    }

    public  WebElement ClickOnAll () throws InterruptedException {
        Thread.sleep(5000);
        if (isDisplayed(dropDowmListCategories)){
            click(dropDowmListCategories);
        } else {
            System.out.println("All button was not found");
        }
        return null;
    }


    public String dropDowmList_Books() {

        WebElement dropDowmList = findElement(dropDowmListCategories);
        List<WebElement> options = dropDowmList.findElements(By.tagName("option"));

        for (int i = 0; i < options.size(); i++){
            String elementText = options.get(i).getText();
            if ( "Libros".equals( elementText)) {
                click((options.get(i)));
            }
        }


        String selectedOption = ""; //cadena vacia

        for (int i = 0 ; i < options.size(); i++){

            if (options.get(i).isSelected())
                selectedOption = options.get(i).getText();
        }
            return selectedOption;
    }



    public WebElement ImputSearchLocator ()throws InterruptedException{
            Thread.sleep(5000);
            if (isDisplayed(imputSearch)) {
                //ingresa texto
                type("Las venas abiertas de America Latina", imputSearch);

            } else {
                System.out.println("Imput was not found");
            }
            return null;
        }


        public WebElement SearchButtonLocator () throws InterruptedException {
            Thread.sleep(5000);
            if (isDisplayed(searchButton)) {
                click(searchButton);
            } else {
                System.out.println("Search Button was not found");
            }
            return null;


        }
        //metodos para todos los AssertEquals de Amazon Page

        public String getCategories(){
            return driver.findElement(allButtonInCategories_DropdowmList).getText();
        }

        public String booksCategories(){
        return driver.findElement(dropDowmListCategories).getText();
        }




    }



