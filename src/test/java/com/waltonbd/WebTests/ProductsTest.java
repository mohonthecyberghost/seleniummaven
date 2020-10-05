package com.waltonbd.WebTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.ProductsPage;



public class ProductsTest extends BaseTest{
	

	public ProductsTest(String url) {
		super("https://waltonbd.com/");
	}
	
	
	@Test (priority=1)
	public void openProductPage() {
		page.getInstance(ProductsPage.class).gotoProductPage();
		
		//Refrigerator & Freezer
		
		Assert.assertEquals(page.getPageTitle(), "Refrigerator & Freezer");
		
		System.out.println("Page Title: "+page.getPageTitle());
	}

}
