package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {

    protected WebDriver driver;

    public Base (WebDriver driver){

        this.driver=driver;
    }

    public Base() {
    }

    public WebDriver ChromeDriverConection() {
//SET UP DEL DRIVER QUE VAMOS A UTILIZAR
    System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    return driver;
  }
  //METODO DE FIND ELEMENT

    public WebElement findElement (By by){
        return  driver.findElement(by);
    }
    public List <WebElement> findElements (By locator){
        return driver.findElements(locator);
}

    public String findElementAndGetText(By by) {
        return driver.findElement(by).getText();

    }

    public void type(String imputText, By locator){
        driver.findElement(locator).sendKeys(imputText);
    }


    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void click (WebElement element){
        element.click();
    }


    public boolean isDisplayed (By locator){
        try{
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    public void visit (String url){
        driver.get(url);
    }
}


