package com.waltonbd.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FramesPage extends BasePage {

	private By textfield = By.id("name");
	private By courseDD = By.id("course");

	public FramesPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Product Go Method
	 * 
	 */
	public void inputText() {
		this.getElement(textfield).sendKeys("Hello");

	}

	public void selectCourse() {

		driver.switchTo().frame(driver.findElement(By.id("frm1")));

		Select courseSelectItem = new Select(this.getElement(courseDD));
		courseSelectItem.selectByVisibleText("Java");

		driver.switchTo().defaultContent();
		this.getElement(textfield).sendKeys("World");
	}

	public void selectNestedCourse() {
		

		driver.switchTo().frame(("frm3"));
		driver.switchTo().frame(("frm1"));

		Select courseSelectItem = new Select(this.getElement(courseDD));
		courseSelectItem.selectByVisibleText("Java");

		this.driver.switchTo().parentFrame();
		this.getElement(textfield).clear();
		this.getElement(textfield).sendKeys("Frame 3");
		
		driver.switchTo().defaultContent();
		this.getElement(textfield).sendKeys("Main WebPage");
	}

}
