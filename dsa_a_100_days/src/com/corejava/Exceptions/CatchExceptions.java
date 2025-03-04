package com.corejava.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CatchExceptions {
    public static void main(String[] args) {
        FileReader reader = null;
            try {
                reader = new FileReader("file.txt");
                var value = reader.read();
                
            }catch(IOException e){
                System.out.println("Could not read data."); // THis can catch IO or any of its derivates.
            } // This will get ignored as the first catch will run. Order of catch blocks sometimes matter.
            
            finally{  // Finally block will always get executed.
                if(reader != null){
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
}
