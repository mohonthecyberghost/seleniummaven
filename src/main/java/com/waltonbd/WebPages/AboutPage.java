package com.waltonbd.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage extends BasePage{
	
	private By header = By.cssSelector("h1.wow");

	public AboutPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * @return the Page Header
	 */
	public String getAboutPageHeader() {
		return getElement(header).getText();
	}

}
