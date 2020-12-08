package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven3 {
	Sheet sheet;
	//@BeforeMethod
	public void Before() throws IOException {
		File f = new File("D:\\WorkSpaces\\Subhangi\\Data_Driven_framework\\src\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
	}
	
	//@Test
	public void main() throws IOException {
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {	
			Cell cell = sheet.getRow(i).getCell(0);
		    cell.setCellType(Cell.CELL_TYPE_STRING);
		    System.out.println(cell.getStringCellValue());
			
		    cell = sheet.getRow(i).getCell(1);
		    cell.setCellType(Cell.CELL_TYPE_STRING);
		    System.out.println(cell.getStringCellValue());
			
			
		}
		
		
	}

}