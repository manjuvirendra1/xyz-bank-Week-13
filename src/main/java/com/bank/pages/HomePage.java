package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By home = By.xpath("//button[normalize-space()='Home']");
    By yourNameField = By.xpath("//select[@id='userSelect']");
    By okButton = By.xpath("//button[@type='submit']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By logout = By.xpath("//button[normalize-space()='Logout']");
    By logoutText = By.xpath("//button[normalize-space()='Logout']");
    By yourNameText =By.id("userSelect");


    public void clickOnHomeButton() {
        clickOnElement(home);
    }

    public void selectCustomerNameFromDropDown(String yourName){
        selectByVisibleTextFromDropDown(yourNameField, yourName);
    }

    public void clickOnOkButton() {
        clickOnElement(okButton);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void clickOnLogout() {
        clickOnElement(logout);
    }
    public String logoutTextDisplayed(){
        return getTextFromElement(logoutText);
    }
    public String yourNameTextDisplayed(){
        return getTextFromElement(yourNameText);
    }
}