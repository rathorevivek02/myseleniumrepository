package testPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo {
static ExtentTest test;
static ExtentReports report;
static WebDriver driver;
		@BeforeClass
		public static void startTest(){
			report = new ExtentReports(System.getProperty("user.dir")+"\\Reports\\ExtentReportResults.html");
			test = report.startTest("ExtentDemo");
		}
		@Test(priority =1)
		public void OpenUrl(){
			System.setProperty("webdriver.chrome.driver", "D:\\SetUp\\TESTING\\Driver\\Chrome Versions\\chromedriver_win32_7\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
			test.log(LogStatus.INFO, "URL Opened");
		}
		
		@Test(priority =2)
		public void Validate() {
		 if(driver.getTitle().equals("Google")){
			test.log(LogStatus.PASS, "Validate URL Pass");
		 }else{
			test.log(LogStatus.FAIL, "Validate URL Fail");
			 }
		}
		@AfterClass
		public static void endTest(){
			report.endTest(test);
			report.flush();
			driver.close();
	}
	}
