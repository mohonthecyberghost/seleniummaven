package com.waltonbd.WebTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.FramesPage;

public class FramesTest extends BaseTest {

	public FramesTest(String url) {
		super("https://www.hyrtutorials.com/p/frames-practice.html");
	}

	@Test(priority = 1, enabled = false)
	public void openFramesPage() {

		Assert.assertEquals(page.getPageTitle(), "Frames Practice - H Y R Tutorials");
		System.out.println("Page Title: " + page.getPageTitle());

	}

	@Test(priority = 2)
	public void openAndInputFrames() {

		FramesPage fPage = page.getInstance(FramesPage.class);
		fPage.inputText();
//		fPage.selectCourse();
		fPage.selectNestedCourse();

//		Assert.assertEquals(page.getPageTitle(), "Frames Practice - H Y R Tutorials");
//		System.out.println("Page Title: "+page.getPageTitle());

	}

}
