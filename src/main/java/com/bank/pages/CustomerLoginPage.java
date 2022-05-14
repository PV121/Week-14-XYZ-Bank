package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    public void clickOnCustomerLoginButton() {
        Reporter.log("Click on customer login button" + customerLogin);
        clickOnElement(customerLogin);
    }

    @FindBy(xpath ="//select[@id='userSelect']")
    WebElement selectYourName;
    public void verifyYourNameFromDropDown(String value){
        Reporter.log("Select your name" + selectYourName);
        selectByValueFromDropDown(selectYourName,"2");
    }
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    public void clickOnLoginButton(){
        Reporter.log("Click on login button" + loginButton);
        clickOnElement(loginButton);
    }
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutButton;
    public void verifyLogoutButton(){
        Reporter.log("Logout button is display"+ logoutButton.toString()+"<br>");
        String expectedText ="Logout";
        String actualText = getTextFromElement(logoutButton);
        Assert.assertEquals(actualText,expectedText,"Logout");
    }

    public void clickOnLogout(){
        Reporter.log("Click on logout" + logoutButton.toString()+ "<br>");
        clickOnElement(logoutButton);
    }
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameDisplay;
    public void verifyYourNameDisplay(){
        Reporter.log("Your Name is display"+ yourNameDisplay+"<br>");
        getTextFromElement(yourNameDisplay);
    }

}
