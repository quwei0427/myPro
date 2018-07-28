package com.selenium.dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static Object[][] readDataFromExcel(String fileName, int indexSheet) {
		Object[][] dataObject = null;
		String path = TestReadExcel.class.getClassLoader().getResource(fileName).getPath();// 获取properties文件的路径
		Workbook wb =null;
		try {
			 wb = new XSSFWorkbook(new FileInputStream(path));
			Sheet sheet = wb.getSheetAt(indexSheet);
			int rownum = sheet.getLastRowNum();//获取行数rownum这里的rownum从0开始，所以真正的行数是rownum+1
			int cellnum = sheet.getRow(rownum).getLastCellNum();//获取列数cellnum
//			System.out.println("rownum:" + rownum);
//			System.out.println("cellnum:" + cellnum);
			dataObject = new Object[rownum][cellnum];//rownum 从0开始的，把第一行去掉 ，所以就不用加1 ，假如要包含第一行那么这里应该写rownum+1
			System.out.println(wb.getSheetName(indexSheet));
			int i = 0;//表示行的下标值，因为要作为数组的下标组，所以从0开始 
			for (Row row : sheet) {
				int k = 0;//表示列的下标值
//				System.out.println("rownum: " + row.getRowNum());
				if (i > 0) {//要把第一行过滤掉，所以i从1开始的
					for (Cell cell : row) {
						String str = String.valueOf(cell);
//						System.out.println("str1:"+i+":"+k+":"+str);
						dataObject[i-1][k] = str;//因为i从1开始的，所以下标值要减1
						k++;
					}					
				}
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				wb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dataObject;
	}

	public static void main(String[] args) {
		Object[][] data=ReadExcel.readDataFromExcel("ecshop.xlsx", 0);
		for (int i = 0; i < data.length; i++) {
			for (int k = 0; k < data[data.length - 1].length; k++) {
				System.out.println(i+":"+k+":"+data[i][k]);
			}
		}
		
	}

}
