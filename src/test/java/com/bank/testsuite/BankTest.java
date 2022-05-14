package com.bank.testsuite;

import com.bank.driverfactory.ManageDriver;
import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    BankManageLoginPage bankManageLoginPage;
    HomePage homePage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        bankManageLoginPage = new BankManageLoginPage();
        homePage = new HomePage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        accountPage = new AccountPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        // click On "Bank Manager Login" Tab
        homePage.clickOnBAnkMangerLoginButton();
        //click On "Add Customer" Tab
        bankManageLoginPage.clickOnAddCustomerButton();
        //enter FirstName
        addCustomerPage.enterFirstName();
        //enter LastName
        addCustomerPage.enterLastName();
        //enter PostCode
        addCustomerPage.enterPostCode();
        //click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomer();
        //popup display
        //	verify message "Customer added successfully"
        switchToAlert();
        String expectedMessage = "Customer added successfully";
        String actualMessage = getTextFromAlert().substring(0, 27);
        Assert.assertEquals(actualMessage, expectedMessage, "Customer added successfully");
        //click on "ok" button on popup
        acceptAlert();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        //click On "Bank Manager Login" Tab
        homePage.clickOnBAnkMangerLoginButton();
        //click On "Open Account" Tab
        bankManageLoginPage.clickOnOpenAccountButton();
        //Search customer that created in first test
        openAccountPage.clickOnCustomerName();
        openAccountPage.verifyCustomerName("2");
        // Select currency "Pound"
        openAccountPage.selectCurrencyFormDropDown("Pound");
        // click on "process" button
        openAccountPage.clickOnProcessButton();
        //popup displayed
        //	verify message "Account created successfully"
        String expectedText = "Account created successfully";
        String actualText = getTextFromAlert().substring(0, 28);
        Assert.assertEquals(actualText, expectedText, "Account created successfully");
        // click on "ok" button on popup.
        acceptAlert();


    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLoginButton();
        // search customer that you created.
        customerLoginPage.verifyYourNameFromDropDown("2");
        // click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(3000);
        // verify "Logout" Tab displayed.
        customerLoginPage.verifyLogoutButton();
        // click on "Logout"
        customerLoginPage.clickOnLogout();
        // verify "Your Name" text displayed.
        customerLoginPage.verifyYourNameDisplay();

    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldDepositMoneySuccessfully() {
        // click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLoginButton();
        // search customer that you created.
        customerLoginPage.verifyYourNameFromDropDown("2");
        // click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        // click on "Deposit" Tab
        accountPage.clickOnDeposit();
        // Enter amount 100
        accountPage.enterAmount();
        // click on "Deposit" Button
        accountPage.clickOnDepositButton();
        // verify message "Deposit Successful"
        accountPage.verifyDepositSuccessful();
    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        // click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLoginButton();
        // search customer that you created.
        customerLoginPage.verifyYourNameFromDropDown("2");
        // click on "Login" Button
        customerLoginPage.clickOnLoginButton();
        // click on "Withdrawl" Tab
        accountPage.clickOnWithdrawl();
        // Enter amount 50
        accountPage.enterWithdrwalAmount();
        // click on "Withdraw" Button
        accountPage.clickOnWithdrawlButton();
        // verify message "Transaction Successful"
        accountPage.verifyTransactionSuccessful();
    }
}
