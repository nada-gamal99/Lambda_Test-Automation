package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shopping_Page extends Base_Page{
    public Shopping_Page(WebDriver driver) {
        super(driver);
    }

    By searchField = By.xpath("//div[@id='entry_217822']//input[@aria-label='Search For Products']");
    By searchButton = By.xpath("//div[@id='search']//button[text()='Search']");
    By htcPhone = By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[1]/a/div/div[1]/img");
    By addToCart = By.xpath("/html/body/div[1]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div[10]/div/div[4]/div/div[2]/button");
    By checkoutButton = By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/a");

    public void useSearchField(String product){
        base_page_driver.findElement(searchField).sendKeys(product);
    }

    public void clickOnSearchButton(){
        base_page_driver.findElement(searchButton).click();
    }

    public void chooseHTCPhone(){
        base_page_driver.findElement(htcPhone).click();
    }

    public void clickOnAddToCart(){
        base_page_driver.findElement(addToCart).click();
    }
    public void clickOnCheckOutButton(){
        base_page_driver.findElement(checkoutButton).click();
    }
}
