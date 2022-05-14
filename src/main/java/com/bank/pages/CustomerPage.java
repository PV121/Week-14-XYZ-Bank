package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage extends Utility {
    public CustomerPage() {
        PageFactory.initElements(driver,this);
    }

}
