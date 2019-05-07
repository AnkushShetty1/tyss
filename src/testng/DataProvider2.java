package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProvider2{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		String path="./data/DP.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		for(int i=1;i<sh.getPhysicalNumberOfRows();i++){
			for(int j=0;j<sh.getRow(0).getLastCellNum();j++) {
				
				System.out.println(sh.getRow(i).getCell(j));
			}
		}
	}
	

}
