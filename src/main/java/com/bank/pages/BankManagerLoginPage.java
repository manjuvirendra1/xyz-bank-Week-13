package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnBankManagerLoginTab(){
        clickOnElement(bankManagerLogin);
    }


}
