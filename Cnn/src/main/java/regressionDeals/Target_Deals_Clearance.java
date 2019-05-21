package regressionDeals;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Target_Deals_Clearance extends CommonAPI {

    @FindBy(id = "account")
    WebElement deals;

    public void Target_deals_clearance(){
        deals.click();
        sleepFor(2);
    }
}
