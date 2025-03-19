package com.corejava.FileIO.ReadWriteFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do{
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            } while(i != -1);
        } catch(FileNotFoundException e) {
            System.out.println("Cannot open file.");
        } catch(IOException e) {
            System.out.println("Error reading file.");
        } finally {
           try{
            fin.close();
           } catch(IOException e) {
            System.out.println("Error closing file.");
           }
        }
    }
}
