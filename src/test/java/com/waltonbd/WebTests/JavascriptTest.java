package com.waltonbd.WebTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.JavascriptPage;

public class JavascriptTest extends BaseTest {

	public JavascriptTest(String url) {
		super("http://demo.automationtesting.in");
	}

	@Test(priority = 1, enabled = false)
	public void openWindowPage() {

		Assert.assertEquals(page.getPageTitle(), "Index");
		System.out.println("Page Title: " + page.getPageTitle());

	}

	@Test(priority = 2, enabled = false)
	public void inputFieldValue() throws InterruptedException {
		page.getInstance(JavascriptPage.class).inputFieldValue();
		

	}
	
	
	@Test(priority = 3, enabled = true)
	public void pageScrolling() throws InterruptedException {
		page.getInstance(JavascriptPage.class).pageScrolling(false);
		

	}
	
	
	
}
