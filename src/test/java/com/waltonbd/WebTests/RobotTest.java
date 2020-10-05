package com.waltonbd.WebTests;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.RobotPage;

public class RobotTest extends BaseTest {

	public RobotTest(String url) {
		super("http://www.edureka.co");
	}

	@Test(priority = 1, enabled = false)
	public void openRobotsPage() {	

		Assert.assertEquals(page.getPageTitle(), "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka");
		System.out.println("Page Title: " + page.getPageTitle());

	}

	@Test(priority = 2, enabled=true)
	public void robotHandle() throws AWTException, InterruptedException {

		page.getInstance(RobotPage.class).robotHandle();;
		
	}

}
