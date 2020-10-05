package com.waltonbd.WebPages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotsPage extends BasePage {

	private By navBtn = By.xpath("//a[@id='navbtn_exercises']");

	public ScreenshotsPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * @throws IOException 
	 * 
	 * 
	 */
	public void captureScreenshots() throws IOException {
		
		
		Utils.CaptureScreenShot(driver, "Image1.png", "FILE");
		this.getElement(navBtn).click();
		Utils.CaptureScreenShot(driver, "Image2.jpg", "BASE64");

		
		
	}

	
}
