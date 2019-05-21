package regressionCategoriesTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import regressionDeals.Target_Deals_Clearance;

public class TargetDealsTest extends CommonAPI {

    Target_Deals_Clearance dealsclear;
    @BeforeMethod
    public void init1(){
        dealsclear = PageFactory.initElements(driver, Target_Deals_Clearance.class);
    }

    public void TargetDealsClkearanceTest(){

    }
}
