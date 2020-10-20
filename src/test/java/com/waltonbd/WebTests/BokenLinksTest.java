package com.waltonbd.WebTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.BrokenLinksPage;
import com.waltonbd.WebPages.ProductsPage;

public class BokenLinksTest extends BaseTest {

	public BokenLinksTest(String url) {
		// super("https://www.hyrtutorials.com/");
		super("https://www.theworldsworstwebsiteever.com/");
	}

	@Test(priority = 1, enabled = false)
	public void verifyLinksPage() throws IOException {
		page.getInstance(BrokenLinksPage.class).verifyLinksPage();
		System.out.println("Page Title: " + page.getPageTitle());
	}

	@Test(priority = 2, enabled = false)
	public void verifyImagesPage() throws IOException {
		page.getInstance(BrokenLinksPage.class).verifyImagesPage();
		System.out.println("Page Title: " + page.getPageTitle());
	}

	@Test(priority = 3, enabled = true)
	public void verifyImagesPageJSOUP() throws IOException {
		page.getInstance(BrokenLinksPage.class).verifyImagesPage();
		System.out.println("Page Title: " + page.getPageTitle());
	}
}
