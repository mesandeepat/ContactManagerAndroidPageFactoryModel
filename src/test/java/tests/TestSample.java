package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactManagerMenu;
import pages.ContactUS;
import pages.SetAPassword;
import pages.Suggestions;

public class TestSample extends BaseClass {
	
	@Test
	public void Test_EnteringContactDetails() {

		ContactManagerMenu ContactManager = new ContactManagerMenu();
		ContactManager.clickContactBackupRestoreTab();
		
		ContactManager.clickBackUpContacts();

		String actualTxt = ContactManager.validateBackUpCompletedMessage();
		String expectedTxt = "Backup Completed";
		Assert.assertEquals(actualTxt, expectedTxt);
		System.out.println("actualmsg" + actualTxt + "\n" + "expectedmsg" + expectedTxt);

		ContactManager.clickOKButton();
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

	}

