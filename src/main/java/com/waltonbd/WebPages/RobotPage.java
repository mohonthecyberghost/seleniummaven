package com.waltonbd.WebPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RobotPage extends BasePage {

	private By linkText = By.linkText("Courses");

	public RobotPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Product Go Method
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void robotHandle() throws AWTException, InterruptedException {
		this.getElement(linkText).click();
		
		Robot robot = new Robot();
		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		
		System.out.println("A");
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		System.out.println("B");
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		System.out.println("C");
		
		robot.mouseMove(30, 100);
		System.out.println("D");
		
			

	}

	

}
