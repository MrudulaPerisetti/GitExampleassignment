package com.SeleniumPractice;
import org.testng.annotations.Test;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class CSVSelenium {
    @Test
    public void readCSV() throws IOException {
        String path = "C:\\Users\\PE20306376\\Desktop\\File.csv\\";
        Reader reader = Files.newBufferedReader(Paths.get(path));
        CSVParser parse = new CSVParser(reader, CSVFormat.DEFAULT);
        for (CSVRecord csvRecord : parse) {
            String firstname = csvRecord.get(0);
            String lastName = csvRecord.get(1);
            String company = csvRecord.get(2);
            System.out.println("Record No : " + csvRecord.getRecordNumber());
             
            System.out.println("FirstName : " + firstname);
            System.out.println("MiddleName : " + lastName);
            System.out.println("LastName : " + company);
     
 
        }
    }
}