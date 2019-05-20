package regressionSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Beach_Towel extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"beach towel\"]/div")
    WebElement beachtowel;


    public void TargetBeachTower(){
        search.click();
        sleepFor(3);
        beachtowel.click();
        sleepFor(3);

    }
}
