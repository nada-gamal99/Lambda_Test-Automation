package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page extends Base_Page{

    public Home_Page(WebDriver driver) {
        super(driver);
    }


    private By myAccountMenu = By.xpath("//div[@id='entry_217834']//span[contains(text(),'My account')]");
    private By continueButton = By.xpath("//div[@id='content']//a[text()='Continue']");


    public void ClickOnMyAccountMenu(){
        base_page_driver.findElement(myAccountMenu).click();
    }

    public void ClickOnContinueButton(){
        base_page_driver.findElement(continueButton).click();
    }
}
