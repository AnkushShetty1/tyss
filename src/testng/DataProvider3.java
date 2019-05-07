package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProvider3 {
	@DataProvider
	public String[][] run() throws EncryptedDocumentException, IOException{
		String[][] s=null;
		String path="./data/DP.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("Sheet1");
		 s=new String[sh.getPhysicalNumberOfRows()-1][sh.getRow(1).getLastCellNum()];
		 
		 for(int i=1;i<sh.getPhysicalNumberOfRows();i++) {
			 for(int j=0;j<sh.getRow(0).getLastCellNum();j++) {
				 String val=sh.getRow(i).getCell(j).toString();
				 s[i-1][j]=val;
			 }
		 }
		return s;
	}

}
