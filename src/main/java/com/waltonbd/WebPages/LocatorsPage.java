package com.waltonbd.WebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	
	
	// Css Selectors
	
//	private By button = By.cssSelector("button");
	
	
	

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
		 * //input[@name='refreshbtn' and @value='Refresh']						// And Condition
		 * 	
		 * //h1[text()='Register']												// Text
		 * 
		 * //div[text()='Sign in']												// Text
		 * 
		 * //div[contains(@class,'signin')]										// Contains
		 * 
		 * //a[starts-with(text(),'Sign in in')]								// Starts With
		 * 
		 * //label[normalize-space(text())='First Name']						// Normalize Space
		 * 
		 * //label[text()='Email']/following-sibling::input[1]					// Following Sibling
		 * 
		 * //label[text()='Email']/following-sibling::input[1]/parent::div		// preceeding parent
		 * 
		 * //div[@class='container']/child::input[@type='text']					// Child
		 * 
		 * //td[text()='Maria Anders']/preceding-sibling::td/child::input		// Preceding Sibling
		 * 
		 * //div[@class='container']/descendant::button							// Descendant | forward
		 * 
		 * //div[@class='buttons']/ancestor::div								// Ancestor	| Backward				
		 * 
		 * //div[@class='buttons']/ancestor-or-self::div						// Ancestor including self
		 * 
		 * //label[text()='Password']/following::input[1]						// Following
		 * 
		 */
		
		
		
		
		
	}
	
	public void cssSelectorsOperation() throws InterruptedException {
		/**
		 * Four Types
		 * 
		 * 1. Simple selectors
		 * 		a. element
		 * 		b. id
		 * 		c. class
		 * 		d. universal
		 * 
		 * 2. Conditions and Pseudo-class selectors	
		 * 		a) and condition
		 * 		b) or condition
		 * 		c) not condition
		 * 		d) first-child
		 * 		e) last-child
		 * 		f) nth-child
		 * 		g) first-of-type
		 * 		h) last-of-type
		 * 		i) nth-of-type
		 * 
		 * 3. Combinator selectors
		 * 		a. Descendant 
		 * 		b. Child
		 * 		c. Adjacent Sibling
		 * 		e. General Sibling
		 * 
		 * 4. Attribute selectors
		 * 		a. Name
		 * 		b. Value
		 * 		c. Value with PartialText WholeWOrd
		 * 		d. Value with PartialText
		 * 		e. Value StartsWith WholeWord
		 * 		f. Value StartsWith Text
		 * 		g. Value EndsWith Text
		 */
		
		
		// 1. Simple Selectors
		System.out.println(driver.findElement(By.cssSelector("button")).getAttribute("id"));	// Simple Element
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Sazzad");					// Simple Id
		driver.findElement(By.cssSelector(".gender")).sendKeys("Male");							// Simple Class
		System.out.println(driver.findElement(By.cssSelector("*")).getSize()); 					// Simple Universal
		
		
		// 2. Conditions and Pseudo-class Selectors
		// a)	input[class='button'][type='button']
		// b)	button,input[type='button'],input[type='submit']
		// c)	input.button:not([type='button'])
		// d)	.container>:first-child
		// e)	.container>:last-child
		// f)	.container>:nth-child(7)
		// g) 	.container>br:first-of-type
		// h)	.container>br:last-of-type
		// i)	.container>br:nth-of-type(2)
		
		
		
		// 3. Combinator Selectors
		// a)	.container select
		// b)	.container>div>select
		// c)	input[placeholder='Verify your personal details']+select
		// d) 	input[placeholder='Verify your personal details']~br
		
				
		// 4. Attribute Selectos
		// a	input[placeholder]
		// b	input[placeholder='First Name']
		// c	input[placeholder~='question']
		// d	input[placeholder*='ques']
		// e	p[class|='my']
		// f	p[class^='my']
		// g	p[class$='lass']
		
		System.out.println(driver.findElements(By.cssSelector("input[placeholder]")).size());
		System.out.println(driver.findElements(By.cssSelector("input[placeholder='First Name']")).size());
		System.out.println(driver.findElements(By.cssSelector("iinput[placeholder~='question']")).size());
		System.out.println(driver.findElements(By.cssSelector("input[placeholder*='ques']")).size());
		System.out.println(driver.findElements(By.cssSelector("p[class|='my']")).size());
		System.out.println(driver.findElements(By.cssSelector("p[class^='my']")).size());
		System.out.println(driver.findElements(By.cssSelector("p[class$='lass']")).size());
		
		
		
		
		
		
	}

	
}
