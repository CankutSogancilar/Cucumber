package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _05_GetAllDataFromExcel {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook.getSheetAt(0);

        int numberOfRows= sheet.getPhysicalNumberOfRows(); // zoo.length gibi

//        for (int i = 0; i < numberOfRows; i++) {
//            Row row=sheet.getRow(i);
//            int numberOfCells=row.getPhysicalNumberOfCells();//zoo[i].length gibi
//            for (int j = 0; j <numberOfCells ; j++) {
//                Cell cell=row.getCell(j);
//                System.out.println(cell+" ");
//            }
//            System.out.println();
//            System.out.println("...............................");
//        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.println(sheet.getRow(i).getCell(j)+" ");
            }
            System.out.println();
            System.out.println("...............................");
        }


    }
}
