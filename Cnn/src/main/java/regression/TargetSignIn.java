package regression;

import base.CommonAPI;
import org.openqa.selenium.By;

public class TargetSignIn extends CommonAPI {

    public void Signin(){
        clickByXpath("//*[@id=\"account\"]");
    }
    public void clickSignin(){
        clickByXpath("//*[@id=\"accountNav-signIn\"]/a/div");
    }
    public void userName(String user){
        typeByXpath("//*[@id=\"username\"]",user);
        clickByXpath("//*[@id=\"username\"]");
    }
    public void password(String password){
        typeByXpath("//*[@id=\"password\"]",password);
    }
    public void clickSigninbutton(){
        clickByXpath("//button[@id='login']");
    }
    public void forgetpassword(){
        clickByXpath("//a[@id='recoveryPassword']");
    }
    public void navigate(){
        navigateBack();
    }
}
