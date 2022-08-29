package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility_class {
public static String getTD() throws Throwable {
	FileInputStream File = new FileInputStream("C:\\Users\\Ketan\\OneDrive\\Documents\\zerodha.xlsx");
	Sheet sh = WorkbookFactory.create(File).getSheet("ZERODHA");	
	String data = sh.getRow(0).getCell(0).getStringCellValue();
	return data;
	
	
}
}
