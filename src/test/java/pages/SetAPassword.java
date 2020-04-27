package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tests.BaseClass;

public class SetAPassword extends BaseClass {
	
	@AndroidFindBy (id = "texttitle1")
	private MobileElement PageTitle;
	
	@AndroidFindBy (id = "crpass")
	private MobileElement Passwordtxtfield;
	
	@AndroidFindBy (id = "crsubmit")
	private MobileElement SubmitBtn;
	
	@AndroidFindBy (id = "crreset")
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

	public void enterPassword(String password) {
		sendKeys(Passwordtxtfield, password);
	}
}
