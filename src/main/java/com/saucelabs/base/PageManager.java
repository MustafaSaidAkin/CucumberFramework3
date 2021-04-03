package com.saucelabs.base;

import com.saucelabs.pages.CheckoutPage;
import com.saucelabs.pages.HomePage;
import com.saucelabs.pages.ItemPage;
import com.saucelabs.pages.LoginPage;

public class PageManager {


    public static LoginPage loginPage;
    public static ItemPage itemPage;
    public static CheckoutPage checkOutPage;
    public static HomePage homePage;


    public static void initialize(){
        //initialize pages
        loginPage = new LoginPage();
        itemPage = new ItemPage();
        checkOutPage = new CheckoutPage();
        homePage  = new HomePage();

    }

}
