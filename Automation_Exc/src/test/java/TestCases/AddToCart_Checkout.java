package TestCases;

import Pages.*;
import org.testng.annotations.Test;

public class AddToCart_Checkout extends BaseTest {
    Home_Page homePage;
    Login_Page loginPage;
    Shopping_Page shoppingPage;
    Checkout_Page checkoutPage;

    @Test
    public void checkOut_test01(){
        homePage = new Home_Page(base_test_driver);
        homePage.ClickOnMyAccountMenu();

        loginPage =new Login_Page(base_test_driver);
        loginPage.insertEmail("nada@gmail");
        loginPage.insertPassword("123456");
        loginPage.clickOnLoginButton();

        shoppingPage = new Shopping_Page(base_test_driver);
        shoppingPage.useSearchField("Htc");
        shoppingPage.clickOnSearchButton();
        shoppingPage.chooseHTCPhone();
        shoppingPage.clickOnAddToCart();
        shoppingPage.clickOnCheckOutButton();

        checkoutPage = new Checkout_Page(base_test_driver);
        checkoutPage.insertTelephone("+201000000000");
        checkoutPage.insertCheckoutFName("Nada");
        checkoutPage.insertCheckoutLName("Kandil");
        checkoutPage.insertCompany("fawry");
        checkoutPage.insertAddress("street no.5");
        checkoutPage.insertCity("Cairo");
        checkoutPage.insertPostalCode("0000");
        checkoutPage.insertCountry("Egypt");
        checkoutPage.insertState("Al Jizah");
        checkoutPage.clickOnInputAgree();
        checkoutPage.clickOnButtonSave();
        checkoutPage.clickOnConfirmButton();
        checkoutPage.clickOnContinueCheckout();




    }



}
