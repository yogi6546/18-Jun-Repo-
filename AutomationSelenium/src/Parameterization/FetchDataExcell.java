package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataExcell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream File = new FileInputStream ("C:\\Users\\User\\Downloads\\Velocity Class.xlsx");
	
	double Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
	System.out.println(Data);
	
	//boolean bl = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
	//System.out.println(bl);
	
	
	
	
	
}
}
