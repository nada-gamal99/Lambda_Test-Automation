package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp_Page extends Base_Page{
    public SignUp_Page(WebDriver driver) {
        super(driver);
    }

    private By firstName = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By telephone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By agreeCheckbox = By.xpath("//label[@for='input-agree']");
    private By continueRegistrationButton = By.xpath("//input[@type='submit' and @value='Continue']");
    private By logout = By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),'Logout')]");


    public void insertFName(String fName){
        base_page_driver.findElement(firstName).sendKeys(fName);
    }
    public void insertLName(String lName){
        base_page_driver.findElement(lastName).sendKeys(lName);
    }
    public void insertEmail(String mail){
        base_page_driver.findElement(email).sendKeys(mail);
    }
    public void insertTelephone(String phone){
        base_page_driver.findElement(telephone).sendKeys(phone);
    }
    public void insertPassword(String pass){
        base_page_driver.findElement(password).sendKeys(pass);
    }
    public void confirmPassword(String confirm_pass){
        base_page_driver.findElement(confirmPassword).sendKeys(confirm_pass);

    }
    public void clickOnAgreeCheckBox(){
        base_page_driver.findElement(agreeCheckbox).click();
    }
    public void clickOnContinueRegistrationButton(){
        base_page_driver.findElement(continueRegistrationButton).click();
    }
    public void clickOnLogout(){
        base_page_driver.findElement(logout).click();
    }
}
