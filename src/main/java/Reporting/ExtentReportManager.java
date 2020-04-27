package Reporting;

import java.util.HashMap;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportManager {
	private static ExtentReports eReport;
	//// private static ReadPropsFile readPropsFile;
	private static HashMap<String, String> map;

	public synchronized static ExtentReports getReporter(String filePath) {
		// readPropsFile = new ReadPropsFile();
		// map = readPropsFile.fetchConfigDetails();
		if (eReport == null) {
			eReport = new ExtentReports(filePath, false);

//			eReport.addSystemInfo("UserName : ", System.getProperty("user.name"))
//					.addSystemInfo("Environment : ", "Staging")
//					.addSystemInfo("Device MCD : ", map.get("deviceMCD").toString())
//					.addSystemInfo("Device Name :", map.get("DeviceName").toString());
		}

		return eReport;
	}
}
