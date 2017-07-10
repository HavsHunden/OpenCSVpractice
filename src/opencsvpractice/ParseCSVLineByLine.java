/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencsvpractice;

import java.io.FileReader;
import java.util.Arrays;

import com.opencsv.CSVReader;

public class ParseCSVLineByLine {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
      //Build reader instance
        //Read data.csv
        //Default seperator is comma
        //Default quote character is double quote
        //Start reading from line number 2 (line numbers start from zero)
        CSVReader reader = new CSVReader(new FileReader("data.csv"), ',', '"', 0);

        //Read CSV line by line and use the string array as you want
        String[] nextLine;
        String[] dataLine;
        
        while ((dataLine = reader.readNext()) != null) {
            if (Integer.parseInt(dataLine[0]) == 2) {
                System.out.println(dataLine[1]);
            }
        }
        
//        while ((dataLine = reader.readNext()) != null) {
//            if ("2".equals(dataLine[0])) {
//                System.out.println(dataLine[1]);
//            }
//        }
        
//        while ((nextLine = reader.readNext()) != null) {
//            if (nextLine != null) {
//                //Verifying the read data here
//                //System.out.println(nextLine[1]);
//                System.out.println(Arrays.toString(nextLine));
//            }
//        }
    }
}
