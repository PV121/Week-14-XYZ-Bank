package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstName;
    public void enterFirstName(){
        Reporter.log("Enter first name" + firstName.toString()+"<br>");
        sendTextToElement(firstName,"vijay");
    }
    @FindBy(xpath = "//div/div/form/div[2]/input")
    WebElement lastName;
    public void enterLastName(){
        Reporter.log("Enter last name" + lastName.toString()+"<br>");
        sendTextToElement(lastName,"Maliya");
    }
    @FindBy(xpath = "//div/div/form/div[3]/input")
    WebElement postCode;
    public void enterPostCode(){
        Reporter.log("Enter postcode"+ postCode.toString()+"<br>");
        sendTextToElement(postCode,"LO1 2ON");
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomer;
    public void clickOnAddCustomer(){
        Reporter.log("Click on add customer"+ addCustomer.toString()+"<br>");
        clickOnElement(addCustomer);
    }




}
