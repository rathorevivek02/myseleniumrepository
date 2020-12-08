package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Maven1 {
	public WebDriver driver ;   
	
	@Test             
	public void test() {      
		System.setProperty("webdriver.chrome.driver","D:\\SetUp\\TESTING\\Driver\\Chrome Versions\\chromedriver_win32_7\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.get("https://www.gmail.com");  
		String URL= driver.getCurrentUrl();  
		System.out.print(URL);  
		String title = driver.getTitle();                  
		System.out.println(title);  
	}     
	@BeforeTest  
	public void beforeTest() {    
		System.out.println("before test");  
	}     
	@AfterTest  
	public void afterTest() {  
		driver.quit();  
		System.out.println("after test");  
	}
}
