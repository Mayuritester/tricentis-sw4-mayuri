package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility {

    By selectOption= By.id("products-orderby");
    By productElements = By.xpath("//h2[@class='product-title']/a");
    public void verifyProductArrangeInDescendingOrder (){

    }

    public void sortProductByNameZtoA(String option){
        selectByVisibleTextFromDropDown(selectOption,option);
    }

    public List<WebElement> getListOfProduct(){
        return getWebElements(productElements);
    }
    public void clickOnAddToCartOfYourSelectedProduct(String name){
        clickOnElement(By.linkText(name));
    }


}
