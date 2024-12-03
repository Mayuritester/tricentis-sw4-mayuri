package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.*;
import com.tricentis.demowebshop.utilities.Utility;
import org.testng.Assert;

import java.time.Instant;

public class Electronis extends Utility {

    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegisterPage registerPage = new RegisterPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
//        1.1 Mouse Hover on the “ELECTRONICS”Tab
        homePage.mouseHoverOnElectronicTab();
//        1.2 Mouse Hover on the “Cell phones”and click
        homePage.mouseHoverAndClickOnCellPhones();
//        1.3 Verify the text “Cell phones”
        Assert.assertEquals(cellPhonesPage.getTitleOfSellPhonesText(), "Cell phones",
                "Cell phones text not matched!");
    }
public void  verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){

//        2.1 Mouse Hover on the “ELECTRONICS”Tab
    homePage.mouseHoverOnElectronicTab();
//        2.2 Mouse Hover on the “Cell phones”and click
    homePage.mouseHoverAndClickOnCellPhones();
//        2.3 Verify the text “Cell phones”
    Assert.assertEquals(cellPhonesPage.getTitleOfSellPhonesText(), "Cell phones",
            "Cell phones text not matched!");
//        2.4 Select View as option ‘List’
    cellPhonesPage.selectViewAsList("List");
//        2.5 Click on the product name “Smartphone”link
    cellPhonesPage.clickOnYourSelectedProduct("Smartphone");
//        2.6 Verify the text “Smartphone”
    Assert.assertEquals(productDetailsPage.getTitleOfYourSelectedProduct(),
            "Smartphone", "Smartphone text not matched!");

//        2.7 Verify the price “100.00”
    Assert.assertEquals(productDetailsPage.getTotalPrice(), "100.00",
            "Price mismatch!");
//        2.8 Change the quantity to 2
    productDetailsPage.changeProductQuantity("2");
//        2.9 Click on the “Add to cart”tab
    productDetailsPage.clickOnAddToCartButton();
//        2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    Assert.assertTrue(productDetailsPage.getSuccessMessageToAddProductInCart()
            .contains("The product has been added to your shopping cart"), "Success message mismatch!");
//        2.11 After that close the bar by clicking on the cross button.
    productDetailsPage.clickOnCrossButtonInGreenBar();
//        2.12 Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
    homePage.mouseHoverOnShoppingCartOnTop();
//        2.13 Verify the message "Shopping cart"
    homePage.clickOnGoToCartButton();
//        2.14 Verify the quantity is 2
    Assert.assertEquals(shoppingCartPage.getShoppingCartTitle(),
            "Shopping cart", "Cart title mismatch!");

//        2.15 Verify the Total “200.00”
    Assert.assertEquals(shoppingCartPage.getTotalPriceOfProduct(),
            "200.00", "Total price mismatch!");
//        2.16 click on the checkbox “I agree with the terms of service”
    shoppingCartPage.clickOnCheckBoxOfTermsAndCondition();
//        2.17 Click on the “Checkout”button
    shoppingCartPage.clickOnCheckOutButton();
//        2.18 Verify the Text “Welcome, Please Sign In !”
    Assert.assertEquals(signInPage.getWelcomeTextFromSignInTitle(),
            "Welcome, Please Sign In!", "Sign-in title mismatch!");

//        2.19 Click on the “Register”tab
    signInPage.clickOnRegisterButton();
//        2.20 Verify the text “Register”
    Assert.assertEquals(registerPage.getRegisterPageTitle(), "Register",
            "Register title mismatch!");
//        2.21 Select the Male radio button
    registerPage.clickOnGenderOnMail();

//        2.22 Enter the First name
    registerPage.enterFirstName("Prime");
//        2.23 Enter the Last name
    registerPage.enterLastName("test");
    Instant timestamp = Instant.now();
//        2.24 Enter the Email
    String email = "Primetest" + timestamp + "@prime.com";
    registerPage.enterEmailAddress(email.replace("-", "").replace(":", ""));
//        2.25 Enter the Password
    registerPage.enterPassword("prime123");
//        2.26 Enter the Confirm password
    registerPage.enterConfirmPassword("prime123");
//        2.27 Click on the “Register”button
    registerPage.clickOnRegisterButton();
