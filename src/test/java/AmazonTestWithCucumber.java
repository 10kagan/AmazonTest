import org.openqa.selenium.WebDriver;

public class AmazonTestWithCucumber {
    private static WebDriver driver;

//    @Before
//    public  void setup() {
//        //prepare to environment in order to test
//        WebDriverManager.chromedriver().setup(); //setup webdriver
//        driver = new ChromeDriver(); // create object of chrome driver
//        driver.manage().window().maximize(); // open browser maximized
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("https://www.amazon.com/"); // open url
//    }
//
//
//    @Given("Search for the book Ender's Game by Orson Scott Card")
//    public void search_for_the_book_Enders_Game_by_Orson_Scott_Card(){
//
//        //Search for the book Ender's Game by Orson Scott Card
//        WebElement searchBar = driver.findElement(By.xpath("//*[@type='text' and @name='field-keywords']"));
//        searchBar.sendKeys("Ender's Game by Orson Scott Card");
//
//    }
//    @When("Click on the book from the search")
//    public void click_on_the_book_from_the_search(){
//        //Click on the book from the search
//        driver.findElement(By.xpath("//*[@class='nav-input' and @type='submit']")).sendKeys(Keys.RETURN);
//
//        List<WebElement> bookNamesLocator = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
//        for (int i = 0; i < bookNamesLocator.size(); i++) {
//            if(bookNamesLocator.get(i).getText().equalsIgnoreCase("Ender's Game: Special 20th Anniversary Edition")){
//                bookNamesLocator.get(i).click();
//                break;
//            }
//        }
//    }
//
//    @Then("Add the book to your cart")
//    public void add_the_book_to_your_cart(){
//        //Add the book to your
//        WebElement hardcoverLocator = driver.findElement(By.id("a-autoid-2-announce"));
//        hardcoverLocator.click();
//        WebElement addToCartButton = driver.findElement((By.id("add-to-cart-button")));
//        addToCartButton.click();
//    }
//    @Then("Navigate to your cart and verify the book is there")
//    public void navigate_to_your_cart_and_verify_the_book_is_there(){
//        //Navigate to your cart and verify the book is there
//        List<WebElement> verifyBookAdding = driver.findElements(By.id("hlb-ptc-btn-native"));
//        Assert.assertEquals(verifyBookAdding.get(0).getText(), "Proceed to checkout (1 item)");
//
//        WebElement cart = driver.findElement(By.id("nav-cart-count"));
//        cart.click();
//
//    }
//    @Then("Remove the book from the cart and verify that it is no longer present")
//    public void remove_the_book_from_the_cart_and_verify_that_it_is_no_longer_present(){
//        //Remove the book from the cart
//        WebElement delete = driver.findElement(By.xpath("//*[@value='Delete']"));
//        delete.click();
//
//        //And verify that it is no longer present
//        WebElement deleteVerify = driver.findElement(By.xpath("//*[@class='a-row sc-your-amazon-cart-is-empty']"));
//        Assert.assertEquals("Your Amazon cart is empty", deleteVerify.getText());
//    }
//
//    @After
//    public  void tearDown(){
//        driver.quit(); // selenium clean up after yourself, close browser
//    }

}
