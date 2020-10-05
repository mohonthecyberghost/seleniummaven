package com.waltonbd.WebTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.FramesPage;
import com.waltonbd.WebPages.LocatorsPage;

public class LocatorsTest extends BaseTest {

	public LocatorsTest(String url) {
		//super("https://www.facebook.com");
		
		//super("https://www.hyrtutorials.com/p/basic-controls.html");
		
		//super("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		super("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	}

	@Test(priority = 1, enabled = false)
	public void openLocatorsPage() {

		Assert.assertEquals(page.getPageTitle(), "Facebook – log in or sign up");
		System.out.println("Page Title: " + page.getPageTitle());

	}

	@Test(priority = 2 , enabled = false)
	public void elementsOperation() {

		page.getInstance(LocatorsPage.class).elementsOperation();
		


	}
	
	
	@Test(priority = 3 , enabled = false)
	public void htmlControlsOperation() throws InterruptedException {

		page.getInstance(LocatorsPage.class).htmlControlsOperation();
		


	}
	
	@Test(priority = 4 , enabled = true)
	public void htmlDropDownsOperation() throws InterruptedException {

		page.getInstance(LocatorsPage.class).htmlDropDownsOperation();
		


	}
	
	@Test(priority = 5 , enabled = true)
	public void xpathOperation() throws InterruptedException {

		page.getInstance(LocatorsPage.class).xpathOperation();
		


	}
}
