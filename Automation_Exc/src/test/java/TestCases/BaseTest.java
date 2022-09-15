package TestCases;

import Pages.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import Pages.Home_Page;

public class BaseTest {

    protected ChromeDriver base_test_driver;
    private final String URL = "https://ecommerce-playground.lambdatest.io/";
    protected Home_Page home_page;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        base_test_driver = new ChromeDriver();
        base_test_driver.manage().window().maximize();
        base_test_driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterClass
    public void tearDown(){
        base_test_driver.quit();
    }


}
