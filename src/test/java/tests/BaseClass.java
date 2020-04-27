package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
//	protected static ExtentTest eTest;
//	protected static ExtentReports eReport;
//	public static String dateStr;

	public static AppiumDriver<MobileElement> driver;
//
	 public BaseClass() {
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }

	@BeforeTest
	public void launchApp() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme U1");
			caps.setCapability(MobileCapabilityType.UDID, "OJ7TRCZSFELRDUOF");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			// caps.setCapability(MobileCapabilityType.APP, "");
			caps.setCapability("appPackage", "in.smartappcart.contactmanager");
			caps.setCapability("appActivity", "in.smartappcart.contactmanager.Sactivity");

			// Appium server details
			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, caps);
			//String sessionId = driver.getSessionId().toString();

		} catch (Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println(("Message is : " + exp.getMessage()));
			exp.printStackTrace();
		}

	}

	// Explicit wait method
	public void waitForVisibility(MobileElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	// Methods for driver commands

	// Click command method
	public void click(MobileElement e) {
		waitForVisibility(e);
		e.click();
	}

	// sendKeys command method
	public void sendKeys(MobileElement e, String txt) {
		waitForVisibility(e);
		e.sendKeys(txt);
	}

	// getAttribute command method
	public String getAttribute(MobileElement e, String attribute) {
		waitForVisibility(e);
		return e.getAttribute(attribute);
	}

//	public void configureExtentReport() throws IOException {
//		System.out.println("In Before Suite");
//		cleanReports();
//		createReportDirectories();
//		SimpleDateFormat df = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
//		dateStr = df.format(new java.util.Date());
//		System.out.println(System.getProperty("user.dir") + "\\reports\\TestReport.html");
//		final String filePath = System.getProperty("user.dir") + "\\reports\\TestReport.html";
//		eReport = ExtentReportManager.getReporter(filePath);
//		System.out.println("Exiting Before Suite");
//	}
//
//	public void endExtentReport(ITestResult result, AppiumDriver driver) {
//		eReport.endTest(eTest);
//		if (result.getStatus() == ITestResult.FAILURE) {
//			// String screenshotPath = CaptureScreenshot.get(result.getName(), driver,
//			// dateStr);
//			// System.out.println("screenshotPath.................." + screenshotPath);
//			eTest.log(LogStatus.FAIL, result.getThrowable());
//		} else if (result.getStatus() == ITestResult.SKIP) {
//			eTest.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
//		} else {
//			eTest.log(LogStatus.PASS, "Test passed");
//		}
//		eReport.endTest(eTest);
//		eReport.flush();
//	}
//
//	public void startReport(String scenarioName) {
//		eTest = eReport.startTest(scenarioName);
//	}
//
//	public void printOnReport(String messageToPrint) {
//		System.out.println(messageToPrint);
//		eTest.log(LogStatus.PASS, messageToPrint);
//		Reporter.log(messageToPrint);
//	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
