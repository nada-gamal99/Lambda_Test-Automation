package TestCases;

import Pages.Home_Page;
import Pages.SignUp_Page;
import org.testng.annotations.Test;

public class CreateNewProfile extends BaseTest{
   Home_Page home_page;
   SignUp_Page signUp_page;
    @Test
    public void CreateNewProfile_test01() throws InterruptedException {
        home_page = new Home_Page(base_test_driver);
        home_page.ClickOnMyAccountMenu();
        home_page.ClickOnContinueButton();

    signUp_page = new SignUp_Page(base_test_driver);
    signUp_page.insertFName("Nada");
    signUp_page.insertLName("Kandil");
    signUp_page.insertEmail("nada@gmail.com");
    signUp_page.insertTelephone("+201000000000");
    signUp_page.insertPassword("123456");
    signUp_page.confirmPassword("123456");
    signUp_page.clickOnAgreeCheckBox();
    signUp_page.clickOnContinueRegistrationButton();
    Thread.sleep(2000);
    signUp_page.clickOnLogout();


}
}





