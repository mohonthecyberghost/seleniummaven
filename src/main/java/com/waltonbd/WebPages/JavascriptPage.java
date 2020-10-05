package com.waltonbd.WebPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptPage extends BasePage {

	
	JavascriptExecutor js = (JavascriptExecutor)driver;

	public JavascriptPage(WebDriver driver) {
		super(driver);
	}

	public void inputFieldValue() throws InterruptedException {

		js.executeScript("document.getElementById('email').value = 'sazzad.cseofkuet@gmail.com'");
		js.executeScript("document.getElementById('enterimg').click()");
		
		Thread.sleep(3000);
		
		// Navigate Page Bage
		js.executeScript("history.go(-1)");
		//js.executeScript("window.history.back()");
		
		js.executeScript("window.history.forward()");
		
		
		
	}
	
	
	public void pageScrolling(Boolean pageEnd) throws InterruptedException {
		
		js.executeScript("document.getElementById('email').value = 'sazzad.cseofkuet@gmail.com'");
		js.executeScript("document.getElementById('enterimg').click()");
		
		Thread.sleep(3000);
		
		// Page Refresh
		js.executeScript("history.go(0)");
		Thread.sleep(3000);

		if(pageEnd)
			js.executeScript("window.scroll(0,document.body.scrollHeight)");
		else
			js.executeScript("window.scroll(0,100)");
		
		
		Thread.sleep(3000);
		js.executeScript("document.getElementById('Skills').scrollIntoView()");
		
		//js.executeScript("$('#Skills')[0].scrollIntoView()");
		
		
	}
	
	
	

	
	

}
