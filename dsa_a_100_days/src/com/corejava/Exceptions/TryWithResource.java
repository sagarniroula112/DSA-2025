package com.corejava.Exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        
            try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");
            ) { // try statement with a resource, it will be closed by java compiler
                var value = reader.read();
                
            }catch(IOException e){
                System.out.println("Could not read data.");
            }
    }
}
