package org.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	
	public String getSpecificValue(int cellRow,int cellNumber,String sheetName) throws EncryptedDocumentException, IOException {	
		FileInputStream fis=new FileInputStream("A://cmd prg//Cucumber_ActiTime//src//test//resources//ExcelFile//Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(cellRow).getCell(cellNumber).getStringCellValue();
		
	}
	public List getRowValues(String sheetName,int rowNumber, int cellRow) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("A://cmd prg//Cucumber_ActiTime//src//test//resources//ExcelFile//Data.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet(sheetName);
	Row r1=sheet.getRow(rowNumber);
	List<String> ls=new ArrayList<String>();
	
	for(int i=0;i<sheet.getRow(rowNumber).getLastCellNum();i++) {
		ls.add(r1.getCell(i).getStringCellValue());
	}
	return ls;
	
	
	
	}
}


