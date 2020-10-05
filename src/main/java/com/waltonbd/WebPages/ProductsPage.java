package com.waltonbd.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

	private By menu = By.id("dropdownMenu");
	private By submenu = By.cssSelector("li.dropdown-submenu:nth-child(1) > a:nth-child(1)");

	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Product Go Method
	 * 
	 */
	public void gotoProductPage() {
		this.getElement(menu).click();
		this.getElement(submenu).click();
		
	}
	
	

}
