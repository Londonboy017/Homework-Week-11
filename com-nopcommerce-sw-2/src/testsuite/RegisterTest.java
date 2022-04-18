package testsuite;

import browserfactory.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //find Register and click
        WebElement register = driver.findElement(By.className("ico-register"));
        register.click();
        //find 'Register' text and store in string variable
        WebElement registerTextElement = driver.findElement(By.tagName("h1"));
        String actualText = registerTextElement.getText();

        String expectedText = "Register";
        //validate actual and expected text
        Assert.assertEquals("Not found 'Computers' text", expectedText, actualText);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //find Register and click
        WebElement register = driver.findElement(By.className("ico-register"));
        register.click();
        //find radio element and click
        WebElement radio = driver.findElement(By.id("gender-male"));
        radio.click();
        //find first name and send value
        WebElement firstName = driver.findElement(By.name("FirstName"));
        firstName.sendKeys("Stuart");
        //find last name and send value
        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName.sendKeys("Little");
        //use SELECT class for dropdown of DOB
        Select DOB = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        DOB.selectByVisibleText("11");

        Select month = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
        month.selectByIndex(9);

        Select year = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        year.selectByVisibleText("1998");
        //find emailfield and send values
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("stuart123@gmail.com");
        //find companyfield and send values
        WebElement companyField = driver.findElement(By.name("Company"));
        companyField.sendKeys("apple-fb");
        //find newsletter checkbox and click
        WebElement newsletterField = driver.findElement(By.cssSelector("#Newsletter"));
        newsletterField.click();
        //find password field and send values
        WebElement passwordField = driver.findElement(By.cssSelector("#Password"));
        passwordField.sendKeys("Find123");
        //find confirm password field and send values
        WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword"));
        confirmPassword.sendKeys("Find123");
        //find Register button and click
        WebElement registerButton = driver.findElement(By.name("register-button"));
        registerButton.click();

        WebElement registerConfirmElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualText = registerConfirmElement.getText();

        String expectedText = "Your registration completed";
        //validate actual and expected text
        Assert.assertEquals("Not found 'Your registration completed' text", expectedText, actualText);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
