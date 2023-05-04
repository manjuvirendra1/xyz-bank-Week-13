package com.bank.testsuite;
import org.openqa.selenium.By;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerPage customerPage = new CustomerPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerLoginPage.clickOnBankManagerLoginTab();
        addCustomerPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Prime");
        addCustomerPage.enterLastName("Testing");
        addCustomerPage.enterPostcode("HA0 3NZ");
        addCustomerPage.clickOnAddCustomerButton();
        //pop up display
        switchToAlert();
        String expectedMessage = "Customer added successfully with customer id :6";
        String actualMessage = getTextFromAlert();
        Assert.assertEquals(expectedMessage, actualMessage);
        alertAccept();

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        bankManagerLoginPage.clickOnBankManagerLoginTab();
        openAccountPage.clickOpenAccountTab();
        openAccountPage.selectCustomerNameFromDropDown("Harry Potter");
        openAccountPage.selectCurrencyFromDropDown("Pound");
        openAccountPage.clickOnProcessButton();
        switchToAlert();
        String expectedMessage = "Account created successfully with account Number :1016";
        String actualMessage = getTextFromAlert();
        Assert.assertEquals(expectedMessage, actualMessage);
        alertAccept();


    }

    @Test
    public void customerLoginAndLogoutSuccessfully() {
        homePage.clickOnHomeButton();
        customerLoginPage.clickOnCustomerLoginTab();
        homePage.selectCustomerNameFromDropDown("Harry Potter");
        homePage.clickOnLoginButton();
        String expectedMessage = "Logout";
        String actualMessage = homePage.logoutTextDisplayed();
        assertEquals(actualMessage, expectedMessage);
        homePage.clickOnLogout();
        String expectedMessage1 = "Your Name :";
        String actualMessage1 = homePage.yourNameTextDisplayed();
        assertEquals(actualMessage1, expectedMessage1);

    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnHomeButton();
        customerLoginPage.clickOnCustomerLoginTab();
        homePage.selectCustomerNameFromDropDown("Harry Potter");
        homePage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.amountToDeposit();
        accountPage.clickOnDepositButton();
        String expectedMessage1 = "Deposit Successful";
        String actualMessage1 = accountPage.depositSuccessfulText();
        assertEquals(actualMessage1, expectedMessage1);
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnHomeButton();
        customerLoginPage.clickOnCustomerLoginTab();
        homePage.selectCustomerNameFromDropDown("Harry Potter");
        homePage.clickOnLoginButton();
        accountPage.clickOnDepositTab();
        accountPage.amountToDeposit();
        accountPage.clickOnDepositButton();
        accountPage.clickOnWithdrawlTab();
        accountPage.setWithdrawalAmount();
        accountPage.clickOnWithdrawButton();
        String expectedMessage1 = "Transaction successful";
       String actualMessage1 = accountPage.transactionSuccessfulText();
        assertEquals(actualMessage1, expectedMessage1);

    }

}