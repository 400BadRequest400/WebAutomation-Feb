package regressionCategoriesTest;

import org.testng.annotations.Test;
import regressionHome.Target_Home_Page;

public class TargetHomeTest extends Target_Home_Page {

    //@Test(priority = 1)
    public void TargetHomePageTest(){
        TargetHomePage();
        sleepFor(3);
    }

    //@Test(priority = 2)
    public void HomeSignTest(){
        TargetHomePage();
        sleepFor(3);
        TargetSign();
        sleepFor(3);
    }

    //@Test(priority = 3)
    public void CategoriesButtonTest(){
        TargetHomePage();
        sleepFor(3);
        CategoriesButton();
        sleepFor(3);
    }
    //@Test(priority = 4)
    public void DealsButtonTest(){
        TargetHomePage();
        sleepFor(3);
        DealsButton();
        sleepFor(3);
    }
    //@Test(priority = 5)
    public void TrendingButtonTest(){
        TargetHomePage();
        sleepFor(3);
        TrendingButton();
        sleepFor(3);
    }
    //@Test(priority = 6)
    public void SearchFieldTest(){
        TargetHomePage();
        sleepFor(3);
        SearchField();
        sleepFor(3);
    }
    @Test
    public void SigninButton(){
        TargetHomePage();
        sleepFor(3);
        SigninButton();
        sleepFor(3);
    }


}
