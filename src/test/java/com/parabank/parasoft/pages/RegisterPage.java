package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
     public RegisterPage fillFirstName (String Firstname){
        getWebElement(By.xpath("//input[@id='customer.firstName']")).sendKeys();
        return this;
     }
    public RegisterPage fillLastName (String Lastname){
        getWebElement(By.xpath("//input[@id='customer.lastName']")).sendKeys();
        return this;
    }
    public RegisterPage fillAddress (String Address){
        getWebElement(By.xpath("//tbody/tr[3]/td[2]")).sendKeys();
        return this;
    }

    public RegisterPage fillCity (String City){
        getWebElement(By.xpath("//input[@id='customer.address.city']")).sendKeys();
        return this;
    }

    public RegisterPage fillState (String State){
        getWebElement(By.xpath("//input[@id='customer.address.state']")).sendKeys();
        return this;
    }
    public RegisterPage fillZipCode (int ZipCode){
        getWebElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys();
        return this;
    }
    public RegisterPage fillPhone (int Phone){
        getWebElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys();
        return this;
    }
    public RegisterPage fillSSN (int SSN){
        getWebElement(By.xpath("//input[@id='customer.ssn']")).sendKeys();
        return this;
    }
    public RegisterPage fillUserName (String UserName){
        getWebElement(By.xpath("//b[normalize-space()='Username:']")).sendKeys();
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
