package com.parabank.parasoft.pages;
import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage fillUsername(String username) {
        getWebElement(By.cssSelector("input[name='username']")).sendKeys(username);
        return this;
    }


    public LoginPage fillUPassword(String password) {
        getWebElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;
    }


    public HomePage clickLoginBtn() {
        getWebElement(By.cssSelector("input[value='Log In']")).click();
        return getInstance(HomePage.class);

    }

    public LoginPage clicklLoginLinkBtn() {
        getWebElement(By.cssSelector("input[value='Log In']")).click();
        return this;
    }


    public CustomerLookupPage clickForgetLink() {
        getWebElement(By.cssSelector("//a[normalize-space()='Forgot login info?']")).click();
        return getInstance(CustomerLookupPage.class);
    }


    public RegisterPage clickRegistrationLink() {
        getWebElement(By.xpath("a[href='register.htm']")).click();
        return getInstance(RegisterPage.class);
    }

    public boolean hasError() {
        return getWebElements(By.className("error")).size() > 0;
    }

    public HomePage doLogin(String username, String password) {

        return fillUsername(username)
                .fillUPassword(password)
                .clickLoginBtn();
    }


    public HomePage doLoginViaRegistration() {
        String username = LoremIpsum.getInstance().getName();
        return getInstance(LoginPage.class)
                .clickRegistrationLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getCity())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhone(LoremIpsum.getInstance().getPhone())
                .fillSsn("321-45-3445")
                .fillUserName(username)
                .fillPassword(username)
                .fillConfirmPassword(username)
                .clickRegisterBtn();


    }
}