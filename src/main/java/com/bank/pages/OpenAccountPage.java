package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {


    By openAccountTab = By.xpath("//button[normalize-space()='Open Account']");
    By customerNameField = By.id("userSelect");
    By currencyField = By.xpath("//select[@id='currency']");
    By processButton =By.xpath("//button[normalize-space()='Process']");


    public void clickOpenAccountTab(){
        clickOnElement(openAccountTab);

    }

    public void selectCustomerNameFromDropDown(String customerName){
        selectByVisibleTextFromDropDown(customerNameField, customerName);
    }


    public void selectCurrencyFromDropDown(String currency){
        selectByVisibleTextFromDropDown(currencyField, currency);
    }

    public void clickOnProcessButton(){
        clickOnElement(processButton);
    }

}

