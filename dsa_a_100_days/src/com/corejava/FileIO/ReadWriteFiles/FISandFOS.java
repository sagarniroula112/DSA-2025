package com.corejava.FileIO.ReadWriteFiles;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISandFOS {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./dsa_a_100_days/src/com/corejava/FileIO/ReadWriteFiles/toread.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./dsa_a_100_days/src/com/corejava/FileIO/ReadWriteFiles/towrite.txt"));
        int n;

        try {
            while((n=bis.read()) != -1){  // read() method returns an integer value
                if (n == '\n' || n == '\r') {
                    bos.write(n);
                    continue;  // Skip newline characters
                }
                bos.write(n);
                System.out.println((char) n);
            }
            bos.flush();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        bis.close();
        bos.close();
    }
}
