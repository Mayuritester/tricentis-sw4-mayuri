package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    //Use the selectMenu method to select the Menu click on it and
    public void verifyPageNavigation() {
        homePage.clickOnComputerInTopMenu("Computers");
        //verify the page navigation.
        String actualText = "Computers";
        String expectedText = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));
        Assert.assertEquals( actualText, expectedText,"no text displayed");


    }
}
