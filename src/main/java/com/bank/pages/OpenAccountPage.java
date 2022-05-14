package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    public OpenAccountPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDown;
    public void clickOnCustomerName(){
        Reporter.log("Click on customer name" + customerDropDown.toString()+"<br>");
        clickOnElement(customerDropDown);
    }
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerName;
    public void verifyCustomerName(String value){
        Reporter.log("Select customer name" + customerName.toString()+"<br>");
        selectByValueFromDropDown(customerName,"2");
    }
    @FindBy(xpath = "//select[@id='currency']")
    WebElement poundCurrency;
    public void selectCurrencyFormDropDown(String text){
        Reporter.log("Select currency" + poundCurrency.toString()+"<br>");
        selectByVisibleTextFromDropDown(poundCurrency,"Pound");
    }
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;
    public void clickOnProcessButton(){
        Reporter.log("Click on process button"+ processButton.toString()+"<br>");
        clickOnElement(processButton);
    }



}
