package com.assignment.page;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class UtilityClass {

	public static String getData(int rowindex, int cellindex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./src/test/java/TestNGBasics/seleniumpracticeexcelfile.xlsx");
		String value = WorkbookFactory.create(file).getSheet("data").getRow(rowindex).getCell(cellindex)
				.getStringCellValue();
		return value;

	}
}
	
