package tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.ContactManagerMenu;
import pages.ContactUS;
import pages.SetAPassword;
import pages.Suggestions;

public class TestSample extends BaseClass {

	@BeforeSuite(alwaysRun = true)
	public void configureDevices() throws Exception {
		configureExtentReport();
	}
	
	@BeforeMethod
   public void launchApp() {
		launchApp();
	}
	
	@Test
	public void Test_EnteringContactDetails() {

		startReport("Verify Login Succesfull");
		
		printOnReport("Logged in Succesfully");
//		// creates a toggle for the given test, adds all log events under it    
//		ExtentTest testOne = extent.createTest("TestOne", "EnteringContactDetails");
//
//		testOne.log(Status.INFO, "Test One started");
//
//		//ContactManagerMenu ContactManager = new ContactManagerMenu();
//		//ContactManager.clickContactBackupRestoreTab();
//		testOne.log(Status.PASS, "Clicked ContactBackupRestore tab");
//
//		//ContactManager.clickBackUpContacts();
//		testOne.log(Status.PASS, "Clicked BackupContacts button");
//
////		String actualTxt = ContactManager.validateBackUpCompletedMessage();
////		String expectedTxt = "Backup Completed";
////		Assert.assertEquals(actualTxt, expectedTxt);
////		System.out.println("actualmsg" + actualTxt + "\n" + "expectedmsg" + expectedTxt);
////
////		ContactManager.clickOKButton();
//		testOne.log(Status.PASS, "Clicked OK button");
//		
//		testOne.log(Status.INFO, "Test is completed");
	}

	public void Test_SetPassword() {
		ContactManagerMenu ContactManager = new ContactManagerMenu();
		SetAPassword SetPassword = new SetAPassword();

		ContactManager.clickSetPassword();

		String actualtitle = SetPassword.validateTitle();
		String expectedtitle = "Set a Password";
		System.out.println("actualtitle" + actualtitle + "\n" + "expectedtitle" + expectedtitle);
		Assert.assertEquals(actualtitle, expectedtitle);

		SetPassword.enterPassword("12345");
		SetPassword.clickSubmitBtn();
	}

	public void Test_ResetPassword() {
		ContactManagerMenu ContactManager = new ContactManagerMenu();
		SetAPassword SetPassword = new SetAPassword();

		ContactManager.clickSetPassword();
		SetPassword.enterPassword("12345");
		SetPassword.clickResetBtn();
	}

	// Failing test cases by providing wrong values and asserting
	public void Test_SubmittingSuggestions_FailingTestCaseAtAssertion() {
		ContactManagerMenu ContactManager = new ContactManagerMenu();
		Suggestions suggestion = new Suggestions();

		ContactManager.clickSuggestion();

		String actualtitle = suggestion.validateTitle();
		String expectedtitle = "Suggestions";

		System.out.println("Actual title" + actualtitle + "\n" + "expected tile" + expectedtitle);
		Assert.assertEquals(actualtitle, expectedtitle);

		suggestion.nameTxtField("Test");
		suggestion.emailTxtField("abc@gmail.com");
		suggestion.suggestionsTxtfield("Submitting Suggestions");
		suggestion.clickSubmitBtn();

	}

	public void Test_SubmittingSuggestions() {
		ContactManagerMenu ContactManager = new ContactManagerMenu();
		Suggestions suggestion = new Suggestions();

		ContactManager.clickSuggestion();

		String actualtitle = suggestion.validateTitle();
		String expectedtitle = "Suggestion";

		System.out.println("Actual title" + actualtitle + "\n" + "expected tile" + expectedtitle);
		Assert.assertEquals(actualtitle, expectedtitle);

		suggestion.nameTxtField("Test");
		suggestion.emailTxtField("abc@gmail.com");
		suggestion.suggestionsTxtfield("Submitting Suggestions");
		suggestion.clickSubmitBtn();
	}

	public void Test_ValidateContactUsTitle() {
		ContactManagerMenu ContactManager = new ContactManagerMenu();
		ContactManager.clickContactUs();

		ContactUS contact = new ContactUS();
		String actualtitle = contact.validateTitle();
		String expectedtitle = "Contact Us";

		System.out.println("Actual title" + actualtitle + "\n" + "expected tile" + expectedtitle);
		Assert.assertEquals(actualtitle, expectedtitle);

	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult result) {
		endExtentReport(result, driver);
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		eReport.close();

	}
}
