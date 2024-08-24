package com.parabank.parasoft.tsetcases;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OpenNewAccountPage;
import com.parabank.parasoft.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest {


    @Test(priority = 1)
    public void openAccountShouldSucceed() {
        OpenNewAccountPage newAccountPage = page.getInstance(LoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickOpenAccountLink()
                .selectAccountType(1)
                .selectAccountNumber(0)
                .ClickNewAccountBtn();
        Assert.assertTrue(newAccountPage.hasAccountId());
    }

    @Test(priority = 0)
    public void openAccountShouldSucceed1() {
        OpenNewAccountPage newAccountPage = page.getInstance(LoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickOpenAccountLink()
                .ClickNewAccountBtn();
        Assert.assertTrue(newAccountPage.hasAccountId());
    }

}


//Longer Version Step by Step//

/* public void openAccountShouldSucceed(){
    LoginPage loginPage=page.getInstance(LoginPage.class);

    Assert.assertEquals(loginPage.getPageTittle(), General.LOGIN_TITTLE);

    HomePage homePage=loginPage
            .doLogin(getUsername(), getPassword());
    Assert.assertTrue(homePage.hasLogoutLink());


    OpenNewAccountPage openNewAccountPage=homePage
            .clickOpenAccountLink()
            .selectAccountType(1)
            .selectAccountNumber(0)
            .ClickNewAccountBtn();

    Assert.assertTrue(openNewAccountPage.hasAccountId());


}
}*/



