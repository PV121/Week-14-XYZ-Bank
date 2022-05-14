package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;
    public void clickOnBAnkMangerLoginButton() {
        Reporter.log("Clicking on bank manager login" + bankManagerLogin.toString() +"<br>");
        clickOnElement(bankManagerLogin);
    }


}
