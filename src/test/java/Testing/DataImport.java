package Testing;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataImport {
    private Workbook wB;


    public void readSpreadSheet(String filePath)
    {
        try {
            FileInputStream excelFile = new FileInputStream(new File(filePath));
            wB = new XSSFWorkbook(excelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String> readRow(int rowNum, String sheetName)
    {
        ArrayList<String> rowContents = new ArrayList<String>();
        Sheet dataTypeSheet =  wB.getSheet(sheetName);
        Row currentRow =   dataTypeSheet.getRow(rowNum);

        for (Cell currentCell : currentRow)
        {
            switch (currentCell.getCellTypeEnum())
            {
                case STRING:
                    rowContents.add(currentCell.getStringCellValue());
                    break;
                case NUMERIC:
                    rowContents.add(String.valueOf(currentCell.getNumericCellValue()));
                    break;
                case BOOLEAN:
                    rowContents.add(String.valueOf(currentCell.getBooleanCellValue()));
                    break;
                case BLANK:
                    rowContents.add(currentCell.getStringCellValue());
                    break;
                case _NONE:
                    System.out.println("No Value in cell");
                    break;
                case ERROR:
                    System.out.println("Error in cell");
                    break;
                case FORMULA:
                    rowContents.add(currentCell.getStringCellValue());
                    break;
            }
        }





        return rowContents;
    }




}
