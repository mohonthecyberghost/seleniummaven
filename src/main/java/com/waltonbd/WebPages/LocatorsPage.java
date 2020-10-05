package com.waltonbd.WebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class LocatorsPage extends BasePage {

	private By email = By.id("email");
	private By email1 = By.name("email");
	//private By email2 = By.tagName("input");
	private By forgotPass = By.linkText("Forgotten password?");
	
	private By searchField = By.name("q");
	private By gBtn = By.name("btnK");
	
	// Html Controls
	private By fName = By.id("firstName");
	private By gender = By.id("femalerb");
	private By language = By.id("englishchbx");
	private By rBtn = By.id("registerbtn");
	private By lText = By.partialLinkText("Click here");
	
	
	// Html Dropdowns
	private By singleSelect = By.id("course");
	private By multiSelect = By.id("ide");
	
	
	// Xpath Axes
	
	
	

	public LocatorsPage(WebDriver driver) {
		super(driver);
	}

	
	public void elementsOperation() {
		this.getElement(email1).sendKeys("abcd@gmail.com");
		this.getElement(forgotPass).click();	
		
		driver.navigate().to("http://google.com");
		this.getElement(searchField).sendKeys("hyr tutorials");
		this.getElement(gBtn).submit();
		driver.navigate().refresh();
		
		driver.navigate().back();
		
	}
	
	public void htmlControlsOperation() throws InterruptedException {
		this.getElement(fName).sendKeys("Sazzad");
		this.getElement(gender).click();
		this.getElement(language).click();
		this.getElement(rBtn).click();
		Thread.sleep(3000);
		this.getElement(lText).click();
		
	}
	
	public void htmlDropDownsOperation() throws InterruptedException {
		
		Select singleSelectDropDown =  new Select(this.getElement(singleSelect));
		singleSelectDropDown.selectByValue("python");
		
		Thread.sleep(3000);
		
	
		Select multipleSelectDropDown =  new Select(this.getElement(multiSelect));
		multipleSelectDropDown.selectByValue("ec");
		multipleSelectDropDown.selectByValue("vs");
		
		//List<WebElement> ideAvaialbe = multipleSelectDropDown.getOptions();
		List<WebElement> ideAvaialbe = multipleSelectDropDown.getAllSelectedOptions();
		
		System.out.println("Ides Available::");
		for(WebElement webElement : ideAvaialbe) {
			System.out.println(webElement.getText()+" "+webElement.isSelected());
		}
		
		//*[@id="navbtn_exercises"]
		
	}
	
	public void xpathOperation() throws InterruptedException {
		
		/*
		 * //input[@name='refreshbtn' and @value='Refresh']
		 * 
		 * //h1[text()='Register']
		 * 
		 * //div[text()='Sign in']
		 * 
		 * //div[contains(@class,'signin')]
		 * 
		 * //a[starts-with(text(),'Sign in in')]
		 * 
		 * //label[normalize-space(text())='First Name']
		 * 
		 * //label[text()='Email']/following-sibling::input[1]
		 * 
		 * //label[text()='Email']/following-sibling::input[1]/parent::div
		 * 
		 * //div[@class='container']/child::input[@type='text']
		 * 
		 * //td[text()='Maria Anders']/preceding-sibling::td/child::input
		 * 
		 * //div[@class='container']/descendant::button
		 * 
		 * //div[@class='buttons']/ancestor::div
		 * 
		 * //div[@class='buttons']/ancestor-or-self::div
		 * 
		 * //label[text()='Password']/following::input[1]
		 * 
		 */
		
		
		
		
		
	}

	
}
