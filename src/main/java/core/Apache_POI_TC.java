package core;
import core.PathParameters;


public class Apache_POI_TC {

	
public static void main(String[] args) throws Exception {
//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
ExcelUtils.setExcelFile(PathParameters.Path_TestData + PathParameters.File_TestData,"Sheet1");

ExcelUtils.setCellData("Pass", 1, 3);
System.out.println(ExcelUtils.getCellData(1,1));
 
    
  } //Main Method
} // Class
