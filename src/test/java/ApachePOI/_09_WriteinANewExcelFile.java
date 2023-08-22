package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_WriteinANewExcelFile {
    public static void main(String[] args) throws IOException {

        String path= "src/test/java/ApachePOI/Resources/WriteIntoANewExcelFile.xlsx";

        // We dont use FileInputStream because there isnt a file to connect with.
        // Instead we create a file in the memory and a sheet in that file.

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("OurSheet");

        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Batch 8");

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();


    }
}
