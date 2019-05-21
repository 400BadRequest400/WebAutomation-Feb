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
    //@Test
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

    Target_Create_Account createaccount;
    @BeforeMethod
    public void init2(){
        createaccount = PageFactory.initElements(driver, Target_Create_Account.class);
    }

    @Test
    public void TargetCreateAccountTest1(){
        createaccount.TargetCreateAccount("djaf1981@gmail.com","Jeff","Slimane","3477777034","Algeria*2019");
        sleepFor(2);
    }


    //@Test(priority = 5)
    public void TargetCreateAccountTest2(){
        createaccount.TargetCreateAccount("aklidjebra@gmail.com","akli","djebra","3476661550","Algeria*2019");
        sleepFor(2);
    }

    //@Test(priority = 6)
    public void TargetCreateAccountTest3(){
        createaccount.TargetCreateAccount("daljeet@gmail.com","daljeet","ali","0123456789","India*2019");
        sleepFor(2);
    }














}
