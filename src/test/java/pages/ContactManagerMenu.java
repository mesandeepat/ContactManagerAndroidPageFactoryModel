package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tests.BaseClass;

public class ContactManagerMenu extends BaseClass {
	
	@AndroidFindBy (id = "textView2ss")
	private MobileElement ContactBackupRestore;
	
	@AndroidFindBy (id = "textView2sss")
	private MobileElement ManageDuplicateContacts;
	
	@AndroidFindBy (id = "textView2")
	private MobileElement SetPassword;

	@AndroidFindBy (id = "textView3")
	private MobileElement ContactUs;			
				
	@AndroidFindBy (id = "textView4")
	private MobileElement RateUs;	
	
	@AndroidFindBy (id = "textView5")
	private MobileElement ShareIt;	
	
	@AndroidFindBy (id = "textView6")
	private MobileElement Suggestion;	
	
	@AndroidFindBy (id = "brtextView2ss")
	private MobileElement BackUpContacts;	

	@AndroidFindBy (id = "brtextView2")
	private MobileElement RestoreContacts;
	
	@AndroidFindBy (id = "alertTitle")
	private MobileElement BackUpCompletedMsg;
	
	@AndroidFindBy (id = "button1")
	private MobileElement CompletedMsgOKButton;
	
	public void clickContactBackupRestoreTab() {
	 click(ContactBackupRestore);
	}
	
	public void clickBackUpContacts() {
	 click(BackUpContacts);
	}
	
	public void clickOKButton() {
	 click(CompletedMsgOKButton);
	}
	
    public void clickRestoreContacts() {
	 click(RestoreContacts);
	}
	
	public void clickManageDuplicateContacts() {
	 click(ManageDuplicateContacts);
	}
	
    public void clickSetPassword() {
	 click(SetPassword);
	}
    
    public void clickContactUs() {
	 click(ContactUs);
	}
    
   public void clickRateUs() {
	 click(RateUs);
	}
   
   public void clickShareIt() {
	 click(ShareIt);
	}
   
   public void clickSuggestion() {
	 click(Suggestion);
	}

   public String validateBackUpCompletedMessage() {
	 return getAttribute(BackUpCompletedMsg, "text");
	 
   }
}

