package regressionTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import regression.HomePage;

public class HomePageTest extends HomePage {



    @Test
    public void TestHome(){

        System.out.println(driver.getTitle());
    }



}
