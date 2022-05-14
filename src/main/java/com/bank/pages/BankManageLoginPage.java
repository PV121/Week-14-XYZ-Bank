package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManageLoginPage extends Utility {
    public BankManageLoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;
    public void clickOnAddCustomerButton(){
        Reporter.log("Clicking on add customer" + addCustomer.toString()+ "<br>");
        clickOnElement(addCustomer);
    }
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccount;
    public void clickOnOpenAccountButton(){
        Reporter.log("Click on open account" + openAccount.toString()+"<br>");
        clickOnElement(openAccount);
    }

}
