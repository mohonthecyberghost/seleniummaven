package com.waltonbd.WebTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.waltonbd.WebPages.AboutPage;
import com.waltonbd.WebPages.CreateAndWriteExcel;
import com.waltonbd.WebPages.FramesPage;
import com.waltonbd.WebPages.ReadExcelFile;
import com.waltonbd.WebPages.WindowPage;

public class ExcelTest extends BaseTest {

	public ExcelTest(String url) {
		super("http://demo.guru99.com/test/login.html");
	}

	@Test(priority = 1, enabled = false)
	public void excelOperations() throws Exception {

		CreateAndWriteExcel excelTest = new CreateAndWriteExcel(driver);
		excelTest.readSheetData();
		
		excelTest.readExcelDataDriven();

	}
	
	
	@Test(priority = 2, enabled = true, dataProvider="testdata")
	public void DemoLogin(String username, String password) throws Exception {

		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("passwd")).sendKeys(password);
		driver.findElement(By.name("SubmitLogin")).click();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.findElement(By.className("error-copy")).getText().matches("Successfully Logged in..."), "Invalid credentials");
		System.out.println("Login Successful");

	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
		ReadExcelFile readExcelObj = new ReadExcelFile("./ExcelFiles/TestNew1.xlsx");
		
		int rows = readExcelObj.getRowCount(2);
		
		Object[][] credentials = new Object[rows][2];
		
		for (int i = 0; i < rows; i++) {
			credentials[i][0] = readExcelObj.getData(2,i,0);
			credentials[i][1] = readExcelObj.getData(2,i,1);
		}
		
		return credentials;
	}
	
	
	

	
}
