package com.waltonbd.WebTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.ScreenshotsPage;

public class ScreenshotsTest extends BaseTest {

	public ScreenshotsTest(String url) {
		super("https://www.w3schools.com/");
	}

	@Test(priority = 1, enabled = false)
	public void openFramesPage() {

		Assert.assertEquals(page.getPageTitle(), "Frames Practice - H Y R Tutorials");
		System.out.println("Page Title: " + page.getPageTitle());

	}

	@Test(priority = 2,  enabled = true)
	public void captureScreenshots() throws IOException {

		page.getInstance(ScreenshotsPage.class).captureScreenshots();

	}

}
