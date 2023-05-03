package automationUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestdataUtils {
public String Fatchdatafromproperties(String key) throws IOException {
	FileInputStream Fis = new FileInputStream("./Data storage/VtigerData.properties");
	Properties prop = new Properties();
	prop.load(Fis);
	String Value = prop.getProperty(key);
	return Value;
	
}

public String FatchdatafromExcel(String sheetName,int rowNum, int cellNum) throws IOException {
	FileInputStream fis = new FileInputStream("./Data storage/New Microsoft Excel Worksheet.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Cell cel = book.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
	DataFormatter df = new DataFormatter();
	String value =df.formatCellValue(cel);
	return value;
	
} 
	
}


