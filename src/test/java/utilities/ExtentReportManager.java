package utilities;

import java.nio.charset.CharsetEncoder;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			CreateInstance("c:/abiba/selenium-extent.html");
		}
		return extent;

	}

	public static ExtentReports CreateInstance(String fileName) {
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter(fileName);
		htmlReport.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlReport.config().setChartVisibilityOnOpen(true);
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setDocumentTitle("Selenium Automation Report");
		htmlReport.config().setEncoding("utf-8");
		htmlReport.config().setReportName(fileName);
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		return extent;

	}

}
