package com.waltonbd.WebPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class CreateAndWriteExcel extends BasePage {

	public HSSFWorkbook workbook;
	public XSSFWorkbook workbook1;
	public HSSFSheet sheet;
	public XSSFSheet sheet1;

	public CreateAndWriteExcel(WebDriver driver) {
		super(driver);

	}

	public void createSheet() throws IOException {
		workbook = new HSSFWorkbook();
		sheet = workbook.createSheet("TestSheet");

		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Sazzad's");
		sheet.getRow(1).createCell(1).setCellValue("Selenium Tutorial");

		File file = new File("./ExcelFiles/Test1.xls");

		// FileOutputStream fos = new FileOutputStream(file);
		// workbook.write(fos);

		workbook.write(file);

		workbook.close();
	}

	public void createSheetNew() throws IOException {
		workbook1 = new XSSFWorkbook();
		sheet1 = workbook1.createSheet("TestSheet");

		sheet1.createRow(0);
		sheet1.getRow(0).createCell(0).setCellValue("Hello");
		sheet1.getRow(0).createCell(1).setCellValue("World");

		sheet1.createRow(1);
		sheet1.getRow(1).createCell(0).setCellValue("Sazzad's");
		sheet1.getRow(1).createCell(1).setCellValue("Selenium Tutorial");

		File file = new File("./ExcelFiles/TestNew1.xlsx");

		FileOutputStream fos = new FileOutputStream(file);

		workbook1.write(fos);

		workbook1.close();
	}

	public void readSheetData() throws Exception {
		File file = new File("./ExcelFiles/TestNew1.xlsx");
		FileInputStream fis = new FileInputStream(file);

		workbook1 = new XSSFWorkbook(fis);
		sheet1 = workbook1.getSheetAt(0);
		String cellvalue = sheet1.getRow(0).getCell(0).getStringCellValue();

		System.out.println(cellvalue);
		
		sheet1 = workbook1.getSheetAt(1);

		int rowCount = sheet1.getPhysicalNumberOfRows();

		for (int i = 0; i < rowCount; i++) {
			XSSFRow row = sheet1.getRow(i);
			
			int cellCount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.print("||\t"+getCellValue(cell));
			}
			System.out.println();
		}
		
		
		
	}

	public static String getCellValue(XSSFCell cell) {
		switch (cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
		default:
			return cell.getStringCellValue();
		}
	}
	
	
	public void readExcelDataDriven() {
		ReadExcelFile readExcelObj = new ReadExcelFile("./ExcelFiles/TestNew1.xlsx");
		System.out.println("Data driven Output:");
		System.out.println();
		System.out.println(readExcelObj.getData(0, 1, 0));
	}

}
