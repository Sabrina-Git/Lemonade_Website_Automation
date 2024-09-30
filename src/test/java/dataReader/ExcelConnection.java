package dataReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelConnection {
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    public void excelRead() throws IOException {


        FileInputStream fis = new FileInputStream("C:\\Users\\sabri\\IdeaProjects\\Automation_Lemonade\\src\\test\\ExternalFiles\\Lemonade_TestData.xlsx");
        workbook = new XSSFWorkbook(fis); //open the workbook
        sheet = workbook.getSheet("Sheet1");

    }


    public String getCellData(int rowNum, int colNum) {
        Cell cell = sheet.getRow(rowNum).getCell(colNum);

        if (cell == null) {
            return "";
        }


        if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue().trim();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf((long) cell.getNumericCellValue());
        }

        return "";
    }

    public void closeWorkbook() throws IOException {
        workbook.close();
    }

    public static void main(String[] args) throws IOException {
        ExcelConnection excel = new ExcelConnection();


    }
}