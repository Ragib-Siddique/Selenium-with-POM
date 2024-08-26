package com.parabank.parasoft.testcases;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{


    @Test

public void registrationShouldFailWithoutData(){
        LoginPage loginPage=page.getInstance(LoginPage.class);

        RegisterPage registerPage=loginPage
                .clickRegistrationLink()
                        .clickRegisterLink();

        Assert.assertTrue(registerPage.hasFirstNameRequiredFieldError());
        Assert.assertTrue(registerPage.hasError(10));

    }

}
