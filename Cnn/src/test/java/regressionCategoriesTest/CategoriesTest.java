package regressionCategoriesTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionCategories.*;

public class CategoriesTest extends CommonAPI {

    Categories_Women women;
    @BeforeMethod
    public void init(){
        women = PageFactory.initElements(driver, Categories_Women.class);
    }

    Categories_Men men;
    @BeforeMethod
    public void init2(){
        men = PageFactory.initElements(driver, Categories_Men.class);
    }

    Categories_Kids kid;
    @BeforeMethod
    public void init3(){
        kid = PageFactory.initElements(driver, Categories_Kids.class);
    }

    Categories_Home home;
    @BeforeMethod
    public void init4(){
        home = PageFactory.initElements(driver, Categories_Home.class);
    }

    Categories_Toys toys;
    @BeforeMethod
    public void init5(){
        toys = PageFactory.initElements(driver, Categories_Toys.class);
    }

    Categories_Electronics electronics;
    @BeforeMethod
    public void init6(){
        electronics = PageFactory.initElements(driver, Categories_Electronics.class);
    }


    // Test setup
    //@Test
    public void CategoriesWomenTest(){
        women.CategoriesWomen();
    }
    //@Test
    public void CategoriesMenTest(){
        men.CategoriesMen();
    }
    //@Test
    public void CategoriesKidsTest(){
        kid.Categorieskids();
    }
    //@Test
    public void CategoriesHomeTest(){
        home.CategoriesHome();
    }
    //@Test
    public void CategoriesToysTest(){
        toys.CategoriesToys();
    }
    @Test
    public void CategoriesElectronicsTest(){
        electronics.CategoriesElectronics();
    }

}
