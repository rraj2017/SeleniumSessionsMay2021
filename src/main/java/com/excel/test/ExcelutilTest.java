package com.excel.test;

import com.excel.util.Xls_Reader;

public class ExcelutilTest {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("./src/main/java/com/excel/util/testdata.xlsx");
		String sheetName ="login";
		System.out.println(reader.getCellData(sheetName, "username", 3));
		String data = reader.getCellData(sheetName, 0, 2);
		System.out.println(data);
		
		int rowCount = reader.getRowCount(sheetName);
		System.out.println("total rows :" +rowCount );
		
	//	reader.addColumn(sheetName, "Status");
		
		
		
		if(!reader.isSheetExist("Registration")) {
			reader.addSheet("Registration");
		}
		reader.setCellData(sheetName, "Status", 2, "PASS");
		System.out.println(reader.getColumnCount(sheetName));
	 //  reader.addColumn("Registration", "test");
	//	reader.removeColumn("Registration", 0);
		
		reader.removeColumn("Registration", 2);
	}//

}
