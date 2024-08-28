package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test

    public void doLoginWithUsernameShouldFailed() {

        LoginPage loginPage=page.getInstance(LoginPage.class);

        loginPage=loginPage
                .fillUsername("adadadad")
                .clicklLoginLinkBtn();

        Assert.assertTrue(loginPage.hasError());
    }




    @Test

    public void doLoginWithPasswordShouldFailed() {

        LoginPage loginPage=page.getInstance(LoginPage.class);

        loginPage=loginPage
                .fillUPassword("123dadadad")
                .clicklLoginLinkBtn();

        Assert.assertTrue(loginPage.hasError());
    }


    @Test

    public void doLoginShouldFailed() {

        LoginPage loginPage=page.getInstance(LoginPage.class);

        loginPage=loginPage
                .clicklLoginLinkBtn();

        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginShouldSucceed(){

        LoginPage loginPage=page.getInstance(LoginPage.class);

        HomePage overviewPage=loginPage
                .fillUsername(getUsername())
                .fillUPassword(getPassword())
                .clickLoginBtn();

                            Assert.assertTrue(overviewPage.hasLogoutLink());

    }

        @Test
    public void checkTittle(){

        LoginPage loginPage=page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), General.LOGIN_TITTLE);


        }




}
