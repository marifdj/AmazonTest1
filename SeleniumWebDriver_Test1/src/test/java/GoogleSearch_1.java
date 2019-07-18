import Pages.AmazonPage;
import Pages.AmazonPageResults;
import Pages.GoogleSearchPage;
import Pages.GoogleSearchResults;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class GoogleSearch_1 {

    private WebDriver driver;
    GoogleSearchPage googleSearchPage;
    GoogleSearchResults googleSearchResults;
    AmazonPage amazonPage;
    AmazonPageResults amazonPageResults;


    @Before
    public void setUp() throws Exception {
        googleSearchPage= new GoogleSearchPage(driver);
        driver = googleSearchPage.ChromeDriverConection();
        googleSearchPage.visit("http://www.google.com");
        driver.manage().window().maximize();
        googleSearchResults = new GoogleSearchResults(driver);
        amazonPage = new AmazonPage(driver);
        amazonPageResults = new AmazonPageResults(driver);
    }

    @Test
    public void Test () throws InterruptedException {


        //tipea la palabra amazon
        googleSearchPage.imputSearch();



        //le hace click al boton search
        googleSearchPage.clickButton();


        //pagina de amazon se abre
        googleSearchResults.amazonResults();



        //cierra el banner de locacion
        amazonPage.CustomerAdress();
        Assert.assertEquals( "Todos", amazonPage.getCategories() );


        //click en all
        amazonPage.ClickOnAll();




        //click en books
        amazonPage.dropDowmList_Books();


        //imput search de la pagina amazon tipea libro
        amazonPage.ImputSearchLocator();

        Assert.assertEquals("Libros", amazonPage.booksCategories());


        //click al boton de busqueda de la pagina amazon
        amazonPage.SearchButtonLocator();




        //click al libro seleccionado
        amazonPageResults.BookTittle();




        //agrega al carrito el libro seleccionado
        amazonPageResults.AddToCart();






    }

    @After
    public void tearDown() throws Exception {
       //driver.quit();
        
    }
}
