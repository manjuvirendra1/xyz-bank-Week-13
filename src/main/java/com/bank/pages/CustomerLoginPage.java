package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By customerLoginTab = By.xpath("//button[normalize-space()='Customer Login']");


    public void clickOnCustomerLoginTab(){
        clickOnElement(customerLoginTab);
    }

    }














