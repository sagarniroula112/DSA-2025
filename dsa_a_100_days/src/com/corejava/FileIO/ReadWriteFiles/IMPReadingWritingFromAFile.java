package com.corejava.FileIO.ReadWriteFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IMPReadingWritingFromAFile {
    public static void main(String[] args) throws IOException {
        // System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
        try(BufferedReader brr = new BufferedReader(new FileReader("./dsa_a_100_days/src/com/corejava/FileIO/ReadWriteFiles/toread.txt"));
            BufferedWriter bww = new BufferedWriter(new FileWriter("./dsa_a_100_days/src/com/corejava/FileIO/ReadWriteFiles/towrite.txt"));
        ) {
            
            try {
                String text = null;
                while((text = brr.readLine()) != null) {
                    // String text = br.readLine();
                    System.out.println(text);
                    bww.write(text);  // writes a string not a character. please remember that.
                    bww.newLine();
                }
                
            } catch (IOException e) {
                System.out.println("Can't read the file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
