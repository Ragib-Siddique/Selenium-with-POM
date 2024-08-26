package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.RegisterPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{


    @Test

public void registrationShouldFailWithoutData(){
        LoginPage loginPage = page.getInstance(LoginPage.class);

        RegisterPage registerPage = loginPage
                .clickRegistrationLink()
                .clickRegisterLink();

        Assert.assertTrue(registerPage.hasFirstNameRequiredFieldError());
        Assert.assertTrue(registerPage.hasError(10));

    }

    @Test

    public void registerShouldSucceed(){
        String username=LoremIpsum.getInstance().getName();
       LoginPage loginPage = page.getInstance(LoginPage.class);


       RegisterPage registerPage=loginPage
               .clickRegistrationLink()
               .fillFirstName(LoremIpsum.getInstance().getFirstName())
               .fillLastName(LoremIpsum.getInstance().getLastName())
               .fillAddress(LoremIpsum.getInstance().getTitle(5))
               .fillCity(LoremIpsum.getInstance().getCity())
               .fillState(LoremIpsum.getInstance().getCity())
               .fillZipCode(LoremIpsum.getInstance().getZipCode())
               .fillPhone(LoremIpsum.getInstance().getPhone())
               .fillSsn("321-45-3445")
               .fillUserName(username)
               .fillPassword(username)
               .fillConfirmPassword(username);

        HomePage homePage = registerPage
                .clickRegisterBtn();
        Assert .assertTrue(homePage.hasLogoutLink());
    }

}
