package OrangeHRM_Login;

import readExcel;

public class ExcelWBook extends readExcel {
	@DataProvider(name = "LoginExcelData")
	public Object[][] ReadDataFromExcel() throws Exception{
		ReadExcel excel = new ReadExcel();
		//String RelativePath = System.getProperty("user.dir");
		Object[][] testObjArray = excel.getExcelData("C:\\Users\\adixit\\git\\abhikdixit-Maven_Selenium_WebDriver_4\\Maven_Selenium_WebDriver_4\\OrangeHRM_TestData.xls","Login");
		//Object[][] testObjArray = excel.getExcelData(RelativePath+"\\OrangeHRM_TestData.xls","SignIn");
		System.out.println(testObjArray);
		return testObjArray;

	}
}
