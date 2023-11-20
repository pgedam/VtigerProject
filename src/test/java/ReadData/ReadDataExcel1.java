package ReadData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//To read data from external resource
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Data1.xlsx");
		
		//To read data from excel
		Workbook wb = WorkbookFactory.create(fis);
		
		//To get control of the sheet
		 Sheet sh =wb.getSheet("Sheet1");
		 
		 //To get control of the row
		 Row rw = sh.getRow(2);
		 //To get control of the column
		 Cell cl = rw.getCell(0);
		 
		 //To get the value of the cell
		 String data = cl.getStringCellValue();
		 System.out.println(data);
		 
		 
		
		

	}

}
