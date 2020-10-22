package com.waltonbd.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryPage extends BasePage {
	
	@FindBy(id="firstName") 
	@CacheLookup
	WebElement firstName;
	
	@FindBy(how = How.ID, using="lastName") 
	@CacheLookup
	WebElement lastName;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"comments\"]") 
	WebElement comment;
	
	@FindBy(how = How.LINK_TEXT, using="Click Here") 
	@CacheLookup
	WebElement clickHere;
	

	public PageFactoryPage(WebDriver driver) {
		super(driver);
	}
	
	public void pageFunctions(String fName, String lName) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		clickHere.click();
	}

}
