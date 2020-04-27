package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tests.BaseClass;

public class Suggestions extends BaseClass {
	
	@AndroidFindBy (id = "texttitle1")
	private MobileElement PageTitle;
	
	@AndroidFindBy (id = "sname")
	private MobileElement Nametxtfield;
	
	@AndroidFindBy (id = "semail")
	private MobileElement Emailtxtfield;
	
	@AndroidFindBy (id = "ssugg")
	private MobileElement Suggestionstxtfield;
	
	@AndroidFindBy (id = "ssubmit")
	private MobileElement SubmitBtn;
	
	@AndroidFindBy (id = "sreset")
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

		public void emailTxtField(String email) {
			sendKeys(Emailtxtfield, email);
		}
		
		public void suggestionsTxtfield(String suggestions) {
			sendKeys(Suggestionstxtfield, suggestions);
		}

		public void nameTxtField(String name) {
			sendKeys(Nametxtfield, name);
			
		}

}
