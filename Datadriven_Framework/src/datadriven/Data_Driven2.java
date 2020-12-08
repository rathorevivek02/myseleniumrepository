package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven2 {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\WorkSpaces\\Cetpa\\Datadriven_" + "Framework\\src\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(2);

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			System.out.println("Row:" + sheet.getLastRowNum());
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {

				Cell cell = sheet.getRow(i).getCell(j);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				System.out.println(cell.getStringCellValue() + "\t");
				
				System.out.println("Insert UN    i and j");
				System.out.println("Insert PWD");
				System.out.println("Insert Zip");
				System.out.println("Insert State");
				
				cell = sheet.getRow(i).getCell(j);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				System.out.println(cell.getStringCellValue());
				 
			}
		}
	}
}