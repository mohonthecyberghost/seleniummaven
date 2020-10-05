package com.waltonbd.WebTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.AboutPage;
import com.waltonbd.WebPages.FramesPage;
import com.waltonbd.WebPages.WindowPage;

public class WindowTest extends BaseTest {

	public WindowTest(String url) {
		super("https://www.hyrtutorials.com/p/window-handles-practice.html");
	}

	@Test(priority = 1, enabled = false)
	public void openWindowPage() {

		Assert.assertEquals(page.getPageTitle(), "Window Handles Practice - H Y R Tutorials");
		System.out.println("Page Title: " + page.getPageTitle());

	}

	@Test(priority = 2, enabled = false)
	public void openNewWindow() {
		page.getInstance(WindowPage.class).openNewWindow();
		

	}
	
	@Test(priority = 3, enabled = false)
	public void openNewTab() {
		page.getInstance(WindowPage.class).openNewTab();
		

	}
	
	@Test(priority = 3, enabled = false)
	public void openMultipleWindows() {
		page.getInstance(WindowPage.class).openMultipleWindows();
		

	}
	
	@Test(priority = 3, enabled = true)
	public void openMultipleWindowsTabs() {
		page.getInstance(WindowPage.class).openMultipleWindowsTabs();
		

	}
}
