package com.datadriven.testing;

import com.excel.utility.Xls_Reader;

public class DataOperations {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\RAJESH 1\\eclipse-workspace\\SeleniumBasic\\src\\com\\testdata\\freeCrmTestData.xlsx");
		
        if(!reader.isSheetExist("Signup")) {
        	reader.addSheet("Signup");
        }
        
        int columnCount=reader.getColumnCount("testdata");
        System.out.println(columnCount);
        
        int rowNumber=reader.getCellRowNum("testdata", "lastname", "klopp");
        System.out.println(rowNumber);
	}
}
