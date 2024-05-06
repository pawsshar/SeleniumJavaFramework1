package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	//we are initializing here because we have to use the same method in 2 main mwthod for that we have to make this as Public
	static String projectPath;
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;


	//we need to pass constructor to call excel functions 
	public Excelutils(String excelPath,String sheetName) {
		try {
			//	projectPath = System.getProperty("user.dir");		
			workBook = new XSSFWorkbook(excelPath);
			sheet = workBook.getSheet(sheetName);
		}
		catch(Exception exp) {
			exp.printStackTrace();
		}
	}

	public static void main(String[] args) {

		//calling getrowcount
		getRowCount();
		getCellDataString(0,0);
		getNumericCellData(1,1);
	}

	public static int getRowCount() {
		int rowCount=0;


		try {

			//we are giving path of the framework in projectpath beacuse location will be changed so we have to store somehere
			//			projectPath = System.getProperty("user.dir");
			//			//first we need to creat an object for xssf to use xlsx file
			//			workBook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			//
			//			//create reference for workbook
			//
			//			sheet = workBook.getSheet("Sheet1");
			//call row count function
			rowCount = sheet.getPhysicalNumberOfRows();


			System.out.println("The row count is :" +rowCount);


		}

		catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return rowCount;

	}
	//NOW WE HAVE TO SHOW The celldata: // we are declaring here the rowNum beacuse we will give dhynamic value from outside
	public static String getCellDataString(int rowNum, int colNum) {
		String cellData=null;
		try {

			//			projectPath = System.getProperty("user.dir");
			//			workBook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			//			sheet = workBook.getSheet("Sheet1");
			//
			//			//call function to set data
			//cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			DataFormatter formatter = new DataFormatter();
			cellData = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			System.out.println(cellData);

		}
		catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return cellData;


	}
	//getStringCellValue is only use to show string only we need to show the numeric value of cell also hence using numeric cell function
	public static void getNumericCellData(int rowNum, int colNum) {
		try {

			//			projectPath = System.getProperty("user.dir");
			//			workBook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			//			sheet = workBook.getSheet("Sheet1");

			//call function to set data
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("The cell data for sheet is : " +cellData);

		}
		catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}
	public static int getColCount() {

		int colCount=0;

		try {


			colCount = sheet.getRow(0).getPhysicalNumberOfCells();


			System.out.println("The row count is :" +colCount);

		}
		catch(Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return colCount;
	}
}
