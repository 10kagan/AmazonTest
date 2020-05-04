import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonTest {

    private static WebDriver driver;


    @BeforeMethod
    public  void setup(){
        //prepare to environment in order to test
        WebDriverManager.chromedriver().setup(); //setup webdriver
        driver = new ChromeDriver(); // create object of chrome driver
        driver.manage().window().maximize(); // open browser maximized
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        driver.get("https://www.amazon.com/"); // open url
    }
    @Test
    public void AmazonItemAddToCartAndDeleteItem() {

        //Search for the book Ender's Game by Orson Scott Card
        WebElement searchBar = driver.findElement(By.xpath("//*[@type='text' and @name='field-keywords']"));
        searchBar.sendKeys("Ender's Game by Orson Scott Card");

        //Click on the book from the search
        driver.findElement(By.xpath("//*[@class='nav-input' and @type='submit']")).sendKeys(Keys.RETURN);

        List<WebElement> bookNamesLocator = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
        for (int i = 0; i < bookNamesLocator.size(); i++) {
            if(bookNamesLocator.get(i).getText().equalsIgnoreCase("Ender's Game: Special 20th Anniversary Edition")){
                bookNamesLocator.get(i).click();
                break;
            }
        }
        //Add the book to your
        WebElement hardcoverLocator = driver.findElement(By.id("a-autoid-2-announce"));
        hardcoverLocator.click();
        WebElement addToCartButton = driver.findElement((By.id("add-to-cart-button")));
        addToCartButton.click();

        //Navigate to your cart and verify the book is there
        List<WebElement> verifyBookAdding = driver.findElements(By.id("hlb-ptc-btn-native"));
        Assert.assertEquals(verifyBookAdding.get(0).getText(), "Proceed to checkout (1 item)");

        WebElement cart = driver.findElement(By.id("nav-cart-count"));
        cart.click();

        //Remove the book from the cart
        WebElement delete = driver.findElement(By.xpath("//*[@value='Delete']"));
        delete.click();

        //And verify that it is no longer present
        WebElement deleteVerify = driver.findElement(By.xpath("//*[@class='a-row sc-your-amazon-cart-is-empty']"));
        Assert.assertEquals("Your Amazon cart is empty", deleteVerify.getText());
    }

    @AfterMethod
    public  void tearDown(){
        driver.quit(); // selenium clean up after yourself, close browser
    }

}
