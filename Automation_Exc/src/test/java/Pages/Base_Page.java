package Pages;

import org.openqa.selenium.WebDriver;

public class Base_Page {

    protected WebDriver base_page_driver;

    Base_Page(WebDriver driver){
        base_page_driver=driver;
    }
}
