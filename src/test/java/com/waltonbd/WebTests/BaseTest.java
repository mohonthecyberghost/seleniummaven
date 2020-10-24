/**
 * 
 */
package com.waltonbd.WebTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.waltonbd.WebPages.BasePage;
import com.waltonbd.WebPages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Sazzad Ahmmed Mohon
 *
 */
public class BaseTest {

	WebDriver driver;

	public Page page;

	private String url = "";

	public BaseTest(String url) {
		this.url = url;
	}

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setUpTest(String browser) {
		
		// Optional
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		
		
		if (browser.equals("chrome")) {
			// Optional
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			//options.addArguments("--incognito");
			options.merge(caps);
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			
		}

		else if (browser.equals("ff")) {
			// Optional
			//FirefoxOptions options = new FirefoxOptions();
			//options.merge(caps);
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("No Browser is defined in xml file....");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		// Default value 0 Seconds implicit timeout
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		// Default value 300 Seconds pageload timeout
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		
	

		driver.get(this.url);

		System.out.println("URL: " + this.url);
//		
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
		page = new BasePage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
