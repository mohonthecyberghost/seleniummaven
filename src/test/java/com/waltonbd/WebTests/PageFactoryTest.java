package com.waltonbd.WebTests;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.AlertPage;
import com.waltonbd.WebPages.PageFactoryPage;

public class PageFactoryTest extends BaseTest {
	
	Logger log = Logger.getLogger(Log4jTest.class);

	public PageFactoryTest(String url) {
		super("https://www.hyrtutorials.com/p/css-selectors-practice.html");
	}

	@Test(priority = 1, enabled = false)
	public void openWindowPage() {
		
		log.info("Page Title :"+page.getPageTitle());

		Assert.assertEquals(page.getPageTitle(), "AlertsDemo - H Y R Tutorials");
		System.out.println("Page Title: " + page.getPageTitle());
		
		

	}

	
	@Test(priority = 2, enabled = true)
	public void checkFactoryFunction() {

		log.info("checkFactoryFunction..................");
		
//		PageFactoryPage pagefactoryPage =  page.getInstance(PageFactoryPage.class);
		PageFactoryPage pagefactoryPage =  PageFactory.initElements(driver, PageFactoryPage.class);
		pagefactoryPage.pageFunctions("Sazzad","Ahmmed");

	}

	
	
}
