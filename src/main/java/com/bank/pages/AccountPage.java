package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.security.cert.X509Certificate;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement deposit;
    public void clickOnDeposit(){
        Reporter.log("Click on deposit" + deposit.toString()+"<br>");
        clickOnElement(deposit);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amount;
    public void enterAmount(){
        Reporter.log("Select amount"+ amount.toString()+"<br>");
        sendTextToElement(amount,"1000");
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositButton;
    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement displayText;
    public void verifyDepositSuccessful(){
        Reporter.log("Deposit successful"+ displayText.toString()+"<br>");
        String expectedText ="Deposit Successful";
        String actualText = getTextFromElement(displayText);
        Assert.assertEquals(actualText,expectedText,"Deposit successful");
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdrawl;
    public void clickOnWithdrawl(){
        Reporter.log("Withdrawl"+ withdrawl.toString()+"<br>");
        clickOnElement(withdrawl);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement withdrawlAmount;
    public void enterWithdrwalAmount(){
        Reporter.log("Withdrawl" + withdrawlAmount.toString()+"<br>");
        sendTextToElement(withdrawlAmount,"1");
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrwalButton;
    public void clickOnWithdrawlButton(){
        Reporter.log("Clciking on withdrwal" + withdrwalButton + "<br>");
        clickOnElement(withdrwalButton);
    }
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement transactionSuccessful;
    public void verifyTransactionSuccessful(){
        Reporter.log("TransactionSuccessful"+transactionSuccessful.toString()+"<br>");
        String expectedText="Transaction successful";
        String actualText= getTextFromElement(transactionSuccessful);
        Assert.assertEquals(actualText,expectedText,"TransactionSuccessful");
    }
}
