package util;

public class ExcelUtilDemo {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		ExcelUitils excelUitils = new ExcelUitils(path +"\\excel\\data.xlsx", "Sheet1");

		excelUitils.getRowCount();
		
		excelUitils.getColoumnCount();

		excelUitils.getCellStringData(0, 0);

		excelUitils.getCellNumericData(1, 1);

	}

}
