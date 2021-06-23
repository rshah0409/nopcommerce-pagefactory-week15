package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ComputersTest extends TestBase {
    ComputersPage computersPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod(alwaysRun = true)
    public void registerPageSetUp(){
        computersPage=new ComputersPage();
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void navigateToDesktopAndVerify() throws InterruptedException {
        computersPage.hoverComputerTab();
        computersPage.clickOnDesktopOption();
        Thread.sleep( 1000 );
        String expectedDesktoptext = "Desktops";
        String actualDesktopText = computersPage.getDeskTopText();
        softAssert.assertEquals(expectedDesktoptext, actualDesktopText);
        softAssert.assertTrue( false );
    }

    @Test(groups = {"smoke", "regression"})
    public void navigateToNotebooksAndVerify() throws InterruptedException {
        computersPage.hoverComputerTab();
        computersPage.clickOnNoteBookOption();
        String expectedNotebookText = "Notebooks";
        String actualNotebookText = computersPage.getNotebookText();
        softAssert.assertEquals(expectedNotebookText, actualNotebookText);
        softAssert.assertTrue( false );
    }

    @Test(groups = {"regression"})
    public void navigateToSoftwareAndverify() throws InterruptedException {
        computersPage.hoverComputerTab();
        computersPage.clickOnSoftwareOption();
        String expectedSoftwareText = "Softwares";
        String actualSoftwareText = computersPage.getSoftwareText();
        softAssert.assertEquals(actualSoftwareText,expectedSoftwareText);
        softAssert.assertTrue( false );
    }


}


