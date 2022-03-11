package com.training.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingWriting {

    public static void main(String a[]){
    	
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "C:\\Users\\Vivek\\Desktop\\Neeru Learning\\Neeru1.txt";
             FileWriter fw = new FileWriter(filename,true); 
             //appends the string to the file
             fw.write("Traning Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Vivek\\Desktop\\Neeru Learning\\Neeru1.txt"));
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();                          
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }

}
