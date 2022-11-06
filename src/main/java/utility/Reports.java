package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
public static ExtentReports createReports() {
		
		ExtentSparkReporter html = new ExtentSparkReporter("swaglab.html");
		
		ExtentReports reports = new ExtentReports();
		
		reports.attachReporter(html);
		
		reports.setSystemInfo("CreatedBy", "Kunal");
		reports.setSystemInfo("Testing", "Regression");
		reports.setSystemInfo("Env", "QA");
		return reports;
	}
}
