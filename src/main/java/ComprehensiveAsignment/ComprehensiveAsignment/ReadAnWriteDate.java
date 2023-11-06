package ComprehensiveAsignment.ComprehensiveAsignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAnWriteDate {

	public static void main(String args[]) throws IOException
	{
		File f = new File("C:/Users/DELL/OneDrive/Desktop/ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelWorkbook.getSheetAt(0);
		int rows = excelSheet.getPhysicalNumberOfRows();//3
		int cols = excelSheet.getRow(0).getPhysicalNumberOfCells();//2
		String data[][]= new String[rows][cols];
		XSSFCell cell;
		for(int i =0 ; i< rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				cell = excelSheet.getRow(i).getCell(j);
				String cellContents=cell.getStringCellValue();
				data[i][j] = cellContents;
				System.out.println(data[i][j]);
			}
		}
		fis.close();
	}


}
