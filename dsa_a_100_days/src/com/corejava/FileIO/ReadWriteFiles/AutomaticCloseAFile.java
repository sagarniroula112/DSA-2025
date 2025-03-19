package com.corejava.FileIO.ReadWriteFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutomaticCloseAFile {
    public static void main(String[] args) {
        int i;

        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // You don't need to close() explicitly, which means that you can't forget to close the file.
        // This is a key advantage of using try-with-resources.
        // Also remember that the resource is final, you can't change it.
        try(var fin = new FileInputStream(args[0])) {  // this resource will be automatically released after try block ends
            do {
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            } while(i != -1);
        } catch(FileNotFoundException e) {
            System.out.println("File not found.");
        } catch(IOException e) {
            System.out.println("An I/O error occured.");
        }
    }
}
