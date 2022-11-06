package utility;


import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
	}
	
	public void onTestFailure(ITestResult result) {
		Screenshot.takeScreenShot(driver, result.getName());
	}
	
	public void skipp(ITestResult result) {
		
	}

}
