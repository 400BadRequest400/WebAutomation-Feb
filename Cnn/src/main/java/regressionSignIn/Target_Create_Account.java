package regressionSignIn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Create_Account extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"select-8\"]/button")
    WebElement signInButton;


    @FindBy(xpath = "//*[@id=\"accountNav-createAccount\"]/a/div")
    WebElement createaccount;

    public void TargetCreateAccount(){
        signInButton.click();
        sleepFor(5);

    }

}
