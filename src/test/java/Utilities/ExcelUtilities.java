package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;

public class ExcelUtilities {
    public static ArrayList<ArrayList<String>> getDataFromExel(String path, String sheetName, int columnCount) {
        FileInputStream fileInputStream;
        Workbook workbook;
        try {
            fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet(sheetName);

        ArrayList<ArrayList<String>> returnList = new ArrayList<>(); // The sheet represents a 2D ArrayList

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> innerList = new ArrayList<>(); // Each row in the sheet represents inner lists
            for (int j = 0; j < columnCount; j++) {
                Cell cell = sheet.getRow(i).getCell(j); // Each cell represents elements of inner lists
                innerList.add(cell.toString());
            }
            returnList.add(innerList);
        }

        return returnList;

    }

    public static void writeInExcel(String path, Scenario scenario, LocalDateTime startTime, LocalDateTime endTime, Duration duration) {
        File file = new File(path);
        if (!file.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Campus Test Scenario Results");
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getName());
            cell = row.createCell(2);
            cell.setCellValue(scenario.getStatus().toString());
            cell = row.createCell(3);
            cell.setCellValue(startTime);
            cell = row.createCell(4);
            cell.setCellValue(endTime);
            cell = row.createCell(5);
            cell.setCellValue(duration.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                workbook.write(fileOutputStream);
                workbook.close();
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            FileInputStream fileInputStream;
            Workbook workbook=null;
            Sheet sheet = null;
            try {
                fileInputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(fileInputStream);
                sheet = workbook.getSheet("Campus Test Scenario Results");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            int rowCount = sheet.getPhysicalNumberOfRows();
            Row row = sheet.createRow(rowCount);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getName());
            cell = row.createCell(2);
            cell.setCellValue(scenario.getStatus().toString());
            cell = row.createCell(3);
            cell.setCellValue(startTime);
            cell = row.createCell(4);
            cell.setCellValue(endTime);
            cell = row.createCell(5);
            cell.setCellValue(duration.toString());

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                workbook.write(fileOutputStream);
                workbook.close();
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }


}