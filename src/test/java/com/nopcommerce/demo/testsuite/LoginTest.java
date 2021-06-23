package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    SoftAssert softAssert =  new SoftAssert();

    @BeforeMethod(alwaysRun = true)
    public void setPageUp(){

        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserNevigateToLoginPage(){
        loginPage.clickOnLoginTab();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        String actualWelcomText = loginPage.welcomePageTextIs();
        softAssert.assertEquals( actualWelcomText,expectedWelcomeText );
        softAssert.assertTrue( true );

    }
    @Test(groups = {"smoke","regression"})
    public void verifyErrorMessageWithInvalidCredentials() throws InterruptedException {
        loginPage.clickOnLoginTab();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        String actualWelcomText = loginPage.welcomePageTextIs();
        softAssert.assertEquals( actualWelcomText,expectedWelcomeText );
        softAssert.assertTrue( true );
        loginPage.enterEmail( "yahoo@gmail.com" );
        loginPage.clickOnLoginButton();
        String expectedErrorMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMsg=loginPage.getErrorMsg();
        softAssert.assertEquals( actualErrorMsg,expectedErrorMsg );
        softAssert.assertTrue( true );


    }
    @Test(groups = "regression")
    public void verifySuccessfulLogin() throws InterruptedException {
        loginPage.clickOnLoginTab();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        String actualWelcomText = loginPage.welcomePageTextIs();
        softAssert.assertEquals( actualWelcomText,expectedWelcomeText );
        softAssert.assertTrue( true );
        loginPage.enterEmail( "bigbangtheory302@yahoo.com" );
        loginPage.enterPasswordField( "password302" );
        Thread.sleep( 1000 );
        loginPage.clickOnLoginButton();
        String expectedHomePageText="Welcome to our store";
        String actualHomePageText = loginPage.getHomePageText();
        softAssert.assertEquals( actualHomePageText,expectedHomePageText );
        softAssert.assertTrue( true );



    }
}
