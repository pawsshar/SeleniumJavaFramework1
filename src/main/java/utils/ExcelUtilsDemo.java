package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		
		String projectPath = System.getProperty("user.dir");	
		Excelutils excel = new Excelutils(projectPath+"\\excel\\data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getNumericCellData(1, 1);
		
		
	}
	
}
