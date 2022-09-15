package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_Page extends Base_Page{
    public Checkout_Page(WebDriver driver) {
        super(driver);
    }

    protected By telephone = By.id("input-telephone");
    protected By checkoutFName = By.id("input-payment-firstname");
    protected By checkoutLName = By.id("input-payment-lastname");
    protected By paymentCompany = By.id("input-payment-company");
    protected By user_address = By.id("input-payment-company");
    protected By user_city = By.id("input-payment-city");
    protected By postalCode = By.id("input-payment-postcode");
    protected By user_country = By.id("input-payment-country");
    protected By user_state = By.id("input-payment-zone");
    protected By inputAgreeButton = By.id("input-agree");
    protected By buttonSave = By.id("button-save");
    By confirmButton = By.id("button-confirm");
    By continueCheckout = By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div/a");


    public void insertTelephone(String phone){
        base_page_driver.findElement(telephone).sendKeys(phone);
    }
    public void insertCheckoutFName(String check_fName){
        base_page_driver.findElement(checkoutFName).sendKeys(check_fName);
    }

    public void insertCheckoutLName(String check_lName){
        base_page_driver.findElement(checkoutLName).sendKeys(check_lName);
    }
    public void insertCompany(String comp){
        base_page_driver.findElement(paymentCompany).sendKeys(comp);
    }
    public void insertAddress(String address){
        base_page_driver.findElement(user_address).sendKeys(address);
    }
    public void insertCity(String city){
        base_page_driver.findElement(user_city).sendKeys(city);
    }
    public void insertPostalCode(String code){
        base_page_driver.findElement(postalCode).sendKeys(code);
    }
    public void insertCountry(String country){
        base_page_driver.findElement(user_country).sendKeys(country);
    }
    public void insertState(String state){
        base_page_driver.findElement(user_state).sendKeys(state);
    }
    public void clickOnInputAgree(){
        base_page_driver.findElement(inputAgreeButton).click();
    }
    public void clickOnButtonSave(){
        base_page_driver.findElement(buttonSave).click();
    }
    public void clickOnConfirmButton(){
        base_page_driver.findElement(confirmButton).click();
    }
    public void clickOnContinueCheckout(){
        base_page_driver.findElement(continueCheckout).click();
    }
}
