package com.selenium.dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestReadExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String path=TestReadExcel.class.getClassLoader().getResource("ecshop.xlsx").getPath();//获取ecshop.xlsx文件的路径
		 try (Workbook wb = new XSSFWorkbook(new FileInputStream(path))) {
//	            for (int i = 0; i < wb.getNumberOfSheets(); i++) {
	                Sheet sheet = wb.getSheetAt(0);
	                int rownum=sheet.getLastRowNum();
	                int cellnum=sheet.getRow(rownum).getLastCellNum();
	                System.out.println("rownum:"+rownum);
	                System.out.println("cellnum:"+cellnum);
	                System.out.println(wb.getSheetName(0));
	                for (Row row : sheet) {
	                    System.out.println("rownum: " + row.getRowNum());
	                    for (Cell cell : row) {
	                        System.out.println(cell);
	                    }
	                }
	            }
//	        }
	}

}
