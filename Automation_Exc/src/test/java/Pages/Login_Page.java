package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page extends Base_Page{
    public Login_Page(WebDriver driver) {
        super(driver);
    }

    By myAccountMenu = By.xpath("//div[@id='entry_217834']//span[contains(text(),'My account')]");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.xpath("//input[@type='submit' and @value='Login']");

    public void clickOnLoginButton(){
        base_page_driver.findElement(loginButton).click();
    }
    public void insertEmail(String mail){
        base_page_driver.findElement(email).sendKeys(mail);
    }
    public void insertPassword(String pass){
        base_page_driver.findElement(password).sendKeys(pass);
    }


}
