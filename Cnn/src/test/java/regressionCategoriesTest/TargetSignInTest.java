package regressionCategoriesTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionSignIn.Target_Create_Account;
import regressionSignIn.Target_SignIn;

public class TargetSignInTest extends CommonAPI {

    Target_SignIn obj1;
    //@BeforeMethod
    public void init1(){
        obj1 = PageFactory.initElements(driver,Target_SignIn.class);
    }

    Target_Create_Account account;
    public void init2(){
        account = PageFactory.initElements(driver,Target_Create_Account.class);
        sleepFor(2);
    }

   // @Test(priority = 1)
    public void SignInTest1() {
        obj1.Target_SignIn("Jeff@selenium.com", "Jeff");
        sleepFor(2);
    }
    //@Test(priority = 2)
    public void SignInTest2() {
        obj1.Target_SignIn("Akli@selenium.com", "Akli");
        sleepFor(2);
    }
    //@Test(priority = 3)
    public void SignInTest3() {
        obj1.Target_SignIn("Daljeet@selenium.com", "Daljeet");
        sleepFor(2);
    }
    @Test
    public void targetCreateaccounttest(){
        account.TargetCreateAccount();
        sleepFor(2);
    }












}
