package automationUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDatauUtils {

	public String FetchDataFromProperties( String key) throws IOException{
		FileInputStream fis = new FileInputStream("D:\\ABcA\\data.properties");
		Properties pop = new Properties();
		pop.load(fis);
		String Value =pop.getProperty(key);
		return Value;
	
		
}
	
	public String  FetchDataFromExcle(String sheetname, int rownNum,int columNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("D:\\ABcA\\New Microsoft Excel Worksheet.xlsx");
		Workbook book  = WorkbookFactory.create(fis);
		Cell cel =  book.getSheet(sheetname).getRow(rownNum).getCell(columNum);
		DataFormatter df = new DataFormatter();
		String Value = df.formatCellValue(cel);
		return Value;
	}
}