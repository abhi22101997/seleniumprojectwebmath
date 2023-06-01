package TestNGBasics;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void main(String[] args) throws IOException {
		String filepath= "./src/test/java/TestNGBasics/seleniumpracticeexcelfile.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(filepath);
		XSSFSheet sheet= wb.getSheet("data");
		int rowcount= sheet.getPhysicalNumberOfRows();
		int colcount=sheet.getRow(0).getLastCellNum();
		for(int row=0;row<rowcount;row++) {
			for(int col=0;col<colcount;col++) {
				System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
				//run perfect
			}
		}
	}

}
