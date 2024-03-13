package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Output {

	public static void Excel(String CarName, String CabPrice) throws IOException{           
		   FileOutputStream File= new FileOutputStream(System.getProperty("user.dir")+"\\excelresult\\carinfo.xlsx");
		   XSSFWorkbook workbook=new XSSFWorkbook();
		   XSSFSheet sheet =workbook.createSheet("make my trip");
		   XSSFRow row=sheet.createRow(0);
		   XSSFRow row1 = sheet.createRow(1);
		   row.createCell(0).setCellValue("Cab Name");
		   row.createCell(1).setCellValue("Cab Price");
		   row1.createCell(0).setCellValue(CarName);
		   row1.createCell(1).setCellValue(CabPrice);

			workbook.write(File);
			System.out.println("Printed Succesfully in Excel");
			workbook.close();
			File.close();

	   }
	
	
}
