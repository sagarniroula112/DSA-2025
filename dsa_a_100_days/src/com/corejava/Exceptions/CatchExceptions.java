package com.corejava.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CatchExceptions {
    public static void main(String[] args) {
        
            try {
                var reader = new FileReader("file.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        
    }
}
