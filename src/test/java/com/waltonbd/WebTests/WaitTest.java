package com.waltonbd.WebTests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.FramesPage;
import com.waltonbd.WebPages.WaitPage;

public class WaitTest extends BaseTest {

	public WaitTest(String url) {
		super("https://www.hyrtutorials.com/p/waits-demo.html");
		
	
	}

	@Test(priority = 1, enabled = true)
	public void openFramesPage() {

		Assert.assertEquals(page.getPageTitle(), "Waits Demo - H Y R Tutorials");
		System.out.println("Page Title: " + page.getPageTitle());

	}

	@Test(priority = 2, enabled = true)
	public void openAndInputFrames() {

		WaitPage wPage = page.getInstance(WaitPage.class);
		wPage.inputText();
		

	}

}
