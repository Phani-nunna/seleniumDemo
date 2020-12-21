package util;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	@Test(dataProvider = "test1Data")
	public void test1(String username, String password,String name) {
		System.out.println(username + " | " + password);
	}

	@DataProvider(name = "test1Data")
	public Object[][] testData() {
		String path = System.getProperty("user.dir");
		Object[][] obj = testData(path + "\\excel\\data.xlsx", "Sheet1");
		return obj;
	}

	public static Object[][] testData(String excelPath, String sheetName) {
		ExcelUitils excelUitils = new ExcelUitils(excelPath, sheetName);

		int rowCnt = excelUitils.getRowCount();

		int colCnt = excelUitils.getColoumnCount();
		Object[][] objData = new Object[rowCnt - 1][colCnt];

		for (int i = 1; i < rowCnt; i++) {
			for (int j = 0; j < colCnt; j++) {
				String data = excelUitils.getCellStringData(i, j);
				 //System.out.print(data + " | ");
				objData[i - 1][j] = data;

			}
			 //System.out.println();

		}
		return objData;
	}

}
