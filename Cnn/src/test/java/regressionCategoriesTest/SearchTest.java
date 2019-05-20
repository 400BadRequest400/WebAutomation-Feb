package regressionCategoriesTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionSearch.*;

public class SearchTest extends CommonAPI {

    Target_Search search;
    @BeforeMethod
    public void init1(){
        search = PageFactory.initElements(driver, Target_Search.class);
    }

    Target_Clothing_Deals deal;
    @BeforeMethod
    public void init2(){
        deal = PageFactory.initElements(driver, Target_Clothing_Deals.class);
    }

    Target_GiftCards giftcard;
    @BeforeMethod
    public void init3(){
        giftcard = PageFactory.initElements(driver, Target_GiftCards.class);
    }

    Target_Cube_Storage cubestorage;
    @BeforeMethod
    public void init4(){
        cubestorage = PageFactory.initElements(driver, Target_Cube_Storage.class);
    }

    Target_Women_Dresses womendresses;
    @BeforeMethod
    public void init5(){
        womendresses = PageFactory.initElements(driver, Target_Women_Dresses.class);
    }

    Target_Throw_Blanket throwblanket;
    @BeforeMethod
    public void init6(){
        throwblanket = PageFactory.initElements(driver, Target_Throw_Blanket.class);
    }

    Target_Women_Shoes womenshoes;
    @BeforeMethod
    public void init7(){
        womenshoes = PageFactory.initElements(driver, Target_Women_Shoes.class);
    }
    Target_Comforter_Set comforterset;
    @BeforeMethod
    public void init8(){
        comforterset = PageFactory.initElements(driver, Target_Comforter_Set.class);
    }
    Target_Beach_Towel beachtowel;
    @BeforeMethod
    public void init9(){
        beachtowel = PageFactory.initElements(driver, Target_Beach_Towel.class);
    }


    //@Test
    public void Targetsearchtest(){
        search.TargetSearch();
    }
    //@Test
    public void TargetClothingDealtest(){
        deal.TargetClothingDeals();
    }
    //@Test
    public void TargetGiftCardstest(){
        giftcard.TargetGiftCards();
    }
    //@Test
    public void TargetCubeStoragetest(){
        cubestorage.TargetCubeStorage();
    }
    //@Test
    public void TargetWomenDressesTest(){
        womendresses.TargetWomenDresses();
    }
    //@Test
    public void TargetThrowBlanketTest(){
        throwblanket.TargetThrowBlanket();
    }
    //@Test
    public void TargetWomenShoesTest(){
        womenshoes.TargetWomenShoes();
    }
    //@Test
    public void TargetComforterSetTest(){
        comforterset.TargetComforterSet();
    }
    @Test
    public void TargetBeachtoweltest(){
        beachtowel.TargetBeachTower();
    }


}
