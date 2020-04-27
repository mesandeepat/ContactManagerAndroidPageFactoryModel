//package tests;
//
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//
//public class ExtentReportsDemo {
//	
//	//ExtentHtmlReporter htmlReporter;
//	ExtentReports extent;
//
//	@BeforeSuite
//	public void reportSetup() {
//		//htmlReporter = new ExtentHtmlReporter("extent.html");
//
//		//htmlReporter = new ExtentHtmlReporter("C:\\Users\\sandeep.kumar\\workspace\\AppiumAndroidProject\\src\\test\\resources\\Resources");
//		// create ExtentReports and attach reporter(s)
//		 extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
//
//	}
//
//	@AfterSuite
//	public void reportTeardown() {
//		extent.flush();
//	}
//}
