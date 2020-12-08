package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\WorkSpaces\\Cetpa\\Datadriven_"
				+ "Framework\\src\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(2);
		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			
			Cell cell = sheet.getRow(i).getCell(0);
		    cell.setCellType(Cell.CELL_TYPE_STRING);
		    System.out.print(cell.getStringCellValue()+"\t");
			
		    cell = sheet.getRow(i).getCell(1);
		    cell.setCellType(Cell.CELL_TYPE_STRING);
		    System.out.println(cell.getStringCellValue());
		}			
	}
}