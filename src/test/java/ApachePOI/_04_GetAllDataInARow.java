package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_GetAllDataInARow {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";


        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

        Row row= sheet.getRow(1); // zoo[1] gibi

        for (int i = 0; i < 4; i++) {
            System.out.println(row.getCell(i));
        }

    }
}
