package regressionHome;

import base.CommonAPI;

public class Target_Home_Page extends CommonAPI {

    public void TargetHomePage(){
        System.out.println(driver.getTitle());
    }
    public void TargetSign(){
        clickByXpath("//*[@id=\"home\"]");
    }
    public void CategoriesButton(){
        clickByXpath("//span[contains(text(),'Categories')]  ");
    }
    public void DealsButton(){
        clickByXpath("//a[@id='secondary']");
    }
    public void TrendingButton(){
        clickByXpath("//a[@id='trending']");
    }
    public void SearchField(){
        clickByXpath("//input[@id='search']");
    }
    public void SigninButton(){
        clickByXpath("//*[@id=\"account\"]");
    }

}
