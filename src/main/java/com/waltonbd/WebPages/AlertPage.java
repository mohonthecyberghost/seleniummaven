package com.waltonbd.WebPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage {

	private By simpleAlertClickBtn = By.id("alertBox");
	private By confirmAlertClickBtn = By.id("confirmBox");
	private By promptAlertClickBtn = By.id("promptBox");

	private By outputAlertLabel = By.id("output");

	public AlertPage(WebDriver driver) {
		super(driver);
	}

	public void simpleAlertHandle() {

		this.getElement(simpleAlertClickBtn).click();
		Alert simpleAlert = driver.switchTo().alert();
		
		System.out.println(simpleAlert.getText());
		
		
		
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		simpleAlert.accept();
		
	}
	
	
	public void confirmationAlertHandle() {

		this.getElement(confirmAlertClickBtn).click();
		Alert confirmAlert = driver.switchTo().alert();
		
		System.out.println(confirmAlert.getText());
		
		
		
		confirmAlert.dismiss();
		
		String labelText = this.getElement(outputAlertLabel).getText();
		System.out.println(labelText);
		
	}
	
	
	public void promptAlertHandle() {

		this.getElement(promptAlertClickBtn).click();
		Alert promptAlert = driver.switchTo().alert();
		
		System.out.println(promptAlert.getText());
		
		promptAlert.sendKeys("Sazzad Ahmmed Mohon");
		
		
		promptAlert.accept();
		
		String labelText = this.getElement(outputAlertLabel).getText();
		System.out.println(labelText);
		
	}

	
	

}
