package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterTest extends TestBase {
    RegisterPage registerPage;
    SoftAssert softAssert = new SoftAssert();
    @BeforeMethod(alwaysRun = true)
    public void setPageUp(){
        registerPage = new RegisterPage();
    }

    @Test(groups ={ "sanity","smoke","regression"})
    public void clickOnRegTabAndVerifyPageText(){
        registerPage.clickOnRegisterTab();
        String expectedRegPageText = "Register";
        String actualRegPageText = registerPage.regPageTextIs();
        softAssert.assertEquals( actualRegPageText,expectedRegPageText );
        softAssert.assertTrue( true );

    }
    @Test(groups = {"smoke","regression"})
    public void clickOnRegisterTabAndKeepFirstNameEmptyAndClickOnRegisterButtonAndVerify() throws InterruptedException {
        registerPage.clickOnRegisterTab();
        String expectedRegPageText = "Register";
        String actualRegPageText = registerPage.regPageTextIs();
        softAssert.assertEquals( actualRegPageText,expectedRegPageText );
        softAssert.assertTrue( true );
        Thread.sleep( 1000 );
        registerPage.clickOnRegButton();
        String expectedFirstNameErrorMsg = "First name is required.";
        String actualFirstNameErrorMsg = registerPage.getFirstNameErrorMessage();
        softAssert.assertEquals( actualFirstNameErrorMsg,expectedFirstNameErrorMsg );
        softAssert.assertTrue( true );

    }

    @Test(groups = "regression")
    public void clickOnRegTabAndFillInAllDetailsAndVerifyRegisterSuccessfully() throws InterruptedException {
        registerPage.clickOnRegisterTab();
        String expectedRegPageText = "Register";
        String actualRegPageText = registerPage.regPageTextIs();
        softAssert.assertEquals( actualRegPageText,expectedRegPageText );
        softAssert.assertTrue( true );
        Thread.sleep( 1000 );
        registerPage.clickOnGenderradioButton();
        registerPage.firstNameField( "PennyH" );
        registerPage.lastNameField( "Hofsteder" );
        registerPage.selectBirthDateMonthAndYear( "4","4","1994" );
        registerPage.enterEmailField( "bigbangtheory121@gmail.com" );
        registerPage.enterCompanynameField( "Princeton" );
        registerPage.enterPasswordField( "BigBangTheory" );
        registerPage.enterConfirmPasswordField( "BigBangTheory" );
        registerPage.clickOnRegButton();
        String expectedRegMessage = "Your registration completed";
        String actualRegmessage =registerPage.regPageSuccessTextIs();
        softAssert.assertEquals(actualRegmessage,expectedRegMessage);
        softAssert.assertTrue( true );
        Thread.sleep( 1000 );
        registerPage.clickOnLogOutButton();
      //  softAssert.assertAll();
    }


}
