package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@type='submit']");


    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomerTab);
    }

    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName){
        sendTextToElement(lastNameField, lastName);

    }
    public void enterPostcode(String postCode) {
        sendTextToElement(postCodeField, postCode);

    }
        public void clickOnAddCustomerButton(){
            clickOnElement(addCustomerButton);
    }


    }

