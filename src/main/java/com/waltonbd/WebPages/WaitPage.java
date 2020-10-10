package com.waltonbd.WebPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaitPage extends BasePage {

	private By btn1 = By.id("btn1");
	private By txt1 = By.id("txt1");
	
	private By btn2 = By.id("course");

	public WaitPage(WebDriver driver) {
		super(driver);
		
		
	}

	/**
	 * Product Go Method
	 * 
	 */
	public void inputText() {
		this.getElement(btn1).click();
		this.getElement(txt1).sendKeys("Hello");
	}

	

}
