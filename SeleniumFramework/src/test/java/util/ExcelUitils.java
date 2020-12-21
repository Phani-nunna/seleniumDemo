package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUitils {
	XSSFWorkbook workbook = null;
	XSSFSheet sheet = null;

	public ExcelUitils(String path, String sheetName) {
		try {
			workbook = new XSSFWorkbook(path);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getRowCount() {
		int rwCnt = sheet.getPhysicalNumberOfRows();
		System.out.println("row count " + rwCnt);
		return rwCnt;
	}

	public int getColoumnCount() {
		int colCnt = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Cell count " + colCnt);

		return colCnt;
	}

	public String getCellStringData(int rowNum, int colNum) {
		String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		// System.out.println("phani cellSringValue "+cellData);
		return cellData;
	}

	public double getCellNumericData(int rowNum, int colNum) {
		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		// System.out.println("phani cellNumericData "+cellData);
		return cellData;

	}

}
