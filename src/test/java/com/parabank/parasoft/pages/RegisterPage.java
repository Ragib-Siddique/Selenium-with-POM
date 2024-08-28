package com.parabank.parasoft.pages;

import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
     public RegisterPage fillFirstName (String Firstname){
        getWebElement(By.id("customer.firstName")).sendKeys();
        return this;
     }
    public RegisterPage fillLastName (String Lastname){
        getWebElement(By.id("customer.lastName")).sendKeys();
        return this;
    }
    public RegisterPage fillAddress (String Address){
        getWebElement(By.id("customer.address.street")).sendKeys();
        return this;
    }

    public RegisterPage fillCity (String City){
        getWebElement(By.id("customer.address.city")).sendKeys();
        return this;
    }

    public RegisterPage fillState (String State){
        getWebElement(By.id("customer.address.state")).sendKeys();
        return this;
    }
    public RegisterPage fillZipCode (String ZipCode){
        getWebElement(By.id("customer.address.zipCode")).sendKeys();
        return this;
    }
    public RegisterPage fillPhone (String Phone){
        getWebElement(By.id("customer.phoneNumber")).sendKeys();
        return this;
    }
    public RegisterPage fillSsn (String Ssn){
        getWebElement(By.id("customer.ssn")).sendKeys();
        return this;
    }
    public RegisterPage fillUserName (String UserName){
        getWebElement(By.id("customer.username")).sendKeys();
        return this;
    }
    public RegisterPage fillPassword (String Password){
        getWebElement(By.id("customer.password")).sendKeys();
        return this;
    }
    public RegisterPage fillConfirmPassword (String rePassword){
        getWebElement(By.id("repeatedPassword")).sendKeys();
        return this;
    }
    public HomePage clickRegisterBtn (){
        getWebElement(By.cssSelector("input[value='Register']")).click();
        return getInstance(HomePage.class);
    }

    public RegisterPage clickRegisterLink (){
        getWebElement(By.cssSelector("a[href='register.htm']")).click();
        return this;
    }



    public boolean hasSSNRequiredFieldError(){
        return getWebElements(By.id("customer.ssn.errors")).size()>0;
    }


    public boolean hasFirstNameRequiredFieldError(){
        return getWebElements(By.id("customer.firstName.errors")).size()>0;
    }

    public boolean hasError(int errorNumber){
    return getWebElements(By.className("error")).size() >= errorNumber;
    }



}
