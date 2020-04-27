package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tests.BaseClass;

public class ContactUS extends BaseClass {
	
	@AndroidFindBy (id = "texttitle1")
	private MobileElement PageTitle;
	
	@AndroidFindBy (id = "crname")
	private MobileElement NameTxtField;
	
	@AndroidFindBy (id = "crcontact")
	private MobileElement ContactNumberTxtField;
	
	@AndroidFindBy (id = "cremail")
	private MobileElement EmailTxtField;
	
	@AndroidFindBy (id = "crsubmit2")
	private MobileElement SubmitBtn;
	
	@AndroidFindBy (id = "crreset2")
	private MobileElement ResetBtn;
	
	public String validateTitle() {
		  return getAttribute(PageTitle, "text");
		}
		
		public void clickSubmitBtn() {
			click(SubmitBtn);
		}

		public void clickResetBtn() {
			click(ResetBtn);
		}

		public void nameTxtField(String name) {
			sendKeys(NameTxtField, name);
		}
		
		public void contactTxtfield(String contactNumber) {
			sendKeys(ContactNumberTxtField, contactNumber);
		}

		public void emailTxtField(String email) {
			sendKeys(EmailTxtField, email);
			
		}


}
