package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteinDifferentRow {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/WriteIntoAnExcelFile.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

        int rowCount=sheet.getPhysicalNumberOfRows();

        Row row = sheet.createRow(rowCount);
        for (int i = 0; i < 10; i++) {
            Cell cell= row.createCell(i);
            cell.setCellValue("Hello Batch 8");
        }

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        fileInputStream.close();


    }
}
