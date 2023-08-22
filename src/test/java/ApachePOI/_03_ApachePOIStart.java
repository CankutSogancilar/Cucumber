package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx"; //Path to the file we want to connect with

        FileInputStream fileInputStream=new FileInputStream(path); // Connection to the file
        Workbook workbook= WorkbookFactory.create(fileInputStream);

        Sheet sheet= workbook.getSheet("Sheet1");

        Row row1=sheet.getRow(0);
        Cell cell1=row1.getCell(0);
        System.out.println(cell1);

        Cell cell2=row1.getCell(1);
        System.out.println(cell2);

        Row row2=sheet.getRow(3);
        Cell cell3=row2.getCell(1);
        System.out.println(cell3);






    }
}