//        2.28 Verify the message “Your registration completed”
    Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed",
            "Register completed title mismatch!");
//        2.29 Click on the “Continue”button
    registerPage.clickOnContinueButton();
//        2.30 Verify the text “Shopping card”
    Assert.assertEquals(shoppingCartPage.getShoppingCartTitle(),
            "Shopping cart", "Cart title mismatch!");
//        2.31 click on the checkbox “I agree with the terms of service”
    shoppingCartPage.clickOnCheckBoxOfTermsAndCondition();
//        2.32 Click on the “Checkout”
    shoppingCartPage.clickOnCheckOutButton();
//        2.33 Select the Country “United Kingdom”using the select class
    checkOutPage.selectCountryFromDropdown("United Kingdom");
//        2.34 Enter the city
    checkOutPage.enterCityName("London");
//        2.35 Enter the Address1
    checkOutPage.enterShippingAddress("tets test");
//        2.36 Enter the Zip / Postal code
    checkOutPage.enterZipCode("HA09HT");
//        2.37 Enter the Phone number
    checkOutPage.enterPhoneNumber("856754776");
//        2.38 Click on the “Continue”button
    checkOutPage.clickOnContinueBillingSaveButton();
//        2.39 Click on the “Continue”button
    checkOutPage.clickOnContinueShippingSaveButton();
//        2.40 Click on the Radio Button “2 nd Day Air($0 .00)”
    checkOutPage.clickOnShippingMethodOn2ndDayAir();
//        2.41 Click on the “Continue”button
    checkOutPage.clickOnContinueShippingMethodNextStep();
//        2.42 Select the Radio Button “Credit Card”
    checkOutPage.clickOnCreditCard();
//        2.43 Click on the “Continue”button
    checkOutPage.clickOnContinuePayment();
//        2.44 Select the “Visa”From Select credit card dropdown
    checkOutPage.selectCardTypFromDropdown("Visa");
//        2.45 Enter the Cardholder 's name
    checkOutPage.enterCardholderName("Alexis Runolfsdottir");
//        2.46 Enter the Card number
    checkOutPage.enterCardNumber("5451628062666699");
//        2.47 Select the Expiration date using the select class
    checkOutPage.selectMonthOfExpiry("08");
    checkOutPage.selectYearOfExpire("2025");
//        2.48 Enter the Card code
    checkOutPage.enterCardCode("031");
//        2.49 Click on the “Continue”button
    checkOutPage.clickOnContinuePaymentInfoButton();
//        2.50 Verify the “Payment Method”is “Credit Card”
    Assert.assertEquals(checkOutPage.getPaymentCardType()
            , "Credit Card", "Payment method is not match!");
//        2.51 Verify the “Shipping Method”is “2 nd Day Air”
    Assert.assertEquals(checkOutPage.getShippingMethod(),
            "2nd Day Air", "Shipping Method is not matched!");
//        2.52 Verify the Total is “200.00”
    Assert.assertEquals(checkOutPage.getTotalPrice(), "200.00",
            "Total price mismatch!");
//        2.53 Click on the “Confirm”button
    checkOutPage.clickOnConfirmButton();
//        2.54 Verify the Text “Thank You”
    Assert.assertEquals(checkOutPage.getTitleOfThankYou(), "Thank you",
            "Thank you message mismatch!");
//        2.55 Verify the message “Your order has been successfully processed !”
    Assert.assertEquals(checkOutPage.getSuccessMessageOfOrderSuccessfullyProcessed(),
            "Your order has been successfully processed!", "order successfully message not matched!");
//        2.56 Click on the “Continue”button
    checkOutPage.clickOnContinueOrderCompleteButton();
//        2.57 Verify the text “Welcome to our store”
    Assert.assertEquals(homePage.getMessageOfWelcomeOurStore(), "Welcome to our store",
            "Welcome message mismatch!");

//        2.58 Click on the “Logout”link
    homePage.clickOnLogOutButton();
//        2.59 Verify the URL is “https://demowebshop.tricentis.com/”
    Assert.assertTrue(homePage.getCurrentUrl().contains("https://demowebshop.tricentis.com"),
            "Url is not match!");

    }
}
