package com.waltonbd.WebTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.AlertPage;

public class AlertTest extends BaseTest {

	public AlertTest(String url) {
		super("https://www.hyrtutorials.com/p/alertsdemo.html");
	}

	@Test(priority = 1, enabled = false)
	public void openWindowPage() {

		Assert.assertEquals(page.getPageTitle(), "AlertsDemo - H Y R Tutorials");
		System.out.println("Page Title: " + page.getPageTitle());

	}

	@Test(priority = 2, enabled = false)
	public void simpleAlertHandle() {
		page.getInstance(AlertPage.class).simpleAlertHandle();
		

	}
	
	@Test(priority = 3, enabled = false)
	public void confirmationAlertHandle() {
		page.getInstance(AlertPage.class).confirmationAlertHandle();
		

	}
	
	@Test(priority = 4, enabled = true)
	public void promptAlertHandle() {
		page.getInstance(AlertPage.class).promptAlertHandle();
		

	}
	
	
}
