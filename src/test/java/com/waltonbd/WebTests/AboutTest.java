package com.waltonbd.WebTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.AboutPage;



public class AboutTest extends BaseTest{
	

	public AboutTest(String url) {
		super("https://waltonbd.com/"+"about");
	}
	
	
	@Test (priority=1)
	public void verifyPageHeadersTest() {
		
		Assert.assertEquals(page.getPageTitle(), "About Walton");
		
				
		String header = page.getInstance(AboutPage.class).getAboutPageHeader();
		Assert.assertEquals(header, "Who We Are");
		
		
		System.out.println("Page Title: "+page.getPageTitle());
		System.out.println("Header: "+header);
	}

}
