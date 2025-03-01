package utilities;

//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSdata {

	public static void main(String[] args) throws IOException {

		ReadXLSdata read = new ReadXLSdata();
		read.getData("login");
	}

	public String[][] getData(String excelSheetName) throws IOException {
//		File file = new File("./src/test/resources/testdata/testdata.xlsx");

		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/testdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet(excelSheetName);

		int totalRows = sheet.getLastRowNum();
		System.out.println("Total rows: " + totalRows);

		Row rowCells = sheet.getRow(0);
		int totalCols = rowCells.getLastCellNum();
		System.out.println("Total cols: " + totalCols);

		DataFormatter format = new DataFormatter();

		String[][] testData = new String[totalRows][totalCols];
		// Iterating rows
		for (int i = 1; i <= totalRows; i++) {
			// Iterating Columns
			for (int j = 0; j < totalCols; j++) {
				testData[i - 1][j] = format.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(testData[i - 1][j]);
			}
		}

		return testData;
	}
}
