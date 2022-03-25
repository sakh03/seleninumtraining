package OrangeHRM_Login;

import java.io.FileInputStream;

public class signin_fromExcel {
	private static Sheet ExcelWSheet;
	private static Workbook ExcelWBook;

	// This method is to read the test data from the Excel
	public String[][] getExcelData(String fileName, String sheetName)
			throws EncryptedDocumentException, IOException, IllegalFormatException {
		String[][] arrayExcelData = null;
		FileInputStream ExcelFile = new FileInputStream(fileName);
		ExcelWBook = WorkbookFactory.create(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		// System.out.println(ExcelWSheet);
		int totalNoOfRows = ExcelWSheet.getLastRowNum();
		int totalNoOfCols_0 = ExcelWSheet.getRow(0).getLastCellNum();
		arrayExcelData = new String[totalNoOfRows][totalNoOfCols_0];
		for (int i = 0; i < totalNoOfRows; i++) {
			int totalNoOfCols = ExcelWSheet.getRow(i).getLastCellNum();
			// arrayExcelData = new String [totalNoOfRows][totalNoOfCols];
			for (int j = 0; j < totalNoOfCols; j++) {
				arrayExcelData[i][j] = ExcelWSheet.getRow(i + 1).getCell(j).getStringCellValue();
				// System.out.println(arrayExcelData[i][j]);
			}
		}
		System.out.println(arrayExcelData);
		return arrayExcelData;
	}

}
