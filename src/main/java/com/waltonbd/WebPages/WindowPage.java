package com.waltonbd.WebPages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowPage extends BasePage {

	private By textfield = By.id("name");

	private By newWindowBtn = By.id("newWindowBtn");
	private By firstName = By.id("firstName");

	private By newTabBtn = By.id("newTabBtn");
	private By newWindowsBtn = By.id("newWindowsBtn");
//	private By newTabsBtn = By.id("newTabsBtn");
	private By newTabsWindowsBtn = By.id("newTabsWindowsBtn");

	public WindowPage(WebDriver driver) {
		super(driver);
	}

	public void openNewWindow() {

		String parentHandle = driver.getWindowHandle();

		this.getElement(newWindowBtn).click();
		System.out.println(parentHandle);

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				this.getElement(firstName).sendKeys("Sazzad");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				driver.close();
			}
		}

		driver.switchTo().window(parentHandle);
		this.getElement(textfield).sendKeys("Ready");
	}

	public void openNewTab() {

		String parentHandle = driver.getWindowHandle();

		this.getElement(newTabBtn).click();
		System.out.println(parentHandle);

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				this.getElement(firstName).sendKeys("Sazzad");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				driver.close();
			}
		}

		driver.switchTo().window(parentHandle);
		this.getElement(textfield).sendKeys("Ready");
	}
	
	

	

	
	
	
	
	public void openMultipleWindows() {

		String parentHandle = driver.getWindowHandle();

		this.getElement(newWindowsBtn).click();
		System.out.println(parentHandle);

		Set<String> handles = driver.getWindowHandles();
		
		By windowFirstName = By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[1]");
		
		


		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				if(this.getPageTitle().contains("XPath Practice")) 
					this.getElement(windowFirstName).sendKeys("Sazzad");
					
				else if(this.getPageTitle().contains("Basic Controls"))
					this.getElement(firstName).sendKeys("Sazzad");
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				driver.close();
			}
		}

		driver.switchTo().window(parentHandle);
		this.getElement(textfield).sendKeys("Ready");
	}
	
	public void openMultipleWindowsTabs() {

		String parentHandle = driver.getWindowHandle();

		this.getElement(newTabsWindowsBtn).click();
		System.out.println(parentHandle);

		Set<String> handles = driver.getWindowHandles();
		
		By windowFirstName = By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[1]");
		
		By contactFormName = By.id("ContactForm1_contact-form-name");


		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				if(this.getPageTitle().contains("XPath Practice")) 
					this.getElement(windowFirstName).sendKeys("Sazzad");
					
				else if(this.getPageTitle().contains("Basic Controls"))
					this.getElement(firstName).sendKeys("Sazzad");
				
				else if(this.getPageTitle().contains("Contact Me"))
					this.getElement(contactFormName).sendKeys("Sazzad");
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				driver.close();
			}
		}

		driver.switchTo().window(parentHandle);
		this.getElement(textfield).sendKeys("Ready");
	}
	

}
