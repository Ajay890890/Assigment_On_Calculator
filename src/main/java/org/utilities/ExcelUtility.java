package org.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public int getSingleCellValue(int rowNumber, int cellValue) throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream(
				"C://Users//Admin//Documents//Company assignment//Assignment001//src//test//resource//Exel Files//Data.xlsx");
		Workbook wk = WorkbookFactory.create(fs);
		Sheet sh = wk.getSheet("Data");
		Row row = sh.getRow(rowNumber);
		return (int) row.getCell(cellValue).getNumericCellValue();
	}
}
