package regressionTest;

import org.testng.annotations.Test;
import regression.TargetSignIn;

public class TargetSignInTest extends TargetSignIn {

    @Test(priority = 1)
    public void SigninTest1(){

        Signin();
        sleepFor(2);

        clickSignin();
        sleepFor(2);

        userName("Jeff@selenium.com");
        sleepFor(2);

        password("djafar");
        sleepFor(2);

        clickSigninbutton();
        sleepFor(2);

        forgetpassword();
        sleepFor(2);
    }

    @Test(priority = 2)
    public void SigninTest2(){

        Signin();
        sleepFor(2);

        clickSignin();
        sleepFor(2);

        userName("Cirta@selenium.com");
        sleepFor(2);

        password("cirta");
        sleepFor(2);

        clickSigninbutton();
        sleepFor(2);

        forgetpassword();
        sleepFor(2);

    }
    @Test(priority = 3)
    public void SigninTest3(){

        Signin();
        sleepFor(2);

        clickSignin();
        sleepFor(2);

        userName("Cylia@selenium.com");
        sleepFor(2);

        password("cylia");
        sleepFor(2);

        clickSigninbutton();
        sleepFor(2);

        forgetpassword();
        sleepFor(2);

    }





}
