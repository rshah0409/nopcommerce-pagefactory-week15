package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger( RegisterPage.class.getName() );

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement clickOnRegTab;
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement regPageText;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickOnRegButton;
    @FindBy(xpath = "//span[text()='First name is required.']")
    WebElement firstNameErrorMsg;
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderButton;
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/input[1]")
    WebElement firstName;
    @FindBy(id = "LastName")
    WebElement lastName;
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirth;
    @FindBy(name = "DateOfBirthMonth")
    WebElement birthMonth;
    @FindBy(name = "DateOfBirthYear")
    WebElement birthYear;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Company")
    WebElement companyField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement regSuccess;
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logOut;



    public void clickOnRegisterTab() {
        Reporter.log( "Clicking On RegisterTab" + clickOnRegTab.toString() );
        clickOnElement( clickOnRegTab );
        log.info( "Clicking On RegisterTab" + clickOnRegTab.toString() );
    }

    public String regPageTextIs() {
        Reporter.log( "Get Register Page Text" + regPageText.toString() );
        log.info( "Get Register Page Text" + regPageText.toString() );
        return getTextFromElement( regPageText );
    }

    public void clickOnRegButton() {
        waitUntilVisibilityOfElementLocated( clickOnRegButton, 20 );
        Reporter.log( "Clicking On Register Button" + clickOnRegButton.toString() );
        mouseHoverToElement( clickOnRegButton );
        clickOnElement( clickOnRegButton );
        log.info( "Clicking On Register Button" + clickOnRegButton.toString() );
    }

    public String getFirstNameErrorMessage() {
       // waitUntilVisibilityOfElementLocated( firstNameErrorMsg,10 );
        Reporter.log( "Get first name error  message" + firstNameErrorMsg.toString() );
        log.info( "Get first name error  message" + firstNameErrorMsg.toString() );
        return getTextFromElement( firstNameErrorMsg );
    }

    public void clickOnGenderradioButton() {

        Reporter.log( "Clicking On gender radio button" + genderButton.toString() );
      //  waitUntilVisibilityOfElementLocated( genderButton, 5 );
        clickOnElement( genderButton );
        log.info( "Clicking On gender radio button" + genderButton.toString() );
    }

    public void firstNameField(String str) {
        Reporter.log( "firstname field" + firstName.toString() +"with" + str );
      //  waitUntilVisibilityOfElementLocated( firstName,10 );
        sendTextToElement( firstName, str );
        log.info( "firstname field" + firstName.toString() );
    }

    public void lastNameField(String str) {
        Reporter.log( "Lastname field" + lastName.toString() + "with" + str );
        sendTextToElement( lastName, str );
        log.info( "Lastname field" + lastName.toString() );
    }

    public void selectBirthDateMonthAndYear(String date, String month, String year) {
        Reporter.log( "select birth date,month and year  " + dateOfBirth.toString() + birthMonth.toString() + birthYear.toString() );
        selectByValueFromDropDown( dateOfBirth, date );
        selectByValueFromDropDown( birthMonth, month );
        selectByValueFromDropDown( birthYear, year );
        log.info( "select birth date,month and year  " + dateOfBirth.toString() + birthMonth.toString() + birthYear.toString() );
    }

    public void enterEmailField(String email) {
        Reporter.log( "Email field" + emailField.toString() + "with" + email );
        sendTextToElement( emailField, email );
        log.info( "Email field" + emailField.toString() + "with" + email );

    }

    public void enterCompanynameField(String companyName) {
        Reporter.log( "Email field" + companyField.toString() + "with" + companyName );
        sendTextToElement( companyField, companyName );
        log.info( "Email field" + companyField.toString() + "with" + companyName );

    }

    public void enterPasswordField(String passWord) {
        Reporter.log( "Password field" + passwordField.toString() + "with" + passWord );
        sendTextToElement( passwordField, passWord );
        log.info( "Password field" + passwordField.toString() + "with" + passWord );

    }

    public void enterConfirmPasswordField(String confirmpassWord) {
        Reporter.log( "Confirm Password field" + confirmPasswordField.toString() + "with" + confirmpassWord );
        sendTextToElement( confirmPasswordField, confirmpassWord );
        log.info( "Confirm Password field" + confirmPasswordField.toString() + "with" + confirmpassWord );
    }
    public String regPageSuccessTextIs() {
        Reporter.log( "Get Registration successfully Page Text" + regSuccess.toString() );
        log.info( "Get Registration successfully Page Text" + regSuccess.toString() );
        return getTextFromElement( regSuccess );
    }

    public void clickOnLogOutButton(){
      //  waitUntilVisibilityOfElementLocated( logOut,2 );
        Reporter.log( "Clicking On Logout Tab" + logOut.toString() );
     //   mouseHoverToElement( logOut );
        clickOnElement( logOut );
        log.info( "Clicking On Logout Tab" + logOut.toString() );
    }

}