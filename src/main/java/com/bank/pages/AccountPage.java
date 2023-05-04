package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By withdrawlTab = By.xpath("//button[normalize-space()='Withdrawl']");
    By depositButton = By.xpath("//button[@type='submit']");
    By amountToDeposit = By.xpath("//input[@placeholder='amount']");
    By amountToWithdraw =  By.xpath("//input[@placeholder='amount']");
    By withdrawButton = By.xpath("//button[normalize-space()='Withdraw']");
    By depositSuccessfulText = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By transactionSuccessfulText = By.xpath("//span[contains(text(),'Transaction successful')]");


    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }

    public void clickOnWithdrawlTab() {
        clickOnElement(withdrawlTab);
    }


    public void amountToDeposit() {
        sendTextToElement(amountToDeposit, "100");
    }

    public void clickOnDepositButton() {
        clickOnElement(depositButton);
    }

    public void setWithdrawalAmount() {
        sendTextToElement(amountToWithdraw, "50");
    }

    public void clickOnWithdrawButton() {
        clickOnElement(withdrawButton);
    }

    public String depositSuccessfulText(){
        return getTextFromElement(depositSuccessfulText);
    }

    public String transactionSuccessfulText(){
        return getTextFromElement(transactionSuccessfulText);
    }

}