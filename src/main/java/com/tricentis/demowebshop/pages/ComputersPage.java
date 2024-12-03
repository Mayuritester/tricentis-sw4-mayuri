package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    public void clickOnDesktops (){
        clickOnElement(By.linkText("Desktops"));

    }


    By computerTitle = By.xpath("//h1[normalize-space()='Computers']");

    public String getComputerPageTitle(){
        return getTextFromElement(computerTitle);
    }
}


