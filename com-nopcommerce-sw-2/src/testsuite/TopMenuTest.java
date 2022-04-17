package testsuite;

import browserfactory.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //find computer tab and click
        WebElement computer = driver.findElement(By.linkText("Computers"));
        computer.click();
        //find 'Computers' text and store in string variable
        WebElement computersTextElement = driver.findElement(By.tagName("h1"));
        String actualText =computersTextElement.getText();

        String expectedText="Computers";
        //validate actual and expected text
        Assert.assertEquals("Not found 'Computers' text",expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //find electronics tab and click
        WebElement elctronics = driver.findElement(By.linkText("Electronics"));
        elctronics.click();
        //find 'Electronics' text and store in string variable
        WebElement electronicsTextElement = driver.findElement(By.tagName("h1"));
        String actualText =electronicsTextElement.getText();

        String expectedText="Electronics";
        //validate actual and expected text
        Assert.assertEquals("Not found 'Electronics' text",expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //find Apparel tab and click
        WebElement apparel = driver.findElement(By.linkText("Apparel"));
        apparel.click();
        //find 'Apparel' text and store in string variable
        WebElement apparelTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualText =apparelTextElement.getText();

        String expectedText="Apparel";
        //validate actual and expected text
        Assert.assertEquals("Not found 'Apparel' text",expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
//find Digital downloads tab and click
        WebElement digitalDownloads = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloads.click();
        //find 'Digital downloads' text and store in string variable
        WebElement digitalDownloadsTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualText=digitalDownloadsTextElement.getText();

        String expectedText="Digital downloads";
        //validate actual and expected text
        Assert.assertEquals("Not found 'Digital downloads' text",expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
//find Books tab and click
        WebElement books = driver.findElement(By.linkText("Books"));
        books.click();
        //find 'Books' text and store in string variable
        WebElement booksTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualText=booksTextElement.getText();

        String expectedText="Books";
        //validate actual and expected text
        Assert.assertEquals("Not found 'Digital downloads' text",expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
//find Jewelry tab and click
        WebElement jewelry = driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]"));
        jewelry.click();
        //find 'Jewelry' text and store in string variable
        WebElement jewelryTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualText=jewelryTextElement.getText();
        String expectedText="Jewelry";
        //validate actual and expected text
        Assert.assertEquals("Not found 'Digital downloads' text",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
//find Gift Cards tab and click
        WebElement giftCards = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
        giftCards.click();
        //find 'Gift Cards' text and store in string variable
        WebElement giftCardsTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualText=giftCardsTextElement.getText();
        String expectedText="Gift Cards";
        //validate actual and expected text
        Assert.assertEquals("Not found 'Digital downloads' text",expectedText,actualText);
    }
@After
    public void tearDown(){
       closeBrowser();
}
}
