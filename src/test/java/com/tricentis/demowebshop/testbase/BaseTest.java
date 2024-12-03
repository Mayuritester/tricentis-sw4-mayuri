package com.tricentis.demowebshop.testbase;

import com.tricentis.demowebshop.propertyreader.Propertyreader;
import com.tricentis.demowebshop.utilities.Utility;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = Propertyreader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setup (){
        selectBrowser(browser);
    }


    //    @AfterMethod
//    public void tearDown (){
//        closeBrowser();
//
//    }
}
